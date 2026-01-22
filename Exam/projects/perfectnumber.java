import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        // 1'den num-1'e kadar olan sayıları kontrol et
        for (int i = 1; i < num; i++) {
            if (num % i == 0) { // i, num'un böleni mi?
                sum += i;
                System.out.println(sum);// toplamına ekle
            }
        }

        // Bölenlerin toplamı sayıya eşit mi?
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}