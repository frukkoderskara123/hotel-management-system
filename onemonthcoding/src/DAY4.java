import java.util.Scanner;  // sistemin hangi metottan başlayacağını bilmesi için ana methoda static eklenmeli
class product{ // senin ana methodun içinde çağıracağın methodda static olmalı
    String name;// eğer uygulayacağın method bir nesneye özel değil birden çok nesne içinse o zaman da static var
    int price;// Nesneye özgü bir şekilde method kullancaksak o obje sınıfının içine yazılır

}
public class DAY4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many products");
        int size=input.nextInt();
        input.nextLine();
        product[] products=new product[size];
        for (int i=0;i<products.length;i++) {
            System.out.println("What is name of your product");
            products[i]=new product();
            products[i].name=input.nextLine();
            System.out.println("What is price of your product");
            products[i].price=input.nextInt();
            input.nextLine();
        }
        calculatetotalbill(products);
    }
    public static void calculatetotalbill(product[] products) {
        int totalbill=0;
        for (int i=0;i<products.length;i++) {
            totalbill+=products[i].price;
        }
        System.out.printf("Total bill: %d",totalbill);
    }
}