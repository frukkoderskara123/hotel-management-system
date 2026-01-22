import java.util.ArrayList;
class zombie {
    String type;
    int hp;
    public zombie(String type,int hp) {
        this.type=type;
        this.hp=hp;
    }
    public String toString() {
        return "ZOMBIE: ["+type+"] - HP: ["+hp+"]";

    }
}
public class şişli {
    public static void main(String[] args) {
        ArrayList<zombie> horde=new ArrayList<>();
        horde.add(new zombie("Tank", 1000));

        horde.add(new zombie("Walker", 40));

        horde.add(new zombie("Runner", 30));

        horde.add(new zombie("Boss", 500));

        horde.add(new zombie("Crawler", 10));

        for (zombie p : horde) {
            System.out.println(p.toString());
        }

        horde.removeIf(x-> x.hp<50);// ilk zombie takma isimdir,-> anlamı soldaki değişkeni al sağdakinin yerine koy,ve sonuç true ise listeden sil bu komut
        // zaten bir döngüdür bir daha döngünün içine almana gerek yok. // ilk isim ile ikinci isim kesinlikle biribiriyle aynı olmalı

        for (zombie l : horde) {
            System.out.println(l.type);
        }
    }
}