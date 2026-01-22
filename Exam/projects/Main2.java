import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tüm rakamları birbirinden farklı olan bir sayı girin:");

        int num = input.nextInt();
        String numStr = String.valueOf(num);
        int k = numStr.length();

        boolean hasDuplicate = false;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                System.out.println(j);

                if (numStr.charAt(i) == numStr.charAt(j)) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) {
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("HATA: Sayı tekrar eden basamaklar içeriyor.");
        } else {
            System.out.println("Başarılı: Sayıdaki tüm basamaklar birbirinden farklı.");
        }
    }
}