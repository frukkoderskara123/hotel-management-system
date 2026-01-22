import java.util.Scanner;
public class deneme{
    public static void main(String[] args) {
        Scanner String=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int number1=String.nextInt();
        System.out.println("lütfen bir sayı giriniz");
        int number2=String.nextInt();
        boolean even;
        if (number1%2==0)
            even = true;
        else
            even=false;
        System.out.println(even);

        if (number2%2==0)
            even = true;
        else
            even=false;
        System.out.println(even);
    }
}
