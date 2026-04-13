public class Main4 {
    public static void main(String[] args) {
        int pricePer100g=138;
        double weight=315.8;
        double pricePerGram=pricePer100g/100.0;
        double totalPlice=pricePerGram*weight;
        System.out.println("合計金額: "+(int)totalPlice+"円です");
    }
}
