package xyz.drafter.jvm.ch1;

import java.lang.ref.WeakReference;

/**
 * @author drafter
 * @date 2019/12/16
 * @desciption
 */
public class TestWeakRef {

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
        TestSoftRef.User u = new TestSoftRef.User(1,"Drfater");
        WeakReference<TestSoftRef.User> userWeak = new WeakReference<>(u);
        u = null;
        System.out.println(userWeak.get());
        System.gc();
        System.out.println("AfterGC");
        System.out.println(userWeak.get());
    }
}
