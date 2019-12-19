package xyz.drafter.jvm.ch1.enmu;

/**
 * @author drafter
 * @date 2019/12/18
 * @desciption
 */
public enum DepotEnum {
    UNPAY(0,"未支付"),PAID(1,"已支付"),TIMOUT(-1,"超时");
    private int status;
    private String desc;
    private String dbInfo;

    DepotEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public String getDbInfo() {
        return dbInfo;
    }
    public int calcStatus(int params){
        return status+params;
    }

    public static void main(String[] args) {
        for (DepotEnum e: DepotEnum.values()){
            System.out.println(e+":"+e.calcStatus(14));
        }

    }
}
