import java.util.Scanner;

public class Examcode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(stepcount(n));
        if (isvalidkapkeraker(n)) {
            if (sortdecreasing(n)-sortincreasing(n)==n) {
                System.out.println("Kapcerakar sayısı "+n);
            }
            else System.out.println(n+" kapkerakar sayısı değildir");
        }
        else
            System.out.println("Tekrar deneyiniz");



    }

    public static int stepcount(int n) {
        int digit = 0;
        int c = n;
        while (c != 0) {
            c = c / 10;
            digit++;
        }
        return digit;
    }

    public static boolean isvalidkapkeraker(int n) {
        boolean kare = false;
        boolean yanıt = false;
        String b = "" + n;
        for (int i = 0; i < b.length() - 1; i++)
            for (int j = i + 1; j < b.length(); j++) {
                if (b.charAt(i) != b.charAt(j)) {
                    kare = true;
                    break;
                }
            }
        if (b.length() <= 4 && kare) {
            yanıt = true;
        }
        return yanıt;

    }

    public static int sortincreasing(int n) {
        int temp = n;
        int digit = 0;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        int[] arr = new int[digit];
        temp = n;
        for (int k = 0; k < digit; k++) {
            arr[k] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < digit - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int geçiçi = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = geçiçi;
                }
            }
        }
        String kale = "";
        for (int i = 0; i < arr.length; i++) {
            kale = kale + arr[i];
        }
        int sonyanıt = Integer.parseInt(kale);
        return sonyanıt;

    }

    public static int sortdecreasing(int n) {
        int temp = n;
        int digit = 0;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        int[] arr = new int[digit];
        temp = n;
        for (int k = 0; k < digit; k++) {
            arr[k] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < digit - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int geçiçi = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = geçiçi;
                }
            }
        }
        String kale = "";
        for (int i = 0; i < arr.length; i++) {
            kale = kale + arr[i];
        }
        int sonyanıt = Integer.parseInt(kale);
        return sonyanıt;


    }
}