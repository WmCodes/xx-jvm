package xyz.drafter.jvm.ch1;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/**
 * @author drafter
 * @date 2019/12/16
 * @desciption
 */
public class TestSoftRef {

    /**
     *
     * -Xmx10m -Xms10m -XX:+PrintGC
     *
     */

    public static class  User{
        public int id = 0;
        public String name = "";
        public User(int id,String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        User u = new User(1,"Drfater");
        SoftReference<User> userSoft = new SoftReference<>(u);
        u = null;

        System.out.println(userSoft.get());
        System.gc();
        System.out.println("AfterGC");
        System.out.println(userSoft.get());
        List<byte[]> list = new LinkedList<>();
        try {
            for (int i = 0;i<100;i++){
                System.out.println("***"+userSoft.get());
                list.add(new byte[1024*1024*1]);
            }
        } catch (Throwable e) {
            System.out.println("***____"+userSoft.get());
        }

    }
}
