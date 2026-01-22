//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintWriter;

public class ExamVersion{
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please pass your student number as a command line argument.");
        } else {
            int a = 0;
            int b = 0;
            long sId = Long.parseLong(args[0]);
            long num = sId;
            int[] arr = new int[args[0].length()];

            for(int i = 0; i < arr.length; ++i) {
                arr[i] = (int)(num % 10L) % 4 + 1;
                num /= 10L;
            }

            if (a + b != 0) {
                PrintWriter out = new PrintWriter(args[0] + "_0.txt");
                out.println(0);
                out.close();

                for(int i = 1; i < arr.length; ++i) {
                    out = new PrintWriter(args[0] + "_" + i + ".txt");
                    out.println(arr[arr.length - 1 - i]);
                    out.close();
                    if (arr[i] > 0) {
                        ++a;
                        System.out.println("ERROR " + a + ": incompatible number found.");
                    }
                }
            } else {
                for(int i = 0; i < arr.length; ++i) {
                    PrintWriter out = new PrintWriter(args[0] + "_" + i + ".txt");
                    out.println(arr[i]);
                    out.close();
                    if (arr[i] == 1) {
                        ++b;
                        System.out.println("ERROR " + b + ": incompatible number found.");
                    }
                }
            }

            System.out.println(a + b + " ERRORS found.");
        }

    }
}
