import java.util.ArrayList;
public class ORN1 {
    public static void main(String[] args) {
        ArrayList<String> rohan=new ArrayList<>();

        rohan.add("Atlılar");
        rohan.add("okçular");
        ArrayList<String> gondor =new ArrayList<>();
        gondor.add("Şovolyeleler");
        gondor.add("Mızraklılar");
        ArrayList<String> birleşikordu=new ArrayList<>();
        birleşikordu.addAll(rohan);
        birleşikordu.addAll(gondor);// add all sayesinde iki arraylisti tek bir arrayliste birleştirdik
        System.out.println(birleşikordu);
        rohan.clear();
        System.out.println(rohan.isEmpty());
        ArrayList<String> kemal=new ArrayList<>(birleşikordu.subList(0,2));// bir listeyi başka bir listeye kopyalama
        System.out.println(kemal);
        System.out.println(birleşikordu.subList(0,2));// aynı stringlerdeki substring gibi keser ilk index dahil ama son indeks dahil değildir
        ArrayList<String> orjinal = new ArrayList<>();
        orjinal.add("Elma");

// REFERANS ATAMA (TEHLİKELİ): İkisi de aynı listeye bakar!
        ArrayList<String> sahteKopya = orjinal;

        sahteKopya.add("Karpuz");
// Sonuç: 'orjinal' listesine baktığında orada da "Karpuz" görürsün! Çünkü ikisi aslında aynı liste.

    }
}