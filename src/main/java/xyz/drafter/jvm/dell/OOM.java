package xyz.drafter.jvm.dell;

/**
 * @author wangmeng
 * @date 2019/12/15
 * @desciption
 */
public class OOM {
    public static void main(String[] args) {
        /**
         *
         * -Xms5m
         * -Xmx5m
         * -XX:+PrintGC
         *
         * */
   /*     List<Object> list = new LinkedList<>();
        int i = 0;
        while (true){
            i++;
            if (i%10000 == 0)
            {
                System.out.println("i= "+i);
            }
            list.add(new Object());

        }*/
   String[] strings = new String[100000000];

    }
}
