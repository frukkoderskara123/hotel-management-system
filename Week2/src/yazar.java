import java.util.ArrayList;
class Defenseunit {
    private String code;
    private int health;
    public Defenseunit(String code,int health) {
        this.code=code;
        this.health=health;
    }
    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public void reportstatus () {
        System.out.printf("Unıt [%s] - Health: [health",this.code,this.health);
        }
    public  int gethealth(int health) {
        if (this.health>0 && this.health<=100) {
            this.health=health;
            return this.health;
        }
        System.out.println("Health have to be between 0 and 100");
        return this.health;
    }
}
class Laserturret extends Defenseunit {
    int ammo;
    public Laserturret(String code,int health,int ammo) {
        super(code, health);

        this.gethealth(health);
        this.ammo=ammo;

    }


}
public class yazar {
    public static void main(String[] args) {
        ArrayList<Defenseunit> defenseLine=new ArrayList<>();
        defenseLine.add(new Defenseunit("Wall-01" ,100 ));
        defenseLine.add(new Laserturret("Turret-A", 100 , 50 ));

    }
}
