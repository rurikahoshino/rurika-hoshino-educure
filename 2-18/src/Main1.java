public class Main1 {
    public static void main(String[] args) {
        int price = 1000;  // 商品価格
        int quantity = 3;  // 数量
        // ここにコードを書いてください
        int total=calculateTotal(price,quantity);

        System.out.println("商品価格:"+price+"円,数量:"+quantity);
        System.out.println("合計金額(税込):"+total+"円");
    }
    public static int calculateTotal(int price,int qty){
        double taxIncluded=price*qty*1.1;
        return(int)taxIncluded;
    }
}