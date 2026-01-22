import java.util.Scanner;


/*public class basic {
    public static void main(String[] args) {

    }
    public static void sayılarıtopla(int sayı){
        int toplam=0;
        while(sayı!=0) {
            toplam+=sayı;
            sayı--;
        }
    }
}*/



public class basic {
    public static void main(String[] args) {
        int sonuc = sayilariToplaRecursive(5);
        System.out.println("Toplam: " + sonuc);
    }


    public static int sayilariToplaRecursive(int sayi) {


        if (sayi == 0) {
            return 0;
        }


        return sayi + sayilariToplaRecursive(sayi - 1);
    }
}
