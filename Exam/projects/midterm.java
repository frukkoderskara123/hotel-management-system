import java.util.Scanner;

public class midterm {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please,can you write a positive number");
        int a=input.nextInt();
        int digit=0;
        if (a>0){
            System.out.println("\n starting the collatz sequence for 'a'");
            while(a!=1){
                if (a%2==0){
                    a=a/2;
                    System.out.print(a+",");
                    digit++;
                a=a/2;}
                if (a%2!=0){
                    System.out.print(a+",");
                    digit++;
                a=a/2;}
            }
        }
        if (a<0){
            System.out.println("please enter a number greater than 0");
            a=input.nextInt();}
        System.out.println("The sequence reached "+a+" in a total of "+digit+"steps");
        System.out.println("\nprocess completed");

    }

}