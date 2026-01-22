import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        int first = 0, second = 1; // Fibonacci serisinin ilk iki terimi

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // İlk terimi yazdır
            int next = first + second;     // Sonraki terimi hesapla
            first = second;                // Bir sonraki döngü için kaydır
            second = next;
        }
    }
}