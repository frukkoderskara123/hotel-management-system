import java.util.Scanner;
public class yapıcımetot {
    String name;
    int bakiye;
    public yapıcımetot(String gelen, int bakiye) {
        this.name = gelen;
        this.bakiye = bakiye;
        System.out.println("Account was made succesfully");

    }


    public static void main(String[] args) {// Static yazmazsan java bunun başlangıç metodun olduğunu anlayamaz
        Scanner input = new Scanner(System.in);
        System.out.println("Can you write your name");
        String gelen = input.nextLine();
        System.out.println("Can you write your remainder");
        int bakiye = input.nextInt();


        yapıcımetot kale = new yapıcımetot(gelen, bakiye);// bu ram de yer açar ve üstteki yapıcımetodu kullanmanı sağlar

        System.out.println("Username: " + kale.name);
        System.out.println("Username remainder:" + kale.bakiye);
        String index = "Yes";

        do {
            System.out.println("What do you do");
            System.out.println("1: PARA ÇEKME");

            System.out.println("2: PARA YATIRMA");

            System.out.println("3: BAKİYE SORGULA");

            int chosen = input.nextInt();


            switch (chosen) {

                case 1:
                    System.out.println("ne kadar para istiyosunuz");
                    int tutar = input.nextInt();
                    if (kale.bakiye > tutar) {
                        kale.bakiye -= tutar;
                        System.out.println("Başka bir işleminiz var mıydı");
                        input.nextLine();
                        index = input.nextLine();
                    } else {
                        System.out.println("yetersiz bakiye tekrar deneyiniz");
                        System.out.println("Başka bir işleminiz var mıydı");
                        input.nextLine();
                        index = input.nextLine();
                    }

                break;
                case 2:
                    System.out.println("Ne kadar yatırmak istersiniz");
                    int alım = input.nextInt();
                    kale.bakiye += alım;
                    System.out.println("işlem başarıyla tamamlanmıştır");
                    System.out.println("Başka bir işleminiz var mıydı");
                    input.nextLine();
                    index = input.nextLine();
                    break;
                case 3:
                    System.out.println("Bakiyeniz " + kale.bakiye + "dir " + kale.name + "bey");
                    System.out.println("Başka bir işleminiz var mıydı");
                    input.nextLine();
                    index = input.nextLine();
                    break;
            }
        }while(index.equalsIgnoreCase("yes"));

    }
}

