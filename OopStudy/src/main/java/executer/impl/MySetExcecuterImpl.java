package executer.impl;

import executer.Executer;
import inheritance.MySet;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MySetExcecuterImpl implements Executer {

    @Override
    public void execute() {
        MySet<Integer> mySet = new MySet<>();

        mySet.addAll(Arrays.asList(1, 2, 3));
        mySet.add(10);

        log.info(mySet.toString());
        log.info(String.valueOf(mySet.getAddCount()));
    }
}
