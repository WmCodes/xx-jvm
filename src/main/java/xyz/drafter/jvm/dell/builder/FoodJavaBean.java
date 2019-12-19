package xyz.drafter.jvm.dell.builder;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class FoodJavaBean {

    private final String foodName;
    private final int reliang;

    private  int dbz;
    private  int dianfen;
    private  int zf;
    private  int tang;
    private  int wss;

    public FoodJavaBean(String foodName, int reliang) {
        this.foodName = foodName;
        this.reliang = reliang;
    }

    public int getDbz() {
        return dbz;
    }

    public void setDbz(int dbz) {
        this.dbz = dbz;
    }

    public int getDianfen() {
        return dianfen;
    }

    public void setDianfen(int dianfen) {
        this.dianfen = dianfen;
    }

    public int getZf() {
        return zf;
    }

    public void setZf(int zf) {
        this.zf = zf;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getWss() {
        return wss;
    }

    public void setWss(int wss) {
        this.wss = wss;
    }
}
