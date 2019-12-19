package xyz.drafter.jvm.dell;

/**
 * @author wangmeng
 * @date 2019/12/15
 * @desciption 栈上分配
 */
public class StackAlloc {

    /**
     *
     * -server
     * -Xmx10m
     * -Xms10m
     * -XX:+DoEscapeAnalysis
     * -XX:+PrintGC
     * -XX:+EliminateAllocations
     * -XX:-UseTLAB
     *
     */

    public static class User{
        public int id = 0;
        public String name = "";
    }

    public static void alloc(){
        User u = new User();
        u.id = 5;
        u.name = "drafter";
    }

    public static void main(String[] args) {
        Long b= System.currentTimeMillis();
        for (int i = 0;i<100000000;i++){
            alloc();
        }
        Long e = System.currentTimeMillis();
        System.out.println((e-b) + " ms" );

    }
}
