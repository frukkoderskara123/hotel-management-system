import java.util.Arrays;
import java.util.Scanner;
public class arazi{
    static int[] values=new int[3];
    static int[] peaks=new int[0];
    public static void cleanData(int[] values) {
        int temp=0;
        for (int i=0;i< values.length;i++){
            if (values[i]>0){
                temp++;
            }
        }
        int j=0;
        int[] newvalues=new int[temp];
        for (int i=0;i<values.length;i++) {
            if (values[i] > 0) {
                newvalues[j] = values[i];
                j++;
            }
        }
        values=newvalues;
        System.out.println(Arrays.toString(values));
    }
    public static void findPeaks(int[] values){
        int k=0;

        for (int i=1;i<values.length-2;i++) {
            if (values[i-1]<values[i] && values[i]>values[i+1]){
                    peaks=new int[peaks.length+1];
                    peaks[k]=values[i];
                    k++;

            }
        }
        System.out.println(Arrays.toString(peaks));
    }
    public static void analyzePeaks(int[] peaks){
        int kale=0;
        for (int i=0;i<peaks.length;i++) {
            if (peaks[i]>peaks[i+1]) {
                kale=peaks[i];
            }
            else
                kale=peaks[i+1];
        }
        System.out.println(kale);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        for (int i=0;i< values.length;i++) {
            values[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(values));
        cleanData(values);
        findPeaks(values);


    }
}