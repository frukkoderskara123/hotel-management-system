public class gül {

    // Ödev "command line arguments" (args) istediği için Scanner'ı kaldırdık.
    public static void main(String[] args) {

        // Eğer hiç sayı girilmezse
        if (args.length == 0) {
            System.out.println("No Values Passed");
            return;
        }

        // Girilen her sayı için döngü (args dizisini geziyoruz)
        for (String s : args) {
            try {
                int n = Integer.parseInt(s); // String'i sayıya çevir

                // Senin yazdığın kontrol yapısı (biraz düzenlendi)
                if (isvalidkapkeraker(n)) {
                    int adimSayisi = stepcount(n);
                    System.out.println(n + ": " + adimSayisi); // İstenen çıktı formatı
                } else {
                    System.out.println(n + ": Invalid Input");
                }
            } catch (NumberFormatException e) {
                System.out.println(s + ": Sayı değil");
            }
        }
    }

    // BU METODU DÜZELTTİK: Artık basamak değil, işlem sayısı sayıyor.
    public static int stepcount(int n) {
        int count = 0;
        int current = n;

        // Sayı 6174 olmadığı sürece devam et
        while (current != 6174) {
            // Eğer sayı 0 olursa (örn: 1111 - 1111) döngüyü kır
            if (current == 0) break;

            int buyuk = sortdecreasing(current);
            int kucuk = sortincreasing(current);

            current = buyuk - kucuk;
            count++;

            // Sonsuz döngüden korumak için güvenlik (isteğe bağlı)
            if(count > 50) break;
        }
        return count;
    }

    public static boolean isvalidkapkeraker(int n) {
        if (n > 9999) return false; // 4 basamaktan büyükse geçersiz

        // En az iki farklı rakam kuralı için pratik yöntem:
        // Eğer büyükten küçüğe sıralanmış hali ile küçükten büyüğe sıralanmış hali aynıysa
        // (yani sayı 1111, 2222 gibiyse) çıkarma işlemi 0 verir. Bu geçersizdir.
        if (sortdecreasing(n) == sortincreasing(n)) {
            return false;
        }
        return true;
    }

    // Senin yazdığın sıralama mantığını korudum, sadece dizi boyutunu 4'e sabitledim.
    public static int sortincreasing(int n) {
        // HATA DÜZELTME: Basamak sayısını saymak yerine her zaman 4 kabul ediyoruz.
        // Örn: 21 sayısı -> 0021 olmalı.
        int[] arr = new int[4];
        int temp = n;

        // Diziyi doldur (Sondan başa doğru veya baştan sona fark etmez, sıralayacağız)
        for (int k = 0; k < 4; k++) {
            arr[k] = temp % 10;
            temp = temp / 10;
        }

        // SENİN BUBBLE SORT MANTIĞIN (DOKUNMADIM)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) { // digit-1 yerine 3 yazdım çünkü boyutu 4
                if (arr[j + 1] < arr[j]) {
                    int geçiçi = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = geçiçi;
                }
            }
        }

        // String birleştirme mantığın
        String kale = "";
        for (int i = 0; i < arr.length; i++) {
            kale = kale + arr[i];
        }
        return Integer.parseInt(kale);
    }

    public static int sortdecreasing(int n) {
        // HATA DÜZELTME: Yine dizi boyutu 4'e sabitlendi.
        int[] arr = new int[4];
        int temp = n;

        for (int k = 0; k < 4; k++) {
            arr[k] = temp % 10;
            temp = temp / 10;
        }

        // SENİN BUBBLE SORT MANTIĞIN (Büyüktür işareti ile)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[j + 1] > arr[j]) { // Büyükten küçüğe
                    int geçiçi = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = geçiçi;
                }
            }
        }

        String kale = "";
        for (int i = 0; i < arr.length; i++) {
            kale = kale + arr[i];
        }
        return Integer.parseInt(kale);
    }
}