import java.util.Scanner;

public class Bomb {
    public static int hasarhesapla(int[][] harita, int sutün,int satır) {
        int toplamhasar=0;
        int i=0;
        int j=0;
        for ( i=0;i<harita.length;i++) {
            for ( j=0;j<harita[i].length;j++) {
                if (harita[i][j]==harita[satır][sutün]) {
                    break;
                }

            }
        }
        //if ((i==0 || i== harita.length) && (j==0 || j==harita[0].length-1) && (harita[i][j]!=harita[0][0],harita[0][harita.length]));






        return toplamhasar;


    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sutün=input.nextInt();
        int satır=input.nextInt();

    }
}