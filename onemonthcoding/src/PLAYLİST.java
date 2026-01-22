import java.util.Scanner;

// 1. CLASS: Song (Veriyi tutan sınıf)
class Song {
    String title;
    int duration;

    // Constructor (Kurucu Metot): Nesne oluşurken verileri alır
    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}

// 2. CLASS: Playlist (Ana sınıf)
public class PLAYLİST{ // Sınıf isimleri İngilizce karakter olmalı (PLAYLİST değil Playlist)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Düzeltme 1: Array'e kapasite veriyoruz (Örneğin 3 şarkı)
        Song[] songs = new Song[3];

        // Kullanıcıdan şarkıları alma döngüsü
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Please, enter song title " + (i+1) + ":");
            String title = input.nextLine();

            System.out.println("Please, enter duration (seconds):");
            int duration = input.nextInt();

            // Düzeltme 2: Scanner hatasını (Buffer) temizlemek için boş okuma
            input.nextLine();

            // Düzeltme 3: Dizinin o sırasındaki kutusuna YENİ BİR NESNE koyuyoruz
            songs[i] = new Song(title, duration);
        }

        // Toplam hesabı yapan metodu çağırıyoruz
        calculateTotal(songs);
    }

    // Toplam süreyi hesaplayan metot
    public static void calculateTotal(Song[] songs) {
        int totalTime = 0;

        for (Song s : songs) { // "For-each" döngüsü ile daha temiz yazım
            totalTime += s.duration; // Nesne Etkileşimi
        }

        System.out.println("Total Playlist Duration: " + totalTime + " seconds");
    }
}