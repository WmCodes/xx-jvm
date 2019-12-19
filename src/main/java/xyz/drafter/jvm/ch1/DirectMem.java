package xyz.drafter.jvm.ch1;

import java.nio.ByteBuffer;

/**
 * @author drafter
 * @date 2019/12/16
 * @desciption 本机内存溢出
 */
public class DirectMem {

    /**
     *
     *
     * -Xmx10m -XX:MaxDirectMemorySize=10m
     * @param args
     */

    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocateDirect(1024*1024*14);
    }
}
