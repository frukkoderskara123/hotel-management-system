public class king {
    public static void main(String[] args) {
        double[][] thermalMap = {
                {12.5, 14.2, 10.0, 15.8, 11.2, 13.5},
                {18.0, 25.5, 20.0, 14.5, 19.2, 10.8},
                {10.4, 20.2, 35.1, 20.0, 14.5, 12.0},
                {11.0, 18.5, 20.0, 22.2, 10.8, 15.4},
                {15.2, 10.0, 12.4, 11.5, 13.0, 14.2},
                {10.5, 11.2, 14.0, 12.8, 10.5, 11.0}
        };

        System.out.println("--- Orijinal Termal Harita ---");
        printMap(thermalMap);

        System.out.println("\n--- Yerel Zirveler ---");
        findLocalPeaks(thermalMap);

        // Diğer metotları burada test et...
    }

    public static void printMap(double[][] thermalMap) {
        for (int i = 0; i < thermalMap.length; i++) {
            for (int j = 0; j < thermalMap[i].length; j++) {
                System.out.printf("%6.1f", thermalMap[i][j]);
                if (thermalMap[i][j] > 30.0) {
                    System.out.print("*\n");
                }
            }
        }
    }

    public static void findLocalPeaks(double[][] thermalMap) {
        for (int i = 0; i < thermalMap.length; i++) {
            for (int j = 0; j < thermalMap[i].length; j++) {
                double current = thermalMap[i][j];
                boolean peak = false;
                if (i > 0 && current > thermalMap[i - 1][j]) {
                    peak = true;
                }
                if (i > thermalMap.length - 1 && current > thermalMap[i + 1][j]) {
                    peak = true;
                }
                if (j < thermalMap[0].length-1 && current > thermalMap[i][j + 1]) {
                    peak = true;
                }
                if (j > 0 && current > thermalMap[i][j - 1]) {
                    peak = true;
                }

                if (peak) {
                    System.out.printf("local peak %4.1f ", current);
                }
            }
        }
    }

    public static void mirrormatrix(double[][] thermalMap) {
        for (int i = 0; i < (thermalMap.length); i++) {
            for (int j = 0; j < thermalMap[0].length / 2 + 1; j++) {
                thermalMap[i][thermalMap[i].length - j] = thermalMap[i][j];
            }
        }
    }
}
