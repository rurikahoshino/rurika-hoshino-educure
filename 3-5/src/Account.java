class Account {
    String accountNumber;
    int balance;
    
    Account(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0;
    }

    void deposit(int amount){
        this.balance+=amount;
    }

    void withdraw(int amount){
        if(this.balance>=amount){
            this.balance-=amount;
        }else{
            System.out.println("残高が足りません");
        }
    }
}
