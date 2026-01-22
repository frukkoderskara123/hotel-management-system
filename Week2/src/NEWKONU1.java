class  lila{
    private String accountnumber;
    private double balance;
    String name;
    public lila(String accountnumber, double balance,String name ) {
        this.accountnumber=accountnumber;
        this.balance=balance;
        this.name=name;
    }
    public void deposit(double amount) {
        if (amount<0) {
            System.out.println("Error: ınvalıd amount");
        }
        else {
            this.balance+=amount;
        }

    }
    public void withdraw(double amount) {
        if (amount<0) {
            System.out.println("Error: ınvalıd amount");
            return;
        }
        if (amount>balance) {
            System.out.println("Error: ınsuffıcıent balance");
            return;
        }
        if (amount<=balance) {
            this.balance-=amount;
        }
    }
    public void showınfo() {
        System.out.printf("Accountnumber: %s,Name: %s,Currentbalance: %.2f",accountnumber,name,balance);
    }

}
public class NEWKONU1 {
    public static void main(String[] args) {
        lila x=new lila ("TR-101",1000,"Steve");
        x.deposit(500);
        x.withdraw(2000);
        x.withdraw(200);
        x.showınfo();


    }
}