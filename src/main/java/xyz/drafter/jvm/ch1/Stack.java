package xyz.drafter.jvm.ch1;

/**
 * @author drafter
 * @date 2019/12/16
 * @desciption
 */
public class Stack {

    public Object[] elements;
    private int size = 0; // 指示器，指示当前栈顶的位置
    private static final int Cap = 16;

    public Stack(){
        elements = new Object[Cap];
    }

    public void push(Object e){
        elements[size] = e;
        size++;
    }
    public Object pop(){
        size = size-1;
        Object o = elements[size];
        elements[size] = null;
        return o;
    }
}
