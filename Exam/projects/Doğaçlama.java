import java.util.Scanner;


public class Doğaçlama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km=1;
        char kale;
        int minute;
        int second;
        int totalsecond=0;



        do {
            System.out.println("Can you write minute");
             minute=input.nextInt();
            System.out.println("Can you write second");
            second=input.nextInt();
            System.out.println("km "+km+" (m s): "+minute+" "+second);
            System.out.print("Did you run more ? (Y/N)");
            input.nextLine();
            kale=input.nextLine().charAt(0);
             totalsecond=totalsecond+minute*60+second;
             km++;
            }
        while (kale!='N');

                if (totalsecond>3600) {
                    km=km-1;
                    System.out.println(totalsecond/3600+":"+totalsecond/60+":"+totalsecond%3600);
                    System.out.println("Total km :"+km);
                    System.out.println("Average time :"+km/totalsecond);}

                else {
                    km=km-1;
                    System.out.println(0+":"+totalsecond/60+":"+totalsecond%60);
                    System.out.println("Total km :"+km);
                    System.out.println("Average time :"+km/totalsecond);}

            }



        }

