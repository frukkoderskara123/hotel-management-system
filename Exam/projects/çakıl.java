/*public class çakıl {
    public static void main(String[] args) {
        // 1. 5 Şube, 7 Günlük matris oluşturma [cite: 27-29]
        double[][] satislar = new double[5][7];

        // İçini rastgele doldur [cite: 121-125]
        for (int i = 0; i < satislar.length; i++) {
            for (int j = 0; j < satislar[i].length; j++) {
                satislar[i][j] = Math.random() * 1000;
            }
        }

        // Metotları burada test etmelisin
        System.out.println("0. Şube Toplam Satış: " + subeToplami(satislar, 0));
        enBasariliGun(satislar);
        System.out.println("1. Şube Max Satış (Recursive): " + maxSatisRecursive(satislar[1], 0));
    }
    public static double subetoplamı(double[][] satislar,int kir) {
        double index=0;
        for (int i=0;i<satislar[kir].length;i++) {
            index=index+satislar[kir][i];
        }
        return index;
    }
    public static void enBasariliGun(double[][] satislar) {
        double[] kıro=new double[satislar[0].length];
        for (int i=0;i<satislar[i].length;i++) {
            double index=0;
            for (int j=0;j<satislar.length;j++) {
                index=index+satislar[i][j];
                kıro[i]=index;
            }
        }
        for (int i=1;i< kıro.length;i++) {
            if (kıro[i-1]>kıro[i]){
                kıro[i]=kıro[i-1];
            }
        }
        System.out.println(kıro[kıro.length-1]);
    }
    public static void maxSatisRecursive(double[][] satislar,int kir) {

    }


}*/