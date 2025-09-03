import inheritance.MySet;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();

        mySet.addAll(Arrays.asList(1, 2, 3));
        mySet.add(10);

        log.info(mySet.toString());
        log.info(String.valueOf(mySet.getAddCount()));
    }
}
