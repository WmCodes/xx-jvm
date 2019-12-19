package xyz.drafter.jvm.dell;

/**
 * @author wangmeng
 * @date 2019/12/15
 * @desciption
 */
public class SimpleHeap {

    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void print(){
        System.out.println("My id is "+id);
    }

    public static void main(String[] args) {

        SimpleHeap s1= new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.print();
        s2.print();
    }
}
