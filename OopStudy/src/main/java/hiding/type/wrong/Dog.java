package hiding.type.wrong;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog {
    public void speak() {
        log.info("개가 짖습니다. 월월!");
    }
}
