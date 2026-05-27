public class BankAccount {
    // ここにコードを書いてください
    private int balance;

    public BankAccount(int initiaBalance){
        if(initiaBalance<0){
            this.balance=0;
        }else{
            this.balance=initiaBalance;
        }
    }

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("エラー：正の整数を指定してください");
            return;
        }
        this.balance+=amount;
        System.out.println(amount+"円入金しました");
    }

    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("エラー：正の整数を指定してください");
            return;
        }

        if(amount>this.balance){
            System.out.println("引き出しに失敗しました。残高が不足しています。");
            return;
        }

        this.balance-=amount;
        System.out.println(amount+"円引き出しました");
    }
}