import java.util.Scanner;
public class Palindromiksayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Can you write a number");
        int num=input.nextInt();
        String num2="" + num;
        int a=0;
        for (int i=0;i<=num2.length();i++) {
            a=i*i;
            int digit=0;
            int temp=a;
            while(temp!=0) {
                temp=temp/10;
                digit++;
            }
            int reverse=0;
            int sayı=a;
            for (int c=0;c<digit;c++) {
                reverse=reverse * 10 + sayı%10;
                sayı=sayı/10;
            }
            if (reverse==a)
                System.out.println(a);


        }
    }
}