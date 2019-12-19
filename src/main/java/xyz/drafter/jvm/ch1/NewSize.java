package xyz.drafter.jvm.ch1;

/**
 * @author drafter
 * @date 2019/12/16
 * @desciption
 */
public class NewSize {

    /**
     * -Xms20M -Xmx20M -XX:+PrintGCDetails -XX:NewRatio=2
     * @param args
     */

    public static void main(String[] args) {
        int cap = 1*1024*1024;
        byte[] b0 = new byte[cap];
        byte[] b1 = new byte[cap];
        byte[] b2 = new byte[cap];
        byte[] b3 = new byte[cap];
        byte[] b4 = new byte[cap];
        byte[] b5 = new byte[cap];
        byte[] b6 = new byte[cap];
        byte[] b7 = new byte[cap];
        byte[] b8 = new byte[cap];
        byte[] b9 = new byte[cap];
    }
}
