package executer.impl;

import executer.Executer;
import hiding.concrete.ServiceSystem;
import hiding.concrete.impl.MyServiceWithSystem;
import hiding.encapsulation.MyServiceEnCapsulated;
import hiding.encapsulation.MyServiceWrong;

public class MyServiceExecuterImpl implements Executer {

    @Override
    public void execute() {
        //exampleMyServiceWrong();
        //exampleMyServiceEncapsulated();
        exampleMyServiceHidingImplementation();
    }

    /**
     * <p>
     *     순차적으로 진행되어야 하는 각 메서드들이 모두 public으로 공개되어 있어
     *     클라이언트 입장에서는 어떤 메서드를 먼저 호출해야할지 알기 힘들다.
     * </p>
     */
    private void exampleMyServiceWrong() {
        MyServiceWrong myServiceWrong = new MyServiceWrong();
        myServiceWrong.init();
        myServiceWrong.createProduct();
        myServiceWrong.release();
    }

    /**
     * <p>
     *     그룹 지어져 순차적으로 실행되어야 하는 메서드들이 private로 외부로부터 은닉한 뒤,
     *     이들을 하나로 묶어 순차적으로 실행시키는 공개 메서드만을 제공함으로써
     *     클라이언트 입장에서는 혼란의 여지를 없앨 수 있으며,
     *     객체 내에서도 private보다 public 메서드가 더 우선순위에 있음을 암시할 수 있다.
     * </p>
     */
    private void exampleMyServiceEncapsulated() {
        MyServiceEnCapsulated myServiceEnCapsulated = new MyServiceEnCapsulated();
        myServiceEnCapsulated.getService();
    }

    /**
     * <p>
     *     구현 은닉
     * </p>
     * <p>
     *     공개 메서드를 은닉 메서드로부터 구분짓고 통합 관리하기 위해 
     *     메서드를 추상화하기 위한 인터페이스를 사용하도록 한다. 
     * </p>
     * <p>
     *     인터페이스와 이의 구현체의 개념을 통해 다형성을 이용하여 
     *     같은 형태의 API에 각기 다른 기능을 할 수 있도록 다양한 구현체를 만들 수 있다. 
     *     또한 클라이언트 입장에서는 구현체의 구현 부분을 알 필요도 없기에 편리하게 
     *     외부 기능을 사용할 수 있다. 
     * </p>
     */
    private void exampleMyServiceHidingImplementation() {
        ServiceSystem serviceSystem = new MyServiceWithSystem();
        serviceSystem.getService();
    }
}
