package xyz.drafter.jvm.dell;

/**
 * @author wangmeng
 * @date 2019/12/15
 * @desciption
 */
public class StackOOM {

    //-Xss256k

    private int stackLength = 1;
    private void diGui(){
        stackLength++;
        diGui();
    }


    public static void main(String[] args) {
        StackOOM oom =new StackOOM();

        try {
            oom.diGui();
        }catch (Throwable e){
            System.out.println("stackLength: " +oom.stackLength);
            e.printStackTrace();
        }
    }
}
