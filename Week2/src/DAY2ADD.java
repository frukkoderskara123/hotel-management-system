import java.util.ArrayList;
class urun {
    String ad;
    double fiyat;
    public urun(String ad,double fiyat) {
        this.ad=ad;
        this.fiyat=fiyat;
    }
}
public class DAY2ADD {
    public static void main(String[] args) {
    ArrayList<urun> sepet=new ArrayList<>();
    urun ürün1=new urun("Leptop",200);
    sepet.add(ürün1);
    sepet.add(new urun("kara kalem",200));
    double index=0;
    for (urun şato : sepet) {
        index+=şato.fiyat;
    }
    for (urun kitap :sepet) {
        System.out.println(kitap.ad);
    }
    System.out.println(index);


    }
}