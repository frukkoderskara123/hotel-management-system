public class NewquestionRecursive {

    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}
        };
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < answers.length; i++) {
            // Her öğrenci için recursive metodu 0. sorudan başlatıyoruz
            int dogruSayisi = hesaplaRecursive(answers[i], keys, 0);
            System.out.println("Öğrenci " + i + " doğru sayısı: " + dogruSayisi);
        }
    }

    /**
     * Recursive metot: Bir öğrencinin cevaplarını kontrol eder.
     * @param ogrenciCevaplari Tek bir öğrencinin char dizisi
     * @param anahtar Doğru cevap anahtarı
     * @param index Kontrol edilen mevcut soru numarası
     */
    public static int hesaplaRecursive(char[] ogrenciCevaplari, char[] anahtar, int index) {
        // 1. DURDURMA KOŞULU (Base Case): Soru sayısı dolunca dur.
        if (index == ogrenciCevaplari.length) {
            return 0;
        }

        // 2. MANTIKSAL İŞLEM: Şu anki soru doğru mu?
        int puan = 0;
        if (ogrenciCevaplari[index] == anahtar[index]) {
            puan = 1;
        }

        // 3. KENDİNİ ÇAĞIRMA (Recursive Step):
        // Mevcut puanı, bir sonraki sorudan gelecek olan puanla topla.
        return puan + hesaplaRecursive(ogrenciCevaplari, anahtar, index + 1);
    }
}