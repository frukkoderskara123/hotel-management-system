class sekıl {
    String renk;
    public void renkSoyle() {
        System.out.printf("Bu şeklin rengi: [%s]",this.renk);
    }
}
class daire extends sekıl // bunu yazarak daire sınıfı tüm sekıl sınıfı ozelliklerine sahip olur
 { double yarıcap;

}
public class lale {
    public static void main(String[] args) {
        daire DAİRE=new daire();
        DAİRE.renk="yeşil";
        DAİRE.renkSoyle();
    }
}