import java.util.ArrayList;
import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> kale=new ArrayList<Integer>();
        kale.add(10);
        kale.add(20);
        kale.add(30);
        kale.add(40);
        kale.add(input.nextInt());
        kale.set(1,input.nextInt());
        kale.remove(0);
        System.out.println(kale);
        ArrayList<String> siparişler=new ArrayList<String>();
        siparişler.add("çorba");
        siparişler.add("Pizza");
        siparişler.add("Kebap");
        siparişler.add("Lahana");
        siparişler.set(1,"Hamburger");
        siparişler.remove("Lahana");
        System.out.println(siparişler.size());
        System.out.println(siparişler);
        siparişler.add(1,"Kara havuç");
        System.out.println(siparişler);
        ArrayList<Integer> notlar=new ArrayList<>();
        notlar.add(45);
        notlar.add(85);
        notlar.add(30);
        notlar.add(90);
        notlar.add(50);
        for (int i=0;i<notlar.size();i++) {
            System.out.println(notlar.get(i));
        }
        for (Integer p : notlar) {
            if (p>=50) {
                System.out.printf("Geçti %d\n",p);
            }
            else {
                System.out.printf("Kaldı %d\n",p);
            }

        }
        ArrayList<Integer> kazananlar=new ArrayList<>();
        kazananlar.add(15);
        kazananlar.add(23);
        kazananlar.add(42);
        kazananlar.add(8);
        kazananlar.add(16);
        System.out.println("Bir sayı giriniz");
        int sayi=input.nextInt();
        if (kazananlar.contains(sayi)) {
            System.out.println("Tebrikler kazandınız");
            System.out.println(kazananlar.indexOf(sayi));// listedeki indeksini verir
        }

        else {
            System.out.println("Malesef kaybettiniz"); }
        kazananlar.clear(); // tüm arraaylistteki elemanları temizler
        System.out.println(kazananlar.size());//Listenin boyutunu verir






    }


}