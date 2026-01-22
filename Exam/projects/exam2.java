 public class exam2 {
    public static void main(String[] args) {
                String giris = "12a"; // yanlış bir veri
                try {
                    int sayi = Integer.parseInt(giris);
                    System.out.println("Sayı: " + sayi);
                } catch (NumberFormatException e) {
                    System.out.println("Geçersiz sayı formatı!");
                }
        int sayi = 42;
        String s3= "" + sayi;
        System.out.println();

    }
}