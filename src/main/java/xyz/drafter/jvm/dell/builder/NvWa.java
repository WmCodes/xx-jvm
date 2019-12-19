package xyz.drafter.jvm.dell.builder;

import xyz.drafter.jvm.dell.builder.product.Person;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class NvWa {

    public Person buildPerson(PersonBuilder pb){
        pb.buildBody();;
        pb.buildFoot();;
        pb.buildFoot();
        return pb.createPerson();
    }
}
