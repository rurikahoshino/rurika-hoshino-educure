class BankAccount {
    private int balance=0;

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance+=amount;
        System.out.println(amount+"円預けました");
    }

    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("残高が不足しています");
        }else{
            balance-=amount;
            System.out.println(amount+"円引き出しました");
        }
    }
}
