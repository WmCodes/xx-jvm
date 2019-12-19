package xyz.drafter.jvm.dell.builder;

import xyz.drafter.jvm.dell.builder.product.Man;
import xyz.drafter.jvm.dell.builder.product.Person;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class ManBuilder extends PersonBuilder {

    private Person person;

    public ManBuilder() {
        this.person = new Man();
    }

    @Override
    public void buildHead() {
        person.setHead("Brave Head");
    }

    @Override
    public void buildBody() {
        person.setBody("Strong body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("powful foot");
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
