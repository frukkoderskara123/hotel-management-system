import java.util.Scanner;
public class İndirim{
    public static double indirim(double num,double sayı){
        double result=0;
        if (num<500){
            result=num*(100-sayı)/100;}
        else{
            result=num*(100-(sayı+5))/100;}
        System.out.println(result);
        return result;

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Your object price:");
        double a=input.nextDouble();
        System.out.println("Your object indirim percent: ");
        double b=input.nextDouble();
        indirim(a,b);
    }

}