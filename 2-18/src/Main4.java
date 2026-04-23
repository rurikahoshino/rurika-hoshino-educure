import java.util.Arrays;
public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量
        // ここにコードを書いてください
        int[] totals=calculateAllTotals(prices,quantities);
        System.out.println("商品価格:"+Arrays.toString(prices)+",数量:"+Arrays.toString(quantities));
        System.out.println("合計金額:"+Arrays.toString(totals));
    }

    public static int[] calculateAllTotals(int[] prc,int[] qty){
        int[] result=new int[prc.length];
        for(int i=0;i<prc.length;i++){
            result[i]=(int)(prc[i]*qty[i]*1.1);
        }
        return result;
    }
}
