import java.util.stream.StreamSupport;

class hero {
    private String name;
    private int health;
    private int level;
    private int experience;
    private boolean isDead;
    public hero(String name) {
        this.name=name;
        this.health=100;
        this.level=0;
        this.experience=0;
        this.isDead=false;
    }
    public void takeDamage(int amount) {
        this.health-=amount;
        if (this.health<=0) {
            this.health=0;
            this.isDead=true;
        }
        System.out.printf("[%s] took [%d] damage : HP:[%d]\n",this.name,amount,this.health);
    }
    public void heal(int amount) {
        if (this.isDead) {
            System.out.println("Hero is dead. Cannot heal.");
            return;
        }
        this.health+=amount;
        if (this.health>100) {
            this.health=100;
        }
        System.out.printf("[%s] healed [%d]. HP: [%d]\n",name,amount,health);

    }
    public void gainexperience(int amount){
        this.experience+=amount;
        if(this.experience>=1000) {
            this.level+=1;
            this.experience-=1000;
            System.out.printf("LEVEL UP! [%s] is now Level [%d]!\n",this.name,this.level);
        }
    }
    public String getName() {
        return this.name;
    }
    public int getHealth(){ return this.health;}
    public int getlevel() {return this.level;}
    public int getexperience() { return this.experience;}
    public boolean getisDead() { return this.isDead; }

    public void setName(String name) {
        if (name.length()>=3) {
            this.name = name;
        }
        else {
            System.out.println("Error");
        }
    }

}
public class King123 {
    public static void main(String[] args){
        hero deneme1=new hero("Can");
        System.out.println(deneme1.getName());
        System.out.println(deneme1.getexperience());
        System.out.println(deneme1.getHealth());
        System.out.println(deneme1.getlevel());
        System.out.println(deneme1.getisDead());
        deneme1.setName("AL");
        deneme1.takeDamage(20);
        deneme1.setName("Kaan");
        deneme1.heal(20);
        deneme1.gainexperience(1200);
    }
}