public class Product {
    // ここにコードを書いてください
    private String name;
    private int stock;

    public Product(String name,int initialStock){
        this.name=name;
        if(initialStock<0){
            this.stock=0;
        }else{
            this.stock=initialStock;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getStock(){
        return this.stock;
    }

    public void addStock(int amount){
        if(amount<=0){
            System.out.println("エラー：正の整数を指定してください");
            return;
        }
        this.stock+=amount;
        System.out.println(amount+"個追加しました");
    }

    public void removeStock(int amount){
        if(amount<=0){
            System.out.println("エラー：正の整数を指定してください");
            return;
        }

        if(amount>this.stock){
            System.out.println("エラー：在庫が不足しています");
            return;
        }

        this.stock-=amount;
        System.out.println(amount+"個販売しました");
    }
}