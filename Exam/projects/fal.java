import java.util.Scanner;
public class fal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        if (palindrom(a)){
            System.out.println("number is palindrom");
        }
        else
        { System.out.println("number is not polindrom");}


    }

    public static boolean palindrom(String a) {

        if (a.length() == 1 || a.length() == 0) {
            return true;
        }
        if (a.charAt(0) == a.charAt(a.length() - 1)) {
            return palindrom(a.substring(1, a.length() - 1));
        } else {
            return false;
        }
    }
}