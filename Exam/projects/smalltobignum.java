import java.util.Scanner;
import java.util.Arrays;

public class smalltobignum{
    public static int[] digtis(int num){// Bu kısmı kesinlikle charat ile yapma çünkü digits[0]=num2.charat[0} burdaki değişkenin ASII kodunu arraye atıyor bu yüzden işlem sonunda logıc hata alıyosun
        String num2="" + num;
        int sayı1=num2.length();
        int[] digits=new int[sayı1];
        int k=0;
        int temp=num;
        for (int i=sayı1-1;i>=0;i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    public static long twooption(int[] digits,boolean ascending){
        if (ascending) {
            Arrays.sort(digits);
            int n=digits.length;
            int reverse=0;
            for (int a=0; a<n ;a++) {
                reverse=reverse * 10 +digits[a];

            }
            return reverse;
        }
        else {
            Arrays.sort(digits);
            int c=digits.length;
            int l=c;
            int reverse=0;
            for (int a=0;a<c;a++) {
                reverse=reverse * 10 +digits[l-1];
                l--;

            }
            return reverse;


        }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Can you write a number");
        int num=input.nextInt();
            int[] digits = digtis(num);

            long ascendingResult = twooption(digits.clone(), true);

            long descendingResult = twooption(digits.clone(), false);

            System.out.println("Orijinal Sayı: " + num);
            System.out.println("Küçükten Büyüğe Sıralanmış Sayı: " + ascendingResult);
            System.out.println("Büyükten Küçüğe Sıralanmış Sayı: " + descendingResult);

            input.close();
    }

}