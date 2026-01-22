import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException; // Dosya oluşturmak için gerekli

public class Lale {
    public static void main(String[] args) {
        File dosya = new File("learn.txt");

        try {
            // 1. ADIM: Dosya yoksa önce oluşturup içine bir şeyler yazalım
            if (!dosya.exists()) {
                System.out.println("Dosya bulunamadı, yeni oluşturuluyor...");
                dosya.createNewFile();

                PrintWriter ilkYazim = new PrintWriter(dosya);
                ilkYazim.println("İlk satır");
                ilkYazim.println("İkinci satır");
                ilkYazim.close(); // Yazma işini bitirip kaydedelim
            }

            // 2. ADIM: Şimdi okuyalım
            Scanner input = new Scanner(dosya);

            System.out.println("--- Dosya Okunuyor ---");
            while (input.hasNext()) { // Okunacak satır var mı?
                String a = input.nextLine(); // Varsa sıradaki satırı al
                System.out.println(a);       // Ekrana yaz
            }
            input.close(); // Okuyucuyu kapatalım

            // 3. ADIM: Eklemek istiyorsan (Append modu)
            // Not: PrintWriter normalde silip yazar. Eklemek için FileWriter kullanmak gerekir
            // ama şimdilik sadece yazmayı öğreniyoruz.

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı hatası!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Dosya oluşturma hatası!");
            e.printStackTrace();
        }
    }
}