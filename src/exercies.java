import java.util.Scanner;
public class exercies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı1 = input.nextInt();
        System.out.println("lütfen bir sayı giriniz");
        int sayı2 = input.nextInt();
        System.out.println("lütfen bir işlem seçiniz");
        Scanner alıcı = new Scanner(System.in);
        String işaret = alıcı.nextLine();



            if (işaret.equals("+"))
                System.out.println(sayı1 + sayı2);
            if(işaret.equals("-"))
                System.out.println(sayı1 - sayı2);
            if (işaret.equals("*"))
                System.out.println(sayı1 * sayı2);


        }

    }

