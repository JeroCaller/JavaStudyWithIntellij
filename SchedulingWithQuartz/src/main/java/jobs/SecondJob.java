package jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;

@Slf4j
@PersistJobDataAfterExecution  // JobData update 시 필수
public class SecondJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // JobDetail 객체의 usingJobData() 메서드에 입력한 데이터 맵을 가져온다.
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        // JobDataMap에서 key가 "counter"인 값을 가져온다.
        int counter = dataMap.getInt("counter");

        log.info("{}번째 세컨 잡 실행", counter);
        ++counter;

        // JobDataMap에 "counter"값을 갱신한다.
        dataMap.put("counter", counter);
    }
}
