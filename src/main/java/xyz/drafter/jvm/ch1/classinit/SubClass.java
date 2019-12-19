package xyz.drafter.jvm.ch1.classinit;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init !");
    }

}
