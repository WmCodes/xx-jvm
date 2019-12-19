package xyz.drafter.jvm.dell;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/12/15
 * @desciption
 */
public class MetaSpace {
    public static void main(String[] args) {
        /**
         * -XX:MaxMetaspaceSize=3M
         */
       List<Object> list = new LinkedList<>();
        int i = 0;
        while (true){
            i++;
            if (i%10000 == 0)
            {
                System.out.println("i= "+i);
            }
            list.add(new Object());

        }


    }
}
