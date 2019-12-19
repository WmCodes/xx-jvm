package xyz.drafter.jvm.ch1.deencrpt;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class DemoRun {


    public static void main(String[] args) throws Exception {
    CustomClassLoader customClassLoader = new CustomClassLoader("My ClassLoader");
    customClassLoader.setBasePath("D:\\jcwl\\work\\xx-jvm\\target\\classes\\");
    Class<?> clazz =
            customClassLoader.findClass("xyz.drafter.jvm.ch1.deencrpt.DemoUser");
        System.out.println(clazz.getClassLoader());
        Object o = clazz.newInstance();
        System.out.println(o);

    }
}
