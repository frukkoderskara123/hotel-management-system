public class şişli {

    public static void main(String[] args) {

        // 3x3 Test Matrix
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("=== SMART MATRIX ROTATOR TESTS ===\n");
        System.out.println("Original Matrix:");
        printMatrix(input);

        System.out.println("--- Rotating 90 Degrees Right ---");
        int[][] res90 = rotate(input, 90);
        printMatrix(res90);

        System.out.println("--- Rotating 180 Degrees Right ---");
        int[][] res180 = rotate(input, 180);
        printMatrix(res180);

        System.out.println("--- Rotating 270 Degrees Right ---");
        int[][] res270 = rotate(input, 270);
        printMatrix(res270);

        System.out.println("--- Rotating 360 Degrees Right ---");
        int[][] res360 = rotate(input, 360);
        printMatrix(res360);

        System.out.println("--- Rotating 450 Degrees Right ---");
        int[][] res450 = rotate(input, 450);
        printMatrix(res450);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("]");
        }
    }


    public static int[][] rotate(int[][] input, int rotationangle) {
        int tur = 0;
        tur = rotationangle / 90 % 4;
        if (rotationangle % 90 >= 45) {
            tur=tur+1;
        }
        int a = input.length;
        int b = input[0].length;
        while (tur != 0) {
            int[][] newinput = new int[a][b];
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[i].length; j++) {
                    newinput[j][a - 1 - i] = input[i][j];
                }
            }
            input=newinput;
            tur--;
        }

        return input;
    }
}

