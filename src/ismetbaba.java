import java.util.Scanner;

public class ismetbaba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Let's create your first monster. Give it a cool name: ");
        String monsterName = input.next();
        System.out.print("\nchoose element\n [1] Fire\n [2] Water\n[3] Earth\nYour choice (1-3): ");
        int element = input.nextInt();
        if(element<1 || element>3) {
            System.out.print("\nhata adam gibi sayi gir");
            return;
        };
        System.out.print("choose pot:\n 1 normal\n 2 rage\nyour choice:");
        int pot = input.nextInt();
        if(pot<1 || pot>2) {
            System.out.print("\nhata adam gibi sayi gir");
            return;
        };
        System.out.print("\ninfluence gir bro birle on arasinda: ");
        int influence = input.nextInt();
        if(influence<1 || influence>10) {
            System.out.print("\nhata adam gibi sayi gir");
            return;
        };
        System.out.print("\nbu secimler beni AZDIRDI\n");

        System.out.println("Monster Profile Card");
        System.out.println("Name: "+monsterName);
        System.out.println("Element: "+element);
        System.out.println("Pot: "+pot);
        System.out.println(" ");
        System.out.println("HP: "+ (pot==2 ? element==2 ? 80+influence : 60+influence : element==2 ? 70+influence : 50+influence));
        System.out.println("AP: "+ (pot==2 ? element==1 ? 25+influence : 20+influence : element==1 ? 15+influence : 10+influence));
        System.out.println("DP: "+ (pot==2 ? element==2 ? 25+influence : +influence : element==2 ? 15+influence : 5+influence));
    }
}