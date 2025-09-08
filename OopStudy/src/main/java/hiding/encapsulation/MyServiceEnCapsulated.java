package hiding.encapsulation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyServiceEnCapsulated {

    private void init() {
        log.info("서비스 제공을 위한 시스템 초기화.");
    }

    private void createProduct() {
        log.info("상품 제작 중...");
    }

    private void release() {
        log.info("제작된 상품을 고객에게 공개합니다.");
    }

    public void getService() {
        log.info("서비스 제공 프로세스 시작.");
        init();
        createProduct();
        release();
        log.info("서비스 제공 프로세스 완료.");
    }
}
