import java.util.Scanner;

public class Asalayırma{

    /**
     * Verilen pozitif tam sayının asal çarpanlarını (tekrarlı olarak) konsola yazdırır.
     * Bu metot, sayıyı sürekli olarak en küçük asal bölenlerine böler.
     * @param n Asal çarpanlarına ayrılacak pozitif tam sayı.
     */
    public static void primeFactorization(int n) {

        // n'nin 1'den küçük olup olmadığını kontrol et (Pozitif sayı varsayımıyla)
        if (n <= 1) {
            System.out.println("Asal çarpanlar sadece 1'den büyük sayılar için hesaplanır.");
            return;
        }

        System.out.print(n + " sayısının asal çarpanları: ");
        int tempN = n; // Asıl sayıyı kaybetmemek için geçici bir değişken kullanıyoruz.

        // --- 1. Çarpan 2 Kontrolü ---
        // Sayı 2'ye bölünebildiği sürece 2'yi yazdır ve sayıyı böl.
        while (tempN % 2 == 0) {
            System.out.print("2");
            tempN /= 2;
            if (tempN > 1) {
                System.out.print(", ");
            }
        }

        // --- 2. Tek Asal Çarpanları Kontrolü (3'ten başlayarak) ---
        // Sadece tek sayıları kontrol et, çünkü çift çarpanlar (2 hariç) elenmiştir.
        // i = 3'ten başlayıp i'yi 2 artırarak kontrol et.

        // i * i <= tempN koşulu, kontrolü sadece kareköküne kadar yapma mantığıdır (optimizasyon).
        for (int i = 3; i * i <= tempN; i += 2) {

            // tempN, i'ye bölünebildiği sürece (i'nin kuvvetleri)
            while (tempN % i == 0) {
                System.out.print(i);
                tempN /= i;

                // Virgül koyma kontrolü: Kalan sayı 1'den büyükse virgül koy.
                if (tempN > 1) {
                    System.out.print(", ");
                }
            }
        }

        // --- 3. Kalanın Kontrolü (Son Asal Çarpan) ---
        // Döngü bittikten sonra tempN hala 1'den büyükse,
        // bu, geriye kalan tempN'nin kendisinin asal bir çarpan olduğu anlamına gelir.
        if (tempN > 1) {
            System.out.print(tempN);
        }

        System.out.println(); // Sonuçtan sonra yeni satıra geç
    }

    public static void main(String[] args) {
        // Metotun farklı değerlerle çağrılması

        primeFactorization(120); // Çıktı: 2, 2, 2, 3, 5
        primeFactorization(97);  // Çıktı: 97
        primeFactorization(36);  // Çıktı: 2, 2, 3, 3
    }
}