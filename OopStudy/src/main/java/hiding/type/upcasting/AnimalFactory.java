package hiding.type.upcasting;

import hiding.type.upcasting.impl.CatImpl;
import hiding.type.upcasting.impl.DogImpl;

/**
 * <p>참고) 객체 생성을 직접하지 않고 팩토리에 위임하는 이유</p>
 * <ul>
 *     <li>
 *         객체를 다른 타입의 객체에 직접 생성하는 행위는 그 자체로 두 객체 간 결합도를 높이기에
 *         이를 방지하고자 함.
 *     </li>
 *     <li>
 *         객체 생성자 메서드가 받아들이는 파리미터의 타입 또는 개수에 변동을 줘야 하는 경우,
 *         객체를 팩토리 없이 직접 생성한 경우 프로젝트 전체에서 해당 코드들을 일일이 찾아가면서
 *         수정해줘야 한다. 하지만 객체 생성을 팩토리에 따로 위임한 경우 팩토리 객체에서만
 *         수정해주면 된다. 즉, 객체 생성 과정에 수정이 필요한 경우 유용하다.
 *         이로 인해 팩토리는 그 자체로 객체 생성에 대해 재사용 가능한 모듈이 된다.
 *     </li>
 *     <li>
 *         경우에 따라 구현 객체 타입을 달리 하여 생성해야 할 경우, if-else문 또는 switch문을 통해
 *         각 경우마다 다른 객체 타입을 생성하도록 할 것인데, 이것도 객체 타입이 많거나
 *         객체 생성 로직이 길어질 경우 객체 생성 코드도 덩달아 커진다. 따라서 해당 객체를 생성하여
 *         사용하는 클라이언트의 입장에서는 비즈니스 로직뿐만 아니라 객체 생성이란 책임도 떠맡아야 한다.
 *         이는 단일 책인 원칙(SRP)에 위배된다.
 *         팩토리 패턴 사용 시 이러한 경우에 따른 객체 생성 로직을 팩토리가 따로 담당하기 때문에
 *         SRP 원칙을 지킬 수 있게 된다.
 *     </li>
 * </ul>
 * <p>
 *     한 편, 팩토리는 다른 구현 객체(팩토리 패턴에서는 product라고 부른다)를 생성, 반환하는
 *     작업만을 담당하지, 팩토리 객체 그 자체는 그 외 다른 일을 하지 않는다. 따라서 팩토리 객체는
 *     그 자체로 여러 개 생성될 필요가 없으므로 되도록 싱글톤으로 구현한다.
 * </p>
 */
public class AnimalFactory {

    private static final AnimalFactory animalFactory = new AnimalFactory();

    public static AnimalFactory getInstance() {
        return animalFactory;
    }

    private AnimalFactory() {}

    public Animal getDog() {
        // 필요한 경우, 객체 생성 후 설정을 하거나 다른 작업을 한 후 해당 객체를 반환하게 할 수도 있음.
        return new DogImpl();
    }

    public Animal getCat() {
        return new CatImpl();
    }
}
