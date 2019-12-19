package xyz.drafter.jvm.dell.builder;

/**
 * @author wangmeng
 * @date 2019/12/17
 * @desciption
 */
public class FoodBuilder {

    private final String foodName;
    private final int reliang;

    private  int dbz;
    private  int dianfen;
    private  int zf;
    private  int tang;
    private  int wss;


   public static class Builder{
       private final String foodName;
       private final int reliang;

       private  int dbz;
       private  int dianfen;
       private  int zf;
       private  int tang;
       private  int wss;


       public Builder(String foodName, int reliang) {
           this.foodName = foodName;
           this.reliang = reliang;
       }

       public Builder setDbz(int dbz) {
           this.dbz = dbz;
           return this;
       }

       public Builder setDianfen(int dianfen) {
           this.dianfen = dianfen;
           return this;
       }

       public Builder setZf(int zf) {
           this.zf = zf;
           return this;
       }

       public Builder setTang(int tang) {
           this.tang = tang;
           return this;
       }

       public Builder setWss(int wss) {
           this.wss = wss;
           return this;
       }

       public FoodBuilder builder(){
           return new FoodBuilder(this);
       }
   }

   private FoodBuilder(Builder builder){
       this.foodName = builder.foodName;
       this.reliang = builder.reliang;
       this.dbz = builder.dbz;
       this.dianfen = builder.dianfen;
       this.zf = builder.zf;
       this.tang = builder.tang;
       this.wss = builder.wss;

   }


    public static void main(String[] args) {
        FoodBuilder foodBuilder =
                new Builder("food2",1000)
                        .setDbz(100)
                        .setDianfen(123).builder();
    }


}
