import java.util.ArrayList;
import java.util.Scanner;
class Account {
    String owner ;
    double balance;
    public Account(String owner,double balance) {
        this.owner=owner;
        this.balance=balance;
    }

}
public class ORN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Account> bank=new ArrayList<>();
        bank.add(new Account("Steve", 5000.0));
        bank.add(new Account("Bill", 200.0));
        bank.add(new Account("Bill", 200.0));
        String name=input.nextLine();
        boolean isFound=false;
        for (Account p : bank) {
            if (p.owner.equalsIgnoreCase(name)) {
                System.out.printf("Found!Name [%s] has balance [%.2f]",name,p.balance);
                isFound=true;
                break;
            }
        }
    }
}