import java.util.Scanner;

public class kral {
    static double budget = 5000;
    static double maxCapacity = 1000.0;
    static double currentWeight = 0.0; // CamelCase isimlendirme düzeltildi

    // Primitive types (double) kullanımı daha iyidir
    static String[] names = new String[0];
    static double[] weights = new double[0];
    static double[] prices = new double[0];

    public static void importProduct(String name, double weight, double price) {
        // HATA DÜZELTME: Bütçe eşitse de alabilmeli (>=), kapasite eşitse de dolabilir (<=)
        if (budget >= price && (currentWeight + weight) <= maxCapacity) {
            budget -= price;
            currentWeight += weight;

            String[] newNames = new String[names.length + 1];
            double[] newWeights = new double[weights.length + 1];
            double[] newPrices = new double[prices.length + 1];

            for (int i = 0; i < names.length; i++) {
                newNames[i] = names[i];
                newWeights[i] = weights[i];
                newPrices[i] = prices[i];
            }

            newNames[newNames.length - 1] = name;
            newWeights[newWeights.length - 1] = weight;
            newPrices[newPrices.length - 1] = price;

            names = newNames;
            weights = newWeights;
            prices = newPrices;

            System.out.println("[IMPORT] " + name + " added.");
        } else {
            System.out.println("[ERROR] Not enough money or space!");
        }
    }

    public static void shipProduct(String name) {
        int index = -1;

        // ADIM 1: Önce ürünü bulalım (Search Logic)
        for (int j = 0; j < names.length; j++) {
            // HATA DÜZELTME: String karşılaştırması .equals ile yapılır
            if (names[j].equalsIgnoreCase(name)) {
                index = j;
                break; // Bulunca döngüden çık
            }
        }

        // Eğer ürün bulunamadıysa işlem yapma
        if (index == -1) {
            System.out.println("[ERROR] Product not found!");
            return;
        }

        // ADIM 2: Ürünü sat ve parayı ekle
        budget += prices[index] * 1.5;
        currentWeight -= weights[index];

        // ADIM 3: Dizileri küçült (Resize Logic)
        String[] newNames = new String[names.length - 1];
        double[] newWeights = new double[weights.length - 1];
        double[] newPrices = new double[prices.length - 1];

        int targetIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == index) continue; // Satılan ürünü atla

            newNames[targetIndex] = names[i];
            newWeights[targetIndex] = weights[i];
            newPrices[targetIndex] = prices[i];
            targetIndex++;
        }

        names = newNames;
        weights = newWeights;
        prices = newPrices;

        System.out.println("[SHIP] " + name + " shipped.");
    }

    public static void status() {
        System.out.println("\n--- STATUS ---");
        System.out.println("Budget: " + budget + " | Capacity: " + currentWeight + "/" + maxCapacity);
        System.out.print("Items: ");
        for (int i = 0; i < names.length; i++) {
            // Yazdırma formatı biraz daha okunaklı hale getirildi
            System.out.print("[" + names[i] + " (" + weights[i] + "kg)] ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- WAREHOUSE SYSTEM START ---");
        status();

        // Test 1: Import
        System.out.print("Enter product name to import: ");
        String name = input.nextLine();

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        importProduct(name, weight, price);
        status();

        // HATA DÜZELTME: Tampon temizleme (Buffer Clear)
        input.nextLine();

        // Test 2: Ship
        System.out.print("Enter product name to ship: ");
        String shipName = input.nextLine();
        shipProduct(shipName);

        status();
    }
}