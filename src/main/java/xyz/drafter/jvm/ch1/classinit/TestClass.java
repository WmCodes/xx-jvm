package xyz.drafter.jvm.ch1.classinit;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class TestClass {

    public static void main(String[] args) {
        //System.out.println(SubClass.value);
        /**
         * SuperClass init!
         * 123
         */
        //SuperClass[] sca = new SuperClass[10];
        /**
         * NA
         */
        //System.out.println(SubClass.HELLOWORLD);
        /**
         * hello,world (常量进入main方法常量池中)
         */
        System.out.println(SubClass.WHAT);
        /**
         * SuperClass init!
         * 123
         */

    }
}
