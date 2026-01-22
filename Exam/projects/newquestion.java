import java.util.Arrays;
public class newquestion {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Metotları burada çağıracaksın:
        puanlariHesapla(answers, keys);
        int enIyi = enBasariliOgrenciyiBul(answers, keys);
        System.out.println("En başarılı öğrenci indeksi: " + enIyi);
        soruzorlukanalizi(answers,keys);
    }
    public static void puanlariHesapla(char[][] answers,char[] keys){
        int[] kale=new int[answers.length];
        for (int i=0;i<answers.length;i++) {
            int index=0;//Burda index ve sayıyı araya yazdım çünkü tekrar 0 lanmalı ki hesap doğru çıksın
            int sayı=0;//
            for (int j=0;j<answers[i].length;j++) {//Burda answers[] içine i ye göre yazdım çünkü sutün ve satır sayısı aynı değil o yüzden
                if (keys[index]==answers[i][j]) {
                    sayı++;
                    kale[i]=sayı;
                }
                index++;
            }
        }
        for (int i=0;i<kale.length;i++) {
            System.out.println(kale[i]);
        }
    }
    public static int enBasariliOgrenciyiBul(char[][] answers,char[] keys) {
        int[] kale=new int[answers.length];
        for (int i=0;i<answers.length;i++) {
            int index=0;
            int sayı=0;
            for (int j=0;j<answers[i].length;j++) {
                if (keys[index]==answers[i][j]) {
                    sayı++;
                    kale[i]=sayı;

                }
            }
        }
            int n = kale.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (kale[j] > kale[j + 1]) {
                        int gecici = kale[j];
                        kale[j] = kale[j + 1];
                        kale[j + 1] = gecici;
                    }
                }
            }
            return kale[kale.length-1];
    }
    public static void soruzorlukanalizi(char[][] answers,char[] keys) {
        int[] yüzde=new int[answers[0].length];

        for (int i=0;i<answers[0].length;i++) {
            int sayı=0;
            for (int j=0;j<answers.length;j++) {
                if (keys[i]==answers[j][i]) {
                    sayı++;
                    yüzde[i]=sayı;
                }
            }
        }
        for (int i=0;i<yüzde.length;i++) {
            System.out.println((double)yüzde[i]*100/10);
        }


    }
}

