import java.util.Scanner;

public class  Working{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("please can you write a number");
    int sayı1=input.nextInt();

    switch(sayı1){
        case 0:
            System.out.println("Bügün hava ne kadar da güzel");
            break;
        case 1:
            System.out.println("Bügün hava yağmurlu");
        case 2:
            System.out.println("Bügün hava parçalı bulutlu");
            break;
        case 3:
            System.out.println("Bügün havada duman kokusu var");
            break;
        default:
            System.out.println("Bügün hava yok");
    }



    }
}