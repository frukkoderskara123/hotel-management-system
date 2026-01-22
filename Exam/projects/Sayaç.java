import java.util.Scanner;

public class Sayaç{
    public static void sayaç(String text,char n){
        text.toLowerCase();
        int a=0;
        for (int i=0;i<text.length();i++){


            if (n==text.charAt(i)){
                a=a+1;

            }

        }
        System.out.println(a);

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Can you write a word or sentences");
        String text=input.nextLine();
        System.out.println("Can you write a character");
        char  n=input.nextLine().charAt(0);
        sayaç(text,n);
    }


}