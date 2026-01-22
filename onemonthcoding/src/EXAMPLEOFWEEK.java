class Account{
    String Ownername;
    double balance;
    public Account(String name,double initialbalance) {
        this.Ownername=name;
        this.balance=initialbalance;
    }
    public void transferto(Account receiver,double amount) {
        if (this.balance >=amount) {
            this.balance-=amount;
            receiver.balance+=amount;
            System.out.println("Alice transferred 300$ to bob");
        }
        else {
            System.out.println("Transfer failed! Insufficient funds.");
        }
    }

}
public class EXAMPLEOFWEEK {
    public static void main(String[] args) {
        Account[] accounts=new Account[3];
        accounts[0]=new Account("Alice",500);
        accounts[1]=new Account(" Bob",200);
        accounts[2]=new Account("Charlie",1000);

        accounts[0].transferto(accounts[1],300);

        therichest(accounts);

    }
    public static void therichest(Account[] accounts) {
         double max=0;
         String name="";
        for (int i=0;i<accounts.length;i++) {
            if (accounts[i].balance>max) {
                max=accounts[i].balance;
                name=accounts[i].Ownername;
            }
        }
        System.out.printf("The richest person: %s and it's balance: %.2f",name,max);
    }
}
