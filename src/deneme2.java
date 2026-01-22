import java.util.Scanner;
public class deneme2 {
    public static void main(String[] args) {
        Scanner String=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int number1=String.nextInt();
        System.out.println("lütfen bir sayı giriniz");
        int number2=String.nextInt();
        boolean even=number1%2==0;
        boolean even2=number2%2==0;
        System.out.println(even);
        System.out.println(even2);
    }
}