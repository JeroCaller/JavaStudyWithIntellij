package hiding.type.upcasting.impl;

import hiding.type.upcasting.Animal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatImpl implements Animal {

    @Override
    public void speak() {
        log.info("고양이가 웁니다. 냐옹!");
    }
}
