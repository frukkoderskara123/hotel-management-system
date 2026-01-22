import java.util.Arrays;
import java.util.Scanner;

public class new2 {

    static String[] bookTitles=new String[0];
    static int[] quantities=new int[0];

    public static void donateBooks(String title,int count) {
        for (int i=0;i<bookTitles.length;i++) {
            if (title == bookTitles[i]) {
                quantities[i] = quantities[i] + count;
            }
        }
            String[] newbookTitles=new String[bookTitles.length+1];
            int[] newquantities=new int[quantities.length+1];
            for (int k=0;k<bookTitles.length;k++) {
                newquantities[k]=quantities[k];
                newbookTitles[k]=bookTitles[k];
            }
            newbookTitles[newquantities.length-1]=title;
            newquantities[newquantities.length-1]=count;
            bookTitles=newbookTitles;
            quantities=newquantities;

        }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("What is your book for donating");
        String title=input.nextLine();
        System.out.println("How much books do you donate to our");
        int count=input.nextInt();
        donateBooks(title,count);
        System.out.println(Arrays.toString(bookTitles));
        System.out.println(Arrays.toString(quantities));
    }
}