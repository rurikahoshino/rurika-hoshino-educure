public class Main2 {
    public static void main(String[] args) {
        int listPrice=2500;
        double discountRate=0.2;
        double discountAmount=listPrice*discountRate;
        System.out.println("割引額: "+(int)discountAmount+"円");
        int sellingPrice=listPrice-(int)discountAmount;
        System.out.println("販売価格: "+sellingPrice+"円");
    }
    
}
