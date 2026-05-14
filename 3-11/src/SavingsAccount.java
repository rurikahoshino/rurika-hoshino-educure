public class SavingsAccount implements BankAccount {
    private String owner;
    private int balance;

    public SavingsAccount(String owner,int initiaBalance){
        this.owner=owner;
        this.balance=initiaBalance;
    }

    @Override
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("無効な入金額です");
            return;
        }
        this.balance+=amount;
        System.out.println(amount+"円入金しました");
    }

    @Override
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("無効な出金額です");
        }else if(amount>this.balance){
            System.out.println("残高不足のため出金できません");
        }else{
            this.balance-=amount;
            System.out.println(amount+"円出金しました");
        }
    }

    @Override
    public int getBalance(){
        return this.balance;
    }

    @Override
    public void displayAccountInfo(){
        System.out.println("口座名義人："+this.owner);
        System.out.println("残高："+this.balance);
    }
}
