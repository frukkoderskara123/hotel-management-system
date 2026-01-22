public class yakınsama {
    public static void main(String[] args) {
        double[][] art={
                {1,6},
                {2,4},
                {8,9},
                {4,5},
                {3,2},
                {0,7}};
        hesaplama(art);

    }
    public static void hesaplama(double[][] art) {
        double enyakınx1=0;
        double enyakınx2=0;
        double enyakıny1=0;
        double enyakıny2=0;
        double kale=0;
        double x1;
        double x2;
        double y1;
        double y2;
        double minvalue=1000000000;
        for (int i=0;i<art.length;i++) {
            for (int j=i+1;j<art.length;j++) {
                 x1=art[i][0];
                 y1=art[i][1];
                 x2=art[j][0];
                 y2=art[j][1];
                 kale=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
                 if (kale<minvalue) {
                     minvalue=kale;
                     enyakınx1=x1;
                     enyakınx2=x2;
                     enyakıny1=y1;
                     enyakıny2=y2;
                 }
            }
        }

        System.out.printf("En yakın noktalar: (%.2f,%.2f),(%.2f,%.2f)",enyakınx1,enyakıny1,enyakınx2,enyakıny2);
        System.out.println("En yakın mesafe  "+minvalue);
    }
}