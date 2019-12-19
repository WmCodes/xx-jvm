package xyz.drafter.jvm.ch1.enmu;

/**
 * @author drafter
 * @date 2019/12/18
 * @desciption
 */
public enum  BetterPayDay {
    MONDAY(PayType.WORK),TUESDAY(PayType.WORK),SUNDAY(PayType.REST);

    private final PayType payType;

    BetterPayDay(PayType payType) {
        this.payType = payType;
    }
    double pay(double hoursOvertime){
        return payType.pay(hoursOvertime);
    }

    // 策略枚举
    private enum PayType{
        WORK{
            @Override
            double pay(double hoursOverTime) {
                return hoursOverTime * HOURS_WORK;
            }
        },REST {
            @Override
            double pay(double hoursOverTime) {
                return hoursOverTime * HOURS_REST;
            }
        };

        private static final int HOURS_WORK = 2;
        private static final int HOURS_REST = 3;
        abstract double pay(double hoursOverTime);
    }


    public static void main(String[] args) {
        System.out.println(BetterPayDay.MONDAY.pay(7.5));
    }
}
