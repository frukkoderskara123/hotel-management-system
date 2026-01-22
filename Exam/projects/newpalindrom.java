import java.util.Scanner;

public class newpalindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        if (isPalindorm(n)) {
            System.out.println(n+" number is polindrom");
            System.out.println("Steps number is 0");
        }
        else {
            System.out.println(findsteps(n));
        }


    }
    public static int reverse(int n) {
        int temp=n;
        int digit=0;
        while (temp!=0)  {
            temp=temp/10;
            digit++;
        }
        temp=n;
        int reverse=0;
        while(digit!=0) {
            reverse=reverse * 10 +temp%10;
            temp=temp/10;
            digit--;
        }
        return reverse;
    }
    public static boolean isPalindorm(int n) {
        if (reverse(n)==n) {
            return true;
        }
        return false;
    }
    public static int findsteps(int n) {
        int steps=0;
        if (isPalindorm(n)==false) {
            while(isPalindorm(n)==false && steps<1000) {
                n=n+reverse(n);
                steps++;
                System.out.println(n);
                if (isPalindorm(n)) {
                    break;
                }

            }
        }
        return steps;
    }

}