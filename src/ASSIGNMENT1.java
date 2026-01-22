import java.util.Scanner;
public class ASSIGNMENT1 {
    public static void main(String[] args) {
        int Healt_points = 50;
        int Attack_power = 10;
        int Defense_power = 5;
        System.out.println("Welcome to the Digital Monster Creation Area");
        Scanner input = new Scanner(System.in);
        System.out.println("Let's create your first monster ! Give it a cool name :");
        String monsterName = input.nextLine();
        System.out.println("Now, choose your monster's element. This choice will determine its core strength.");
        System.out.println("[1] Fire (Attack-oriented)\n[2] Water (Health-oriented)\n[3] Earth (Defense-oriented");
        System.out.println("Your choice (1-3) :");
        int element = input.nextInt();
        if (element == 1) {
            Attack_power = Attack_power + 5;
        } else if (element == 2) {
            Healt_points = Healt_points + 20;
        } else if (element == 3) {
            Defense_power = Defense_power + 10;
        }

        if (element != 1 && element != 2 && element != 3) {
            System.out.println("Error: Invalid element choice. Exiting program.");
        } else {


            System.out.println("Every monster has a potential.Chose its potential:");
            System.out.println("[1] Normal (Standard stats)\n[2] Rare (Bonus to all stats");
            System.out.println("Your choice (1-2) :");
            int potential = input.nextInt();
            if (potential == 2) {
                Healt_points = Healt_points + 10;
                Attack_power = Attack_power + 10;
                Defense_power = Defense_power + 10;
            }
            if (potential != 2 && potential != 1) {
                System.out.println("Error: Invalid potential choice. Exiting program.");
            } else {
                System.out.println("Finally ,enter a number between  1 and 10 influence its destiny: ");
                int destiny = input.nextInt();
                if (1 <= destiny && 10 >= destiny) {
                    if (element == 1) {
                        Attack_power = Attack_power + destiny;
                    } else if (element == 2) {
                        Healt_points = Healt_points + destiny;
                    } else if (element == 3) {
                        Defense_power = Defense_power + destiny;
                    }
                    System.out.println("Excellent choices!Your monster" + monsterName + "is being created...");
                    System.out.print("--Monster Profile Card--\nName: " + monsterName + "\nElement: " + (element == 1 ? "FIRE" : element == 2 ? "WATER" : "Earth") + "\nPotential " + (potential == 1 ? "NORMAL" : "RARE") + "\nHealth Points (HP) " + Healt_points + "\nAttack Power (AP) " + Attack_power + "\nDefense Power (DP) " + Defense_power);


            }
        }
                        int AP = Attack_power;
                        int HP = Healt_points;
                        int DP = Defense_power;
                        int newHP = 0;
                        int newAP = 0;
                        int newDP = 0;
                        int level = 1;
                        int currentxp = 0;
                        int trainingweek = 0;
                        System.out.println("\n---let's train your new monster---");
                        System.out.println("How many days would you like to train your monster?");
                        int trainingday = input.nextInt();
                        int trainingfocus = 0;
                        for (int day = 1; day <= trainingday; day++) {
                            System.out.println(day);
                            if ((day - 1) % 7 == 0) {
                                trainingweek = trainingweek + 1;
                                System.out.println("--Training " + trainingweek + " --");
                                System.out.println("Select your training focus for this week:");
                                System.out.println("[1] Focus on Health (Bonus HP on level-up)");
                                System.out.println("[2] Focus on Attack (Bonus AP on level-up)");
                                System.out.println("[3] Focus on Defense (Bonus DP on level-up)");
                                System.out.println("Your choice:");
                                trainingfocus = input.nextInt();
                            }
                            currentxp = currentxp + 30;
                            ;
                            int xpToNextLevel = level * 100;
                            System.out.println("Day " + day + "... (XP + 30) Total XP: " + currentxp + "/" + xpToNextLevel);
                            while (currentxp >= xpToNextLevel) {

                                ++level;
                                System.out.println("*** LEVEL UP! Your monster level " + level + "!");
                                newHP = HP + 10;
                                newAP = AP + 5;
                                newDP = DP + 5;
                                if (trainingfocus == 1)
                                    newHP = newHP + 5;
                                if (trainingfocus == 2)
                                    newAP = newAP + 5;
                                if (trainingfocus == 3)
                                    newDP = newDP + 5;
                                currentxp = currentxp - xpToNextLevel;

                            }
                        }
                        System.out.println("--- Training Stats ---");
                        System.out.println("+-------------------+-------------------+");
                        System.out.println("| Initial Stats   |  Final Stats  |");
                        System.out.println("+-------------------+-------------------+");
                        System.out.printf("| %-15s | %-15s |%n", "HP: " + HP, " HP: " + newHP);
                        System.out.printf("| %-15s | %-15s |%n", "AP: " + AP, " AP: " + newAP);
                        System.out.printf("| %-15s | %-15s |%n", "DP: " + DP, " DP: " + newDP);
                        System.out.printf("| %-15s | %-15s |%n", "Level: 1", " Level: " + level);
                        System.out.println("+-------------------+-------------------+");
                        System.out.println("--- The Guardian's Trial Begins ---");
                        int guardianhp = 150;
                        int guardianap = 35;
                        int guardiandp = 15;
                        int damagedealt = 0;
                        int damagetaken=0;
                        while (guardianhp > 0 && newHP > 0) {
                            if (newAP - guardiandp > 0) {
                                damagedealt = newAP - guardiandp;
                            } else {
                                damagedealt = 5;
                            }
                            int a = guardianhp - damagedealt;

                            System.out.println("> Your monster attacks and deals" + damagedealt + " damage");
                            System.out.println("Guardian HP:" + a + "/" + 150);
                            if (guardianhp <= 0) {
                                break;
                            } else {
                                damagetaken = guardianap - newDP;
                            }
                            if (damagetaken < 5) {
                                if (newHP < 0) newHP = 0;

                                System.out.printf("> The Stone Guardian attacks and deals %d damage!\n", damagetaken);
                                System.out.printf("(Your HP: %d/%d)\n", newHP, guardianhp);
                            }
                        }

                            // Determining the Winner (Zafer Senaryosu)
                            if (newHP > 0) {
                                System.out.println("\nVICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
                            }



}
        input.close();
    }
            }



