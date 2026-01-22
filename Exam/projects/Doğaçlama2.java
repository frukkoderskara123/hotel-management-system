import java.util.Scanner;

public class Doğaçlama2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalSeconds = 0;
        int totalKm = 0;

        while (true) {
            totalKm++;
            System.out.print("km " + totalKm + " (m s): ");

            int minute = input.nextInt();
            int second = input.nextInt();

            input.nextLine();

            totalSeconds += (long)minute * 60 + second;

            System.out.print("Did you run more ? (Y/N) ");
            String runMore = input.nextLine().trim();

            if (runMore.equalsIgnoreCase("N")) {
                break;
            }
        }

        long totalH = totalSeconds / 3600;
        long totalM = (totalSeconds % 3600) / 60;
        long totalS = totalSeconds % 60;

        long avgSecTotal = totalSeconds / totalKm;
        long avgM = avgSecTotal / 60;
        long avgS = avgSecTotal % 60;

        System.out.println(totalH + ":" + totalM + ":" + totalS);
        System.out.println("Total km :" + totalKm);
        System.out.println("Average time :" + avgM + " " + avgS);
    }
}