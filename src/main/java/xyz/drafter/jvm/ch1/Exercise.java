package xyz.drafter.jvm.ch1;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class Exercise {

    static void print(Exercise e1,Exercise e2){
        System.out.println(e1 == (e1 = e2));
    }

    public static void main(String[] args) {
        Exercise e1= new Exercise();
        Exercise e2 = new Exercise();
        print(e1, e2);
    }
}
