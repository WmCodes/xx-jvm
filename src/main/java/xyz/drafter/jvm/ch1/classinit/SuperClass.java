package xyz.drafter.jvm.ch1.classinit;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
    public static final String HELLOWORLD = "hello,world";
    public static final int WHAT =value;

}
