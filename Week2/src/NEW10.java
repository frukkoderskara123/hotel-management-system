
// 1. BABA CLASS (Temel)
class Hayvan {
    private String isim;
    private int enerji;

    // Baba Constructor: "Bana isim ve enerji vermeden beni oluşturamazsın"
    public Hayvan(String isim, int enerji) {
        this.isim = isim;
        this.enerji = enerji;
    }

    public void kükre() {
        System.out.println(isim + " bağırıyor: Hrr!");
    }
}

// 2. ÇOCUK CLASS (Miras Alan)
class Aslan extends Hayvan {

    // Çocuğun Constructor'ı
    public Aslan(String isim, int enerji) {
        // 🚨 KRİTİK NOKTA: Babanın constructor'ını çağırıyoruz.
        // "Baba al şu ismi ve enerjiyi, sen kendi tarafında ayarla" diyoruz.
        super(isim, enerji);
    }

    // Aslan isterse babanın metodunu ezip değiştirebilir (Override)
    @Override
    public void kükre() {
        System.out.println("Aslan ROARR diye kükredi!");
    }
}

// 3. TEST KISMI
public class NEW10 {
    public static void main(String[] args) {
        // Aslan oluştururken 'super' sayesinde isim ve enerji babaya gidip kaydolur.
        Aslan simba = new Aslan("Simba", 100);

        simba.kükre(); // Çıktı: Aslan ROARR diye kükredi!
    }
}