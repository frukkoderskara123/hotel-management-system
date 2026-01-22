public class Recursive{
    public static void main(String[] args) {
        // 1: Petrol, 0: Su
        int[][] okyanus = {
                {0, 0, 0, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 1}
        };

        // (1, 1) noktasındaki sızıntının büyüklüğü nedir?
        int buyukluk = alanHesapla(okyanus, 1, 1);
        System.out.println("Toplam Sızıntı Büyüklüğü: " + buyukluk);
    }

    public static int alanHesapla(int[][] harita, int r, int c) {
        // 1. BASE CASE: Sınır kontrolü (Harita dışına çıktık mı?)
        // if (...) return 0;

        // 2. BASE CASE: Aradığımız şey (Petrol/1) değilse veya zaten bakıldıysa (0 ise)
        // if (...) return 0;

        // --- RECURSIVE ADIM ---
        // 3. Önce bulunduğumuz kareyi "saydık" diye işaretleyelim (Tekrar saymamak için 1'i 0 yapıyoruz)
        harita[r][c] = 0;

        // 4. Şimdi 4 yönü toplayarak dön
        // return 1 + alanHesapla(...) + alanHesapla(...) ... ;

        return 0; // (Bu satırı silebilirsin, kodun yapısı bozulmasın diye koydum)
    }
}