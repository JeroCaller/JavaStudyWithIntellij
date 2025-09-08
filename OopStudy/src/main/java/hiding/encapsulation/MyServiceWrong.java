package hiding.encapsulation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyServiceWrong {

    public void init() {
        log.info("서비스 제공을 위한 시스템 초기화.");
    }

    public void createProduct() {
        log.info("상품 제작 중...");
    }

    public void release() {
        log.info("제작된 상품을 고객에게 공개합니다.");
    }
}
