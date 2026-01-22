// switch bir değişken birdan fazla değer alıyosa switch kullanılır
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int day = input.nextInt();

        switch(day) {
            case 0:
                System.out.println("pazartesi");
                break;
            case 1:
                System.out.println("salı");
                break;
            case 2:
                System.out.println("wednesday");
            default:
                System.out.println("işleminiz başarısız");

        }

    }


}



