 import java.util.Scanner;

public class emirp  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        // 1️⃣ Sayının asal olup olmadığını kontrol et
        boolean asalMi = true;
        if (number <= 1) {
            asalMi = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        // 2️⃣ Sayıyı tersine çevir
        int temp = number;
        int ters = 0;
        while (temp != 0) {
            int basamak = temp % 10;
            ters = ters * 10 + basamak;
            temp /= 10;
        }

        // 3️⃣ Ters sayının asal olup olmadığını kontrol et
        boolean tersAsalMi = true;
        if (ters <= 1) {
            tersAsalMi = false;
        } else {
            for (int i = 2; i <= Math.sqrt(ters); i++) {
                if (ters % i == 0) {
                    tersAsalMi = false;
                    break;
                }
            }
        }

        // 4️⃣ Sonucu yazdır
        if (asalMi && tersAsalMi && number != ters) {
            System.out.println(number + " bir Emirp sayıdır.");
        } else {
            System.out.println(number + " Emirp değildir.");
        }

        input.close();
    }
}