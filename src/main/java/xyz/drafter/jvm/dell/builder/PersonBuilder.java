package xyz.drafter.jvm.dell.builder;

import xyz.drafter.jvm.dell.builder.product.Person;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public abstract class PersonBuilder {

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildFoot();

    public abstract Person createPerson();


}
