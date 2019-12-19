package xyz.drafter.jvm.dell.builder;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class FoodNormal {

    private final String foodName;
    private final int reliang;

    private final int dbz;
    private final int dianfen;
    private final int zf;
    private final int tang;
    private final int wss;


    public FoodNormal(String foodName, int reliang, int dbz, int dianfen, int zf, int tang, int wss) {
        this.foodName = foodName;
        this.reliang = reliang;
        this.dbz = dbz;
        this.dianfen = dianfen;
        this.zf = zf;
        this.tang = tang;
        this.wss = wss;
    }

    public FoodNormal(String foodName, int reliang) {
        this(foodName,reliang,0,0,0,0,0);
    }
}
