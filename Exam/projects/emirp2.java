import java.util.Scanner;
public class emirp2 {
    public static void maim(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please can you write a number ");
        int num=input.nextInt();

        for(int i=2;i<num;i++){
            if (num%i==0) {
                System.out.println(num + " is not emirp number");}
            else{
                int reversed = 0;

                while (num != 0) {
                    int digit = num % 10;      // son basamağı al
                    reversed = reversed * 10 + digit; // yeni sayıya ekle
                    num /= 10;                 // son basamağı at
                }
                if (num==reversed)
                    System.out.println(num + "is a emirp number");


            }





        }



    }
}