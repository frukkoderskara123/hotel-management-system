public class Dimensional{
    public static void main(String[] args) {
        int a = 0;
        int[][] list = new int[5][4];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                list[i][j] = a;
                a++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                //System.out.println(list[i][j]);
            }
        }
        double[][] art = {{1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };
        System.out.println(art[0].length);// art.length yazar isek sadece 3 eleman gösterir ama art[0].length yazar isek  burda 7 terim çıktı veri.
        for (double[] tarık : art) { // önce for each döngüsü için ilk for each bir array miş gibi yazcan sonra ikinci for each de normal
            // bir veri tipini bu oluşturduğumuz arrayin içinde gezdircen.
            for (double kale : tarık) {// bir veri tipini bu oluşturduğumuz arrayin içinde gezdircen
                System.out.println(kale);

            }

        }
        String kale[][]=new String [10][10];
        kale[0][1]="kale";
    }
}