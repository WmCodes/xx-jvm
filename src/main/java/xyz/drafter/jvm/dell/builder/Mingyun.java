package xyz.drafter.jvm.dell.builder;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class Mingyun {

    public static void main(String[] args) {

        System.out.println("create NvWa");
        NvWa nvWa  = new NvWa();
        nvWa.buildPerson(new ManBuilder());
        nvWa.buildPerson(new WomanBuilder());
    }
}
