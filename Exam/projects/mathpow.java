public class mathpow {
    public static void main(String[] args) {
        int taban = 2;
        int us = 3;
        // Sonuç 8 olmalı (2 * 2 * 2)
        System.out.println("Sonuç: " + usAl(taban, us));
    }

    public static int usAl(int taban, int us) {
        // 1. BASE CASE (DURMA NOKTASI)
        // Herhangi bir sayının 0. kuvveti kaçtır?
        if (us == 0) {
            return 1; // İpucu: 0 değil, çarpmanın etkisiz elemanı dönmeli.
        }

        // 2. RECURSIVE ADIM
        // Mantık: taban * (tabanın üssü 1 azalmış hali)

        // Örnek: 2^3 hesaplamak için -> 2 * usAl(2, 2) demelisin.

        return taban * usAl(taban, us-1); // BURAYI SİLİP DOĞRU KODU YAZ

        //1=2
        //2=2
        //3=2
        //4=1
        //şimdi bunun tam tersi
        //yani return daki işlemi önce ful gittik bitirdik sonra
        //geri döndük tersten başlayarak ilk kısma kadar geldik ve sonuca ulaştık.
    }
}