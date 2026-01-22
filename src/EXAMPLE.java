import java.util.Scanner;

public class EXAMPLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Liste=[A,B,C]");
        System.out.println("Lütfen listeden bir harf saçiniz");
        String harf = input.nextLine();

        if (harf == "A") {
            System.out.println("Liste2=[1,2,3]");
            System.out.println("Can you write a number from liste2");
            int sayı = input.nextInt();
            switch (sayı) {
                case 1:
                    System.out.println("Araba");
                    break;
                case 2:
                    System.out.println("bi dahaki sefere");
                    break;
                case 3:
                    System.out.println("bi dahaki sefere");
                    break;
            }
        }

        if (harf == "B") {
            System.out.println("Liste2=[1,2,3]");
            System.out.println("Can you write a number from liste2");
            int sayı1 = input.nextInt();
            switch (sayı1) {
                case 1:
                    System.out.println("bi dahaki sefere");
                    break;
                case 2:
                    System.out.println("Airpods");
                    break;
                case 3:
                    System.out.println("Mobilet");
                    break;

            }
        }
        if (harf == "C") {
            System.out.println("Liste2=[1,2,3]");
            System.out.println("Can you write a number from liste2");
            int sayı2 = input.nextInt();
            switch (sayı2) {
                case 1:
                    System.out.println("bi dahaki sefere");
                    break;
                case 2:
                    System.out.println("bi dahaki sefere");
                    break;
                case 3:
                    System.out.println("Villa");
                    break;
            }
        }
    }
}







