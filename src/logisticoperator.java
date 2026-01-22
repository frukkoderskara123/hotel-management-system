
    import java.util.Scanner;
    public class logisticoperator {
        public static void main(String[] args) {
            Scanner String=new Scanner(System.in);
            System.out.println("lütfen bir sayı giriniz");
            int number1=String.nextInt();
            System.out.println("lütfen bir sayı giriniz");
            int number2=String.nextInt();
            boolean even=number1%2==0;
            boolean even2=number2%2==0;
            System.out.println(even);
            System.out.println(even2);
            if  (even || even2)
                System.out.println("İşleminiz başarılı 1");
            if  (even && even2)
                System.out.println("İşleminiz başarılı 2");
            if  (even ^ even2)
                System.out.println("İşleminiz başarılı 3");
        }
    }
