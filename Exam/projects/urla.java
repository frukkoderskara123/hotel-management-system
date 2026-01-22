import java.net.URL;
import java.util.Scanner;
public class urla{
    public static void main(String[] args){
        try {
            String adres = "https://www.google.com/index.html";
                        URL url = new URL(adres);

                        // URL akışını Scanner'a veriyoruz
                        Scanner input = new Scanner(url.openStream());

                        while (input.hasNext()) {
                            String satir = input.nextLine();
                            System.out.println(satir); // HTML kodlarını ekrana basar
                        }
                    } catch (Exception e) {// exception hata demektir ve burda exception kelimesini e diye değişkene atıyo oluşan hatayı enin içine paketle
                        System.out.println("Hata: " + e.getLocalizedMessage());
                    }
                }
            }
