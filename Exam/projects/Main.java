import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main{
    public  static void main(String[] args) throws FileNotFoundException {
        File ornek=new File("kale");
        System.out.println("dosya var mı"+ornek.exists());
        System.out.println("dosya okunabilir mi"+ornek.canRead());
        System.out.println("dosya yazılabilir mi"+ornek.canWrite());
        System.out.println("dosya boyutu "+ornek.length());
        System.out.println("dosya erişimi"+ornek.getAbsolutePath());
        PrintWriter çıktı=new PrintWriter(ornek);
        çıktı.println("Başlık");
        çıktı.print("1.öncül :");
        çıktı.print("Günlerden pazartesi hava güneşli");
        System.out.println(çıktı);
        çıktı.close();
        try (PrintWriter output = new PrintWriter("otomatik.txt")) {
            output.println("Bu dosya otomatik kapatılacak.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

