import java.util.Scanner;

public class palindrome {
    public static boolean victory(String palindrome) {
        int i = palindrome.length() - 1;
        int k = 0;

        while (k < i) {
            if (palindrome.charAt(i) != palindrome.charAt(k)) {
                return false;
            }
            i--;
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime veya sayı giriniz:");
        String palindrome = input.nextLine();

        if (victory(palindrome))
            System.out.println("Bu bir palindromdur!");
        else
            System.out.println("Bu bir palindrom değildir.");
    }
}
