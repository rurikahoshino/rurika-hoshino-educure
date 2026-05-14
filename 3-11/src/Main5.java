public class Main5 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        SavingsAccount myAccount=new SavingsAccount("山田太郎",10000);

        myAccount.deposit(5000);

        myAccount.withdraw(3000);

        myAccount.displayAccountInfo();
    }
}