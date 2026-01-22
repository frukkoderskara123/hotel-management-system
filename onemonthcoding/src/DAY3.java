import java.util.Scanner;

class constructors {
    String name;
    double bakiye;
}
public class DAY3 {
    public static void main(String[] args) {
        constructors hesap1 = new constructors();

    }

    public static void hesapcontrol (constructors hesap1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Can you write your name");
        hesap1.name = input.nextLine();
        System.out.println("Can you write your remainder");
        hesap1.bakiye = input.nextInt();
        String kar = "" + hesap1.bakiye;
        if (hesap1.name == null && kar == null) {
            return;
        }
    }
}


