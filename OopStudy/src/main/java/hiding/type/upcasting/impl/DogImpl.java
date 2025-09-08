package hiding.type.upcasting.impl;

import hiding.type.upcasting.Animal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogImpl implements Animal {

    @Override
    public void speak() {
        log.info("개가 짖습니다. 월월!");
    }
}
