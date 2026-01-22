import java.util.Scanner;

public class Artansayı {
    public static boolean artansayı(int num) {
        int temp=num;
        int digit=0;
        while(temp!=0) {
            temp=temp/10;
            digit++;

        }
        String num2="" +num;
        for (int i=digit-1;i>0;i--) {
            if (num2.charAt(i-1)>num2.charAt(i)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Can you write a number");
        int num=input.nextInt();
        artansayı(num);
        if (artansayı(num)==true)
            System.out.println(num+" is a artan sayı");
        else
            System.out.println(num+" is not a artan sayı");
        }
    }
