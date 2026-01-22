import java.util.Scanner;
class character{
    int health;
    int power;
    public character(int can,int güç){
        this.health=can;
        this.power=güç;

    }
    public void displayinfo(String name){
        System.out.println("Character name:"+name);
        System.out.println("Character health:"+this.health);
        System.out.println("Character power:"+this.power);

    }
}
public class Oneweekproje {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int can=0;
        int güç=0;
        System.out.println("Please can you write your character's name");
        String name=input.nextLine();
        System.out.println("What type do your user?");
        String a="mage";
        String b="warrior";
        System.out.printf("%-10s",a);
        System.out.printf("%10s\n",b);
        System.out.println("+----------+----------+");
        System.out.println("Health:60   Health:100");
        System.out.println("Power :100   Power :50");
        String kind=input.nextLine();

        if (kind.equalsIgnoreCase("mage")){
            can=60;
            güç=100;
        }
        if (kind.equalsIgnoreCase("warrior")) {
            can=100;
            güç=50;
        }
        character şavolye=new character(can,güç);// bunu oluşturduğun anda can ve güç değeri değişmez bi daha o anki halini alır
        şavolye.displayinfo(name);
    }
}