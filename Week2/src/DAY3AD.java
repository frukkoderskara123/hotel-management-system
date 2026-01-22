import java.util.ArrayList;
class Book {
    String title;
    String author;
    boolean isavaliable;
    public Book(String title,String author) {
        this.title=title;
        this.author=author;
        this.isavaliable=true;
    }
    public String getStatus() {
        if (this.isavaliable) {
            return "["+this.title+"] by ["+this.author+"] (AVALİABLE)";}
        else {
            return "["+this.title+"] by ["+this.author+"] (BORROWED)";}
    }

}
public class DAY3AD {
    public static void main(String[] args) {
        ArrayList<Book> kitap1=new ArrayList<>();
        kitap1.add(new Book("Harry Potter","JK ROWLİNG"));
        kitap1.add(new Book("Lord of the Rings", "J.R.R. Tolkien"));
        kitap1.add(new Book("The Alchemist", "Paulo Coelho"));
        System.out.println("Lord of the rings is borrowed");
        kitap1.get(1).isavaliable=false;
        System.out.println("The alchemist is borrowed");
        kitap1.get(2).isavaliable=false;
        int i=0;

        for (Book p : kitap1) {
            System.out.println(p.getStatus());
            if (p.isavaliable) {
                i++;
            }
        }
        System.out.println(i);




    }
}