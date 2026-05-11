public class Main6 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        Account myAccount=new Account("12345");
        System.out.println("口座番号："+myAccount.accountNumber);

        myAccount.deposit(1000);
        System.out.println("残高："+myAccount.balance+"円");

        myAccount.withdraw(500);
        System.out.println("出金後残高："+myAccount.balance+"円");
    }
}