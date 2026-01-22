import java.util.Scanner;

class Book {
    String title;
    boolean isborrowed;

    public Book(String TITLE) {
        this.title = TITLE;
        this.isborrowed = false;
    }
}

class library {
    Book[] books;

    public library(int CAPACITY) {
        this.books = new Book[CAPACITY];
    }

    public void addbook(String TITLE, int index) {
        Book kitap1 = new Book(TITLE);
        books[index] = kitap1;
    }

    public void borrowbook(String bookname) {
        // DÜZELTME 1: Başlangıçta kitap bulunmadı varsayıyoruz (false)
        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            // DÜZELTME 2: (Null Check) Kutu boşsa pas geç, yoksa hata verir!
            if (books[i] != null) {

                if (books[i].title.equalsIgnoreCase(bookname)) {

                    found = true; // Kitabı bulduk! Bayrağı kaldır.

                    if (books[i].isborrowed == true) {
                        System.out.println("Sorry, this book is already borrowed.");
                    } else {
                        books[i].isborrowed = true; // Ödünç ver
                        System.out.println("You successfully borrowed " + bookname);
                    }
                    break; // Kitabı bulduk, artık diğerlerine bakmaya gerek yok.
                }
            }
        }

        // DÜZELTME 3: Döngü bitti. Bayrak hala inikse (false), kitap yok demektir.
        if (found == false) {
            System.out.println("Book not found: " + bookname);
        }
    }
}

public class DAY6 {
    public static void main(String[] args) {
        library arr1 = new library(3);

        // DÜZELTME 4: Önce kitap eklemelisin! Yoksa boş kütüphanede arama yaparsın.
        arr1.addbook("Harry Potter", 0);
        arr1.addbook("Matrix", 1);

        System.out.println("--- İŞLEMLER ---");
        arr1.borrowbook("Harry Potter");  // Başarılı
        arr1.borrowbook("Harry Potter");  // Zaten alındı
        arr1.borrowbook("Matrix");        // Başarılı
        arr1.borrowbook("Spiderman");     // Bulunamadı
    }
}