public class Main3 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        BankAccount myAccount=new BankAccount();

        System.out.println("残高："+myAccount.getBalance()+"円");

        myAccount.deposit(10000);
        System.out.println("残高："+myAccount.getBalance()+"円");

        myAccount.withdraw(3000);
        System.out.println("残高："+myAccount.getBalance()+"円");

        myAccount.withdraw(8000);
    }
}