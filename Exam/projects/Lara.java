import java.util.Scanner;
public class Lara {
    static double budget = 5000;
    static double maxCapacity = 1000.0;
    static double currentweight = 0.0;
    static String[] names = new String[0];
    static Double[] weights = new Double[0];
    static Double[] prices = new Double[0];

    public static void importproduct(String name, double weight, double price) {
        if (budget > price && currentweight + weight < maxCapacity) {
            budget -= price;
            currentweight += weight;
            String[] newnames = new String[names.length + 1];
            Double[] newweight = new Double[weights.length + 1];
            Double[] newprices = new Double[prices.length + 1];
            for (int i = 0; i < names.length; i++) {
                newnames[i] = names[i];
                newweight[i] = weights[i];
                newprices[i] = prices[i];
            }
            newnames[newnames.length - 1] = name;
            newweight[newweight.length - 1] = weight;
            newprices[newprices.length - 1] = price;
            names = newnames;
            weights = newweight;
            prices = newprices;
        }
    }

    public static void shipproduct(String name) {
        int index = -1;
        int target = 0;
        String[] newnames;
        Double[] newweight;
        Double[] newprices;
        for (int j = 0; j < names.length; j++) {
            if (name.equalsIgnoreCase(names[j])) {
                budget = budget + prices[j] * 1.5;
                currentweight = currentweight - weights[j];
                newnames = new String[names.length - 1];
                newweight = new Double[weights.length - 1];
                newprices = new Double[prices.length - 1];
                index = j;
                if (j == index)
                    continue;
                newnames[j] = names[j];
                newweight[j] = weights[j];
                newprices[j] = prices[j];


            } else {
                System.out.println("Error");
                return;
            }
        }

    }

    public static void status() {
        System.out.println("Budget :" + budget + "|" + "Capacity :" + currentweight + "/" + maxCapacity);
        for (int i = 0; i < weights.length; i++) {
            System.out.print("Items :" + "[" + names[i] + "]" + "(" + weights[i] + ")");
            System.out.print(",");
        }
    }
    public static void main(String[] args){
        status();
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        Double weight=input.nextDouble();
        Double price= input.nextDouble();
        importproduct(name,weight,price);
        name=input.nextLine();
        shipproduct(name);


  }
}
