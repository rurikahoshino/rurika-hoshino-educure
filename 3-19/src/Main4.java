public class Main4 {
    public static void main(String[] args) {
       // ここにコードを書いてください
       int jpyFromUsd1=ExchangeRate.toJPY("USD", 100);
       System.out.println("100ドル = "+jpyFromUsd1+"円");

       ExchangeRate.updateRates(150.0, 160.0);

       int jpyFromUsd2=ExchangeRate.toJPY("USD", 100);
       System.out.println("100ドル = "+jpyFromUsd2+"円");

       int jpyFromEur=ExchangeRate.toJPY("EUR", 80);
       System.out.println("80ユーロ = "+jpyFromEur+"円");
    }
}  