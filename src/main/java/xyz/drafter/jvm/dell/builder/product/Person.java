package xyz.drafter.jvm.dell.builder.product;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public abstract class Person {

    protected String head;
    protected String body;
    protected String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
