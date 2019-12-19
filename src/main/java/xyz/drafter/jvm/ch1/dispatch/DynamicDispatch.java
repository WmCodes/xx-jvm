package xyz.drafter.jvm.ch1.dispatch;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class DynamicDispatch {

    static abstract class Human{
        protected abstract void sayHello();
    };
    static class Man extends Human{
        @Override
        protected void sayHello() {
            System.out.println("hello,gentlement ");
        }
    };
    static class Woman extends Human{
        @Override
        protected void sayHello() {
            System.out.println("hello,lady");
        }
    };


    public static void main(String[] args) {
        Human h1 = new Man();
        Human h2 = new Woman();
        h1.sayHello();
        h2.sayHello();
    }
}
