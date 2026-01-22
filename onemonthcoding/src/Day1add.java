import java.awt.*;
import java.util.Scanner;

class bankaccount {
    String owner;
    int current;
    public void currentcontrol(bankaccount taker) {
        Scanner kale=new Scanner(System.in);
        System.out.println("Can you write your sent money");
        int a=kale.nextInt();
        if (this.current>a) {
            this.current=this.current-a;
            taker.current=taker.current+a;
            System.out.println("Actual current: "+this.current);
        }
        else {
            System.out.println("Not enough current");
            return;}
    }

}
public class Day1add {
    public void main(String[] args) {
        Scanner input=new Scanner(System.in);
        bankaccount transmitter=new bankaccount();
        System.out.println("Can you write your name");
        transmitter.owner=input.nextLine();
        System.out.println("Can you write your current");
        transmitter.current=input.nextInt();
        bankaccount rakip=new bankaccount();
        transmitter.currentcontrol(rakip);




    }
}