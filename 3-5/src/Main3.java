public class Main3 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        BankAccount account1=new BankAccount();

        BankAccount account2=account1;

        account1.balance=3000;

        System.out.println("口座１の残高："+account1.balance);
        System.out.println("口座２の残高："+account2.balance);
    }
}