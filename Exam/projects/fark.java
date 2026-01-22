import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class fark {
    public static void main(String[] args)  {
        File dosya = new File("pardon.txt");

        try {

            Scanner input = new Scanner(dosya);
            PrintWriter satır = new PrintWriter(dosya);
            satır.print("kale");
            satır.println("ali");
            satır.print("prens");
            satır.println("lale");
            satır.print(12);
            satır.println(345);
            String a = input.nextLine();

            while (input.hasNextBigInteger()) {
                System.out.println(a);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}