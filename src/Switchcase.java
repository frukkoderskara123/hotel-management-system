import java.util.Scanner;

public class Switchcase{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir değer giriniz");

        int uçak= input.nextInt();
            switch(uçak) {
                case 0:
                    System.out.println("kalkan");
                case 1:
                    System.out.println("ateş");
                case 3:
                    System.out.println("zifiri");

            }



    }
}