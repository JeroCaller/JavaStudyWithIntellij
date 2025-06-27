/**
 * <p>
 *     순수 자바 애플리케이션에서 Quartz 라이브러리 사용 방법 살펴보기.
 * </p>
 */

import jobs.FirstJob;
import jobs.SecondJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

@Slf4j
public class Main {

    public static void main(String[] args) {
        System.out.println("main 메서드 시작.");

        JobDetail firstJob = JobBuilder.newJob(FirstJob.class)
            .withIdentity("firstJob", "group1")
            .build();

        Trigger firstJobTrigger = TriggerBuilder.newTrigger()
            .withIdentity("firstTrigger", "group1")
            .startNow()
            .withSchedule(
                SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(1)
                    .withRepeatCount(10)
            )
            .build();

        JobDetail secondJob = JobBuilder.newJob(SecondJob.class)
            .withIdentity("secondJob", "group2")
            .usingJobData("counter", 1)
            .build();

        Trigger secondJobTrigger = TriggerBuilder.newTrigger()
            .withIdentity("secondTrigger", "group2")
            .startNow()
            .withSchedule(
                SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(1)
                    .withRepeatCount(10)
            )
            .build();

        try {
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(firstJob, firstJobTrigger);
            scheduler.scheduleJob(secondJob, secondJobTrigger);
            //scheduler.shutdown(true);
        } catch (SchedulerException e) {
            log.info("====== 스케줄링 작업 중 예외가 발생했습니다. =====");
            e.printStackTrace();
        }
    }
}
