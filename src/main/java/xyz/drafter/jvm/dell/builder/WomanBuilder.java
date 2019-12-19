package xyz.drafter.jvm.dell.builder;

import xyz.drafter.jvm.dell.builder.product.Person;
import xyz.drafter.jvm.dell.builder.product.Woman;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class WomanBuilder extends PersonBuilder {

    private Person person;

    public WomanBuilder() {
        this.person = new Woman();
    }

    @Override
    public void buildHead() {
        person.setHead("pretty Head");
    }

    @Override
    public void buildBody() {
        person.setBody("soft body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("white foot");
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
