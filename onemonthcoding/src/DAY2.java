import java.util.Scanner;
class urun {
    String name;
    double price;
    int stock;
}




public class DAY2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        urun[] ürün = new urun[3];

        ürün[0] = new urun(); // bunları sadece bir kez yaz bir daha yazarsan sıfırlarsın içindekini
        ürün[0].name = "Mouse";
        ürün[1] = new urun();
        ürün[1].name = "klavye";
        ürün[2] = new urun();
        ürün[2].name = "Monitör";


        ürün[0].price = 150;

        ürün[1].price = 300;

        ürün[2].price = 2500;


        ürün[0].stock = 10;

        ürün[1].stock = 5;

        ürün[2].stock = 2;


        urunsatınal("klavye",2,ürün);

        endegerlistok(ürün);



    }

    public static void urunsatınal(String name, int total, urun[] ürün) {
        for (int i = 0; i < ürün.length; i++) {
            if (ürün[i].name.equalsIgnoreCase(name)) {
                if (ürün[i].stock >= total) {
                    ürün[i].stock -= total;
                    System.out.println("ürün bulundu  ve yeterli stoğa sahip ve fiyatı " + ürün[i].price * total);
                    return;
                } else {
                    System.out.println("Stok yetersiz sadece "+ürün[i].stock + " kadar var");
                    return;
                }
            }
        }
        System.out.println("ürün bulunumadı");
        return;
    }

    public static void endegerlistok(urun[] ürün) {
        double max = 0;
        String kale="";
        for (int i = 0; i < ürün.length; i++) {
            if (ürün[i].price * ürün[i].stock > max) {
                max = ürün[i].price * ürün[i].stock;
                kale=ürün[i].name;
            }
        }
        System.out.println("En değerli ürün "+kale+" ve onun fiyatı "+max);
    }
}