import java.util.Scanner;

public class palindrom {
    public static boolean victory(String palindrome){
        Scanner input=new Scanner(System.in);
        int i=palindrome.length()-1;
        int k=0;
        while (k<i){
            if (palindrome.charAt(i)!=palindrome.charAt(k)){
                return false;}
            i--;
            k++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        String palindrome=input.nextLine();
        if (victory(palindrome))
            System.out.println("it is a polindrom number");
        else
            System.out.println("it is not a polindrom number");

    }
}