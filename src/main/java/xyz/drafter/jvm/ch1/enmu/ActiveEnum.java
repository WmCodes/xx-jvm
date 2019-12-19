package xyz.drafter.jvm.ch1.enmu;

/**
 * @author drafter
 * @date 2019/12/18
 * @desciption 枚举和行为绑定
 */
public class ActiveEnum {


    public enum  NormalActive{
        PLUS,MINUS,MULTI,DIVIDS;

        double oper(double x,double y){
            switch (this){
                case PLUS:return x+y;
                case MINUS:return x-y;
                case MULTI:return x*y;
                case DIVIDS:return x/y;

            }
            throw new UnsupportedOperationException();
        }
    }


    public enum  BetterActive{
            PLUS{
                @Override
                double oper(double x, double y) {
                    return x+y;
                }
            },MINUS{
            @Override
            double oper(double x, double y) {
                return x-y;
            }
        };
            abstract double oper(double x,double y);
    }

    public static void main(String[] args) {
        System.out.println(NormalActive.PLUS.oper(0.1, 0.2));
        System.out.println(BetterActive.PLUS.oper(0.1, 0.2));

    }
}
