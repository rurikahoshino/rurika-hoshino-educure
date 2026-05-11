class Product {
    String name;
    int price;

    // コンストラクタ：クラス名と同じ名前にし、戻り値の型は書かない
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 商品情報を表示するメソッド
    void displayInfo() {
        System.out.println("商品名：" + this.name);
        System.out.println("価格：" + this.price + "円");
    }
}