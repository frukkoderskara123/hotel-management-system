import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        /* int[] kale={1,2,3,4};
        double[] şato={1.0,2.3,4.5};
        System.out.println(kale[1]);
        int[] arr1=new int[2];
        Scanner input=new Scanner(System.in);
        System.out.println("Can you make a list");
        int[] arr2=new int[3];
        for (int i=0;i< arr2.length;i++) {
            arr2[i]=input.nextInt();
        }
        int total=0;
        for (int i=0;i< arr2.length;i++) {
              total=total+arr2[i];
        }
        System.out.println(total);
        int arr3[][]={{10,20,30},{40,50,60},{70,80,90}};
        System.out.println("Eleman first line and second column :"+arr3[1][2]);
        int arr4[][]=new int[2][3];
        arr4[0][0]=10;
        arr4[0][1]=20;
        arr4[0][2]=30;
        arr4[1][0]=40;
        arr4[1][1]=50;
        arr4[1][2]=60;
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++) {
                System.out.println("Elemean "+i+" and "+j+" = "+arr4[i][j]);
            }
        }/*
        int j=0;
        double value=0;
        double temp=0;
        double[] myList={10,20,30,40};
        for (int i=myList.length-1;i>0;i--) {
             j=(int)(Math.random()*(i+1));
             System.out.println(j);
             temp=myList[i];
            myList[i]=myList[j];
            myList[j] = temp;
            System.out.println(myList[j]);
        }*/

                int[] dizi = {1, 2, 3, 4};
                int n = dizi.length;

                System.out.print("Başlangıç: ");
                printArray(dizi); // Çıktı: 1 2 3 4

                // --- Sola Kaydırma İşlemi ---
                // Her elemanı bir sonraki elemanın yerine kopyala
                for (int i = 0; i < n - 1; i++) {
                    dizi[i] = dizi[i + 1];
                }

                // Kaydırma sonrası son pozisyona yeni değer atama
                dizi[n - 1] = 99;

                System.out.print("Sonuç:     ");
                printArray(dizi); // Çıktı: 2 3 4 99
            }

            // java.util.Arrays.toString yerine manuel yazdırma metodu
            public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }














