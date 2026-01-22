import java.util.Scanner;


public class Happynumber{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Can you write a number");
        double num=input.nextInt();

        while(num!=1) {
            String num2="" + num;
            double a=0;
            for (int i=0;i<num2.length();i++) {
                System.out.println(num2.charAt(i));
                a=a+Math.pow(num2.charAt(i),2);
                //System.out.println(a);
            }
            if (a==1) {
                num=a;
            }
            else
                num=a;
        }
       // System.out.println(num);
    }
}