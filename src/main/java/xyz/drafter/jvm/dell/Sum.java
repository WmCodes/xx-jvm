package xyz.drafter.jvm.dell;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class Sum {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Long sum = 0L;
        for (long i = 0;i<Integer.MAX_VALUE;i++){
            sum = sum+i;
        }
        System.out.println("spend time: "+(System.currentTimeMillis()-start)+" ms");


    }
}
