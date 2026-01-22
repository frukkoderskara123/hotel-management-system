public class newfibanocci {
    public static void main(String[] args) {
        int n = 6; // 6. indeksteki sayıyı bulalım (Cevap 8 olmalı)
        System.out.println(n + ". Fibonacci sayısı: " + fibHesapla(n));
    }

    public static int fibHesapla(int n) {
        // 1. BASE CASE (DURMA NOKTALARI)
        // Fibonacci'de iki tane başlangıç değeri vardır: 0 ve 1.
        if (n == 0) return 0; // [cite: 240]
        if (n == 1) return 1; // [cite: 241]

        // 2. RECURSIVE ADIM (ZOR KISIM BURASI)
        // İpucu: Kendinden önceki iki sayının toplamını döndürmelisin.


        return fibHesapla(n-1)+fibHesapla(n-2);

    }
}