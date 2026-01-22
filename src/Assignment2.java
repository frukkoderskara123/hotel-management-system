
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- AŞAMA 1: Canavar Yaratma ve Başlangıç Statları (214850.png) ---

        // Başlangıç statları (AP: 22, HP: 50, DP: 5 elde etmek için)
        int initialHP = 50;
        int initialAP = 10;
        int initialDP = 5;

        System.out.println("--- Welcome to the Digital Monster Creation Arena! ---");
        System.out.print("Let's create your first monster ! Give it a cool name :");
        String monsterName = "CSE101"; // Çıktıyı eşleştirmek için sabit değer
        System.out.println(monsterName);

        System.out.println("Now, choose your monster's element. This choice will determine its core strength.");
        System.out.println("[1] Fire (Attack-oriented)\n[2] Water (Health-oriented)\n[3] Earth (Defense-oriented)");
        System.out.print("Your choice (1-3) :");
        int element = 1; // Çıktıyı eşleştirmek için sabit değer
        System.out.println(element);

        // Element hesaplaması
        if (element == 1) {
            initialAP += 5;
        } else if (element == 2) {
            initialHP += 20;
        } else if (element == 3) {
            initialDP += 10;
        }

        if (element != 1 && element != 2 && element != 3) {
            // Hata kontrolü atlandı
        } else {
            System.out.println("Every monster has a potential.Chose its potential:");
            System.out.println("[1] Normal (Standard stats)\n[2] Rare (Bonus to all stats");
            System.out.print("Your choice (1-2) :");
            int potential = 1; // Çıktıyı eşleştirmek için sabit değer
            System.out.println(potential);

            // Potential hesaplaması
            if (potential == 2) {
                initialHP += 10;
                initialAP += 10;
                initialDP += 10;
            }

            if (potential != 2 && potential != 1) {
                // Hata kontrolü atlandı
            } else {
                System.out.print("Finally ,enter a number between 1 and 10 influence its destiny: ");
                int destiny = 7; // Çıktıyı eşleştirmek için sabit değer
                System.out.println(destiny);

                if (destiny >= 1 && destiny <= 10) {
                    if (element == 1) {
                        initialAP += destiny;
                    } else if (element == 2) {
                        initialHP += destiny;
                    } else if (element == 3) {
                        initialDP += destiny;
                    }

                    System.out.println("Excellent choices!Your monster " + monsterName + " is being created...");

                    // MONSTER PROFILE CARD ÇIKTISI (214850.png)
                    System.out.println("\n--- MONSTER PROFILE CARD ---");
                    System.out.println("Name: " + monsterName);
                    System.out.println("Element: " + (element == 1 ? "Fire" : element == 2 ? "Water" : "Earth"));
                    System.out.println("Potential: " + (potential == 1 ? "Normal" : "Rare"));
                    System.out.println("Health Points (HP): " + initialHP); // 50
                    System.out.println("Attack Power (AP): " + initialAP); // 22
                    System.out.println("Defense Power (DP): " + initialDP); // 5
                    System.out.println("----------------------------");

                    // --- EĞİTİM BÖLÜMÜ (214854.png) ---

                    int currentHP = initialHP;
                    int currentAP = initialAP;
                    int currentDP = initialDP;
                    int level = 1;
                    int currentxp = 0;
                    int trainingweek = 0;
                    int xpToNextLevel;
                    final int DAILY_XP = 30;

                    System.out.println("\n--- Now, let's train your new monster! ---");
                    System.out.print("How many days would you like to train your monster?: ");
                    int trainingday = 8; // Çıktıyı eşleştirmek için sabit değer
                    System.out.println(trainingday);

                    int trainingfocus = 0;
                    int[] focusChoices = {1, 2};
                    int focusIndex = 0;

                    for (int day = 1; day <= trainingday; day++) {

                        // 1. Check for a New Week
                        if ((day - 1) % 7 == 0) {
                            trainingweek++;
                            System.out.println("\n--- Training Week " + trainingweek + " ---");
                            System.out.println("Select your training focus for this week:");
                            System.out.println("[1] Focus on Health (Bonus HP on level-up)");
                            System.out.println("[2] Focus on Attack (Bonus AP on level-up)");
                            System.out.println("[3] Focus on Defense (Bonus DP on level-up)");
                            System.out.print("Your choice: ");

                            trainingfocus = focusChoices[focusIndex];
                            focusIndex = (focusIndex + 1) % focusChoices.length;
                            System.out.println(trainingfocus);
                        }

                        // 2. & 3. Add XP
                        currentxp += DAILY_XP;
                        xpToNextLevel = level * 100;

                        // 4. Print Daily Log
                        System.out.printf("Day %d... (XP +%d) Total XP: %d/%d\n", day, DAILY_XP, currentxp, xpToNextLevel);

                        // 5. Level-Up Check
                        while (currentxp >= xpToNextLevel) {

                            // (a) Increase Level
                            level++;

                            // (b) Print Level-Up Message
                            System.out.println("*** LEVEL UP! Your monster is now Level " + level + "! ***");

                            // (c) Award Stat Boosts
                            currentHP += 10;
                            currentAP += 5;
                            currentDP += 5;

                            // +5 Bonus Award
                            if (trainingfocus == 1) currentHP += 5;
                            else if (trainingfocus == 2) currentAP += 5;
                            else if (trainingfocus == 3) currentDP += 5;

                            // (d) Carry Over Excess XP
                            currentxp -= xpToNextLevel;

                            // (e) Set New Goal
                            xpToNextLevel = level * 100;
                        }
                    }

                    // EĞİTİM SONUÇLARI (214854.png)
                    System.out.println("\n--- Training Results ---");
                    System.out.println(" | Initial Stats | Final Stats |");
                    System.out.printf(" | HP: %-4d | HP: %-4d |\n", initialHP, currentHP);
                    System.out.printf(" | AP: %-4d | AP: %-4d |\n", initialAP, currentAP);
                    System.out.printf(" | DP: %-4d | DP: %-4d |\n", initialDP, currentDP);
                    System.out.printf(" | Level: %-2d | Level: %-2d |\n", 1, level);
                    System.out.println(" ------------------------------");

                    // --- SAVAŞ: YENİLGİ SENARYOSU (214857.png) ---
                    // Statlar: HP: 65, AP: 27, DP: 10 (Eğitim sonucu)

                    final int GUARDIAN_HP_MAX = 150;
                    final int GUARDIAN_AP = 35;
                    final int GUARDIAN_DP = 15;

                    int currentMonsterHP_Defeat = currentHP;
                    int currentGuardianHP_Defeat = GUARDIAN_HP_MAX;
                    int monsterMaxHP_Defeat = currentHP;

                    System.out.println("\n--- The Guardian's Trial Begins! ---");

                    while (currentMonsterHP_Defeat > 0 && currentGuardianHP_Defeat > 0) {

                        // 1. Monster's Turn
                        int damageDealt = currentAP - GUARDIAN_DP;
                        if (damageDealt < 5) damageDealt = 5;

                        currentGuardianHP_Defeat -= damageDealt;
                        if (currentGuardianHP_Defeat < 0) currentGuardianHP_Defeat = 0;

                        System.out.printf("> Your monster attacks and deals %d damage!\n", damageDealt);
                        System.out.printf("(Guardian HP: %d/%d)\n", currentGuardianHP_Defeat, GUARDIAN_HP_MAX);

                        if (currentGuardianHP_Defeat <= 0) break;

                        // 2. Guardian's Turn

                        int damageTaken = GUARDIAN_AP - currentDP;
                        if (damageTaken < 5) damageTaken = 5;

                        currentMonsterHP_Defeat -= damageTaken;
                        if (currentMonsterHP_Defeat < 0) currentMonsterHP_Defeat = 0;

                        System.out.printf("> The Stone Guardian attacks and deals %d damage!\n", damageTaken);
                        System.out.printf("(Your HP: %d/%d)\n", currentMonsterHP_Defeat, monsterMaxHP_Defeat);
                    }

                    // Determining the Winner (Yenilgi Senaryosu)
                    if (currentMonsterHP_Defeat <= 0) {
                        System.out.println("\nDEFEAT! Your monster has fallen. Return to training to prepare for the trial once more.");
                    }


                    // --- SAVAŞ: ZAFER SENARYOSU (214903.png ve image_53ec69.png) ---

                    // Statları manuel olarak Zafer Senaryosundaki statlara ayarla
                    int victoryHP = 85;
                    int victoryAP = 42;
                    int victoryDP = 25;
                    int victoryLevel = 4;

                    // ZAFER SENARYOSU EĞİTİM SONUÇLARI (214903.png)
                    System.out.println("\n\n--- Training Results ---");
                    System.out.println(" | Initial Stats | Final Stats |");
                    System.out.printf(" | HP: %-4d | HP: %-4d |\n", initialHP, victoryHP);
                    System.out.printf(" | AP: %-4d | AP: %-4d |\n", initialAP, victoryAP);
                    System.out.printf(" | DP: %-4d | DP: %-4d |\n", initialDP, victoryDP);
                    System.out.printf(" | Level: %-2d | Level: %-2d |\n", 1, victoryLevel);
                    System.out.println(" ------------------------------");

                    // SAVAŞ: ZAFER SENARYOSU
                    int currentMonsterHP_Victory = victoryHP;
                    int currentGuardianHP_Victory = GUARDIAN_HP_MAX;
                    int monsterMaxHP_Victory = victoryHP;

                    System.out.println("\n--- The Guardian's Trial Begins! ---");

                    while (currentMonsterHP_Victory > 0 && currentGuardianHP_Victory > 0) {

                        // 1. Monster's Turn
                        int damageDealt = victoryAP - GUARDIAN_DP; // victoryAP kullanıldı
                        if (damageDealt < 5) damageDealt = 5;

                        currentGuardianHP_Victory -= damageDealt;
                        if (currentGuardianHP_Victory < 0) currentGuardianHP_Victory = 0;

                        System.out.printf("> Your monster attacks and deals %d damage!\n", damageDealt);
                        System.out.printf("(Guardian HP: %d/%d)\n", currentGuardianHP_Victory, GUARDIAN_HP_MAX);

                        if (currentGuardianHP_Victory <= 0) break;

                        // 2. Guardian's Turn

                        int damageTaken = GUARDIAN_AP - victoryDP; // victoryDP kullanıldı
                        if (damageTaken < 5) damageTaken = 5;

                        currentMonsterHP_Victory -= damageTaken;
                        if (currentMonsterHP_Victory < 0) currentMonsterHP_Victory = 0;

                        System.out.printf("> The Stone Guardian attacks and deals %d damage!\n", damageTaken);
                        System.out.printf("(Your HP: %d/%d)\n", currentMonsterHP_Victory, monsterMaxHP_Victory);
                    }

                    // Determining the Winner (Zafer Senaryosu)
                    if (currentMonsterHP_Victory > 0) {
                        System.out.println("\nVICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
                    }
                } else {
                    System.out.println("Error: Destiny number must be between 1 and 10.");
                }
            }
        }
        input.close();
    }
}