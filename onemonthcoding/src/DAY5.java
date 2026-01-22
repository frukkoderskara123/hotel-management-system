import java.util.Scanner;

class Fighter {
    String name;
    int health;
    int damage;
    public Fighter(String ad,int hasar) {
        this.health=100;
        this.name=ad;
        this.damage=hasar;
    }
    public void attack(Fighter opponent) {
        opponent.health-=this.damage;
        System.out.println(this.name + " attacked " + opponent.name + " -> " + opponent.name + " HP: " + opponent.health);
    }
    public boolean isalive() {
        if (this.health>0) {
            return true;
        }
        return false;

    }
}
public class DAY5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What damage of hektor");
        Fighter Hektor = new Fighter("Hektor", input.nextInt());// burda direk parantezin içinde alabiliyosun;
        System.out.println("What damage of achillus");
        Fighter achillus = new Fighter("Achillus", input.nextInt());
        while (Hektor.isalive() && achillus.isalive()) {
            Hektor.attack(achillus);
            if (achillus.isalive()==false) {
                break;
            }
           achillus.attack(Hektor);
        }


    }
}