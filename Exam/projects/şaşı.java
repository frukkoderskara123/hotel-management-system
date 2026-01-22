import java.util.Scanner;
import java.util.Arrays;

public class şaşı { ;
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        int[] kale={1,2,3,4,5};
        int[] ali={12,34,53,67};
        int[] çita={19,23,46,48,76,85,98};
        //Shıftıng
        for (int i=0;i<ali.length-1;i++){
            ali[i]=ali[i+1];
        }
        ali[ali.length-1]=89;
        System.out.printf(Arrays.toString(ali));// yazdırma yöntemi
        //Shuffling
        for (int i=0;i<kale.length;i++){
            int j=(int)(Math.random() * kale.length-1);
            int temp=kale[i];
            kale[i]=kale[j];
            kale[j]=temp;

        }
        System.out.print(Arrays.toString(kale));

        //copy
        System.arraycopy(ali,0,kale,3,2);
        System.out.println(Arrays.toString(kale));

        //binary Search
        int sıpa=0;
        int eşek=çita.length-1;
        int yazı=input.nextInt();
        int mid=(sıpa+eşek)/2;
        int i=0;
        while (yazı!=çita[mid]){
             mid=(sıpa+eşek)/2;
            if(yazı>çita[mid]){
                sıpa=mid+1;
            }
            if (yazı<çita[mid]){
                eşek=mid-1;
            }
            i++;
        }
        System.out.print(i);

    }

}