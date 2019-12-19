package xyz.drafter.jvm.ch1.dispatch;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class StaticDispatch {

    static abstract class Human{};
    static class Man extends Human{};
    static class Woman extends Human{};

    public void sayHello(Human guy){
        System.out.println("hello,guy");
    }

    public void sayHello(Man guy){
        System.out.println("hello,gentlement");
    }

    public void sayHello(Woman guy){
        System.out.println("hello,lady");
    }

    public static void main(String[] args) {
        Human h1 = new Man();
        Human h2 = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(h1);
        sr.sayHello(h2);
    }
}
