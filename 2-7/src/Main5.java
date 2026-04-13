public class Main5 {
    public static void main(String[] args) {
        int note=280*3;
        int pencil=120*5;
        int eraser=100*2;
        int subtotal=note+pencil+eraser;
        System.out.println("小計: "+subtotal+"円");
        double taxRate=subtotal*0.1;
        System.out.println("消費税: "+(int)taxRate+"円");
        double totalPlice=subtotal+taxRate;
        System.out.println("合計金額: "+(int)totalPlice+"円");
        double change=2000-totalPlice;
        System.out.println("おつり: "+(int)change+"円");
    }
}
