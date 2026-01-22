public class Homework1 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Digital Monster Creation Area");
        System.out.println("Let's create your first monster ! Give it a cool name :");
        String monsterName = "Pyre";

        System.out.println("Now, choose your monster's element...");
        int element = 1;

        int Healt_points = 50;
        int Attack_power = 10;
        int Defense_power = 5;

        // Element Bonusu
        if (element == 1) {
            Attack_power += 5;
        } else if (element == 2) {
            Healt_points += 20;
        } else if (element == 3) {
            Defense_power += 10;
        }

        System.out.println("Every monster has a potential...");
        int potential = 2;


        if (potential == 2) {
            Healt_points += 10;
            Attack_power += 10;
            Defense_power += 10;
        }

        System.out.println("Finally, enter a destiny number...");
        int destiny = 8;


        if (element == 1) Attack_power += destiny;
        else if (element == 2) Healt_points += destiny;
        else if (element == 3) Defense_power += destiny;


        System.out.println("\n--Monster Profile Card--");
        System.out.println("Name: " + monsterName);
        System.out.println("HP: " + Healt_points + " AP: " + Attack_power + " DP: " + Defense_power);

        int newHP = Healt_points;
        int newAP = Attack_power;
        int newDP = Defense_power;
        int level = 1;
        int currentxp = 0;

        // --- EĞİTİM AŞAMASI ---
        System.out.println("\n---let's train your new monster---");
        int trainingday = 20;
        int trainingfocus = 0;

        for (int day = 1; day <= trainingday; day++) {

            if ((day - 1) % 7 == 0) {
                trainingfocus = 2;
            }

            currentxp += 30;
            int xpToNextLevel = level * 100;

            while (currentxp >= xpToNextLevel) {
                level++;
                newHP += 10;
                newAP += 5;
                newDP += 5;

                if (trainingfocus == 1) newHP += 5;
                if (trainingfocus == 2) newAP += 5;
                if (trainingfocus == 3) newDP += 5;
                currentxp -= xpToNextLevel;
            }
        }


        System.out.println("\n--- The Guardian's Trial Begins ---");
        int guardianhp = 150;
        int guardiandp = 15;
        int guardianap = 35;
        int monsterHP_current = newHP; // Canavarın eğitimi bitmiş canı

        while (guardianhp > 0 && monsterHP_current > 0) {
            // Biz vuruyoruz
            int damagedealt = Math.max(5, newAP - guardiandp);
            guardianhp -= damagedealt;
            if (guardianhp <= 0) break;

            // Gardiyan vuruyor
            int damagetaken = Math.max(5, guardianap - newDP);
            monsterHP_current -= damagetaken;
        }


        if (monsterHP_current > 0) {
            System.out.println("\nVICTORY! The Guardian deems your monster worthy.");
            System.out.println("Two skilled adventurers, Swiftclaw and Ironhide, decide to join the team!");


            String[] teamMemberNames = new String[3];
            int[] teamMemberCurrentHP = new int[3];
            int[] teamMemberMaxHP = new int[3];
            int[] teamMemberAP = new int[3];
            int[] teamMemberDP = new int[3];
            boolean[] teamMemberAlive = new boolean[3];
            boolean[] regionsExploredStatus = {false, false, false};


            initializeTeam(monsterName, newHP, newAP, newDP, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);

            System.out.println("\n--- TEAM ROSTER INITIALIZED ---");
            int[] totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);




            System.out.println("\n" + "=".repeat(50));
            System.out.println("Step 1: The Murky Forest (Region 0)");
            System.out.println("=".repeat(50));
            triggerEvent(0, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            regionsExploredStatus[0] = true;

            totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

            // Step 2: Crystal Caves
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Step 2: The Crystal Caves (Region 1)");
            System.out.println("=".repeat(50));
            triggerEvent(1, 1, 2, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            regionsExploredStatus[1] = true;

            totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

            // Step 3: Ancient Ruins
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Step 3: The Ancient Ruins (Region 2)");
            System.out.println("=".repeat(50));
            triggerEvent(2, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            regionsExploredStatus[2] = true;

            totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

            // Oyun Sonu Kontrolü
            System.out.println("\n" + "-".repeat(20) + " MISSION REPORT " + "-".repeat(20));
            if (checkTeamStatus(teamMemberAlive) && allRegionsExplored(regionsExploredStatus)) {
                System.out.println("VICTORY! All regions explored successfully!");
            } else {
                System.out.println("DEFEAT! Your team has fallen.");
            }

        } else {
            System.out.println("\nDEFEAT! Your monster has fallen in the Trial.");
        }
    }



    public static void initializeTeam(String monsterName, int monsterHP_current, int monsterAP, int monsterDP, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {

        teamMemberNames[0] = monsterName;
        teamMemberCurrentHP[0] = monsterHP_current;
        teamMemberMaxHP[0] = monsterHP_current;
        teamMemberAP[0] = monsterAP;
        teamMemberDP[0] = monsterDP;
        teamMemberAlive[0] = true;


        teamMemberNames[1] = "Swiftclaw";
        teamMemberCurrentHP[1] = 80;
        teamMemberMaxHP[1] = 80;
        teamMemberAP[1] = 40;
        teamMemberDP[1] = 10;
        teamMemberAlive[1] = true;


        teamMemberNames[2] = "Ironhide";
        teamMemberCurrentHP[2] = 120;
        teamMemberMaxHP[2] = 120;
        teamMemberAP[2] = 20;
        teamMemberDP[2] = 30;
        teamMemberAlive[2] = true;
    }

    public static int[] calculateTotalTeamStats(int[] teamMemberCurrentHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        int[] totalStats = {0, 0, 0}; // HP, AP, DP
        for (int i = 0; i < 3; i++) {
            if (teamMemberAlive[i]) {
                totalStats[0] += teamMemberCurrentHP[i];
                totalStats[1] += teamMemberAP[i];
                totalStats[2] += teamMemberDP[i];
            }
        }
        return totalStats;
    }

    public static void displayTeamStats(String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive, int[] totalTeamStats) {
        System.out.println("+-------------+----------+----------+----------+--------------+");
        System.out.println("|    Member   |    HP    |     AP   |     DP   |     STATUS   |");
        System.out.println("+-------------+----------+----------+----------+--------------+");
        for (int j = 0; j < teamMemberNames.length; j++) {
            String Statu = (teamMemberAlive[j] == true) ? "Alive" : "Unconscious";
            String hpDisplay = teamMemberCurrentHP[j] + "/" + teamMemberMaxHP[j];

            System.out.printf("| %-11s | %-8s | %-8d | %-8d | %-12s |\n", teamMemberNames[j], hpDisplay, teamMemberAP[j], teamMemberDP[j], Statu);
        }
        System.out.println("+-------------+----------+----------+----------+--------------+");
        System.out.printf("| TOTAL STATS | HP:%-5d | AP:%-5d | DP:%-5d |              |\n", totalTeamStats[0], totalTeamStats[1], totalTeamStats[2]);
        System.out.println("+-------------+----------+----------+----------+--------------+");
    }
    public static boolean checkTeamStatus(boolean[] teamMemberAlive) {
        for (boolean alive : teamMemberAlive) {
            if (alive) return true;
        }
        return false;
    }

    public static boolean allRegionsExplored(boolean[] regionsExploredStatus) {
        for (boolean status : regionsExploredStatus) {
            if (!status) return false;
        }
        return true;
    }

        public static void triggerEvent(int regionIndex, int scenarioIndex, int simulatedChoice, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
            int[] total = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
            int totalDP = total[2];

            if (scenarioIndex != 0 && scenarioIndex != 1) scenarioIndex = 0;
            if (simulatedChoice != 1 && simulatedChoice != 2) simulatedChoice = 1;

            if (regionIndex == 0) {
                if (scenarioIndex == 0) {
                    System.out.println("Event: Wild Monster Ambush!");
                    if (simulatedChoice == 1) {
                        int damage = Math.max(5, 40 - totalDP);
                        System.out.println("Outcome: Fighting! Team takes " + damage + " damage.");
                        applyDamageToTeam(damage, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);

                        int minAPIndex = -1;
                        int minAP = 9999;
                        for(int i=0; i<3; i++) {
                            if(teamMemberAlive[i] && teamMemberAP[i] < minAP) {
                                minAP = teamMemberAP[i];
                                minAPIndex = i;
                            }
                        }
                        if(minAPIndex != -1) teamMemberAP[minAPIndex] += 5;
                    }
                    else if (simulatedChoice == 2) {
                        System.out.println("Outcome: Flee failed. Team takes 15 damage.");
                        applyDamageToTeam(15, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                    }
                }
                else if (scenarioIndex == 1) {
                    System.out.println("Event: Whispering Grove.");
                    if (simulatedChoice == 1) {
                        healTeam(20, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAlive);
                        int maxDPIndex = -1;
                        int maxDP = -1;
                        for(int i=0; i<3; i++) {
                            if(teamMemberAlive[i] && teamMemberDP[i] > maxDP) {
                                maxDP = teamMemberDP[i];
                                maxDPIndex = i;
                            }
                        }
                        if(maxDPIndex != -1) teamMemberDP[maxDPIndex] += 3;
                    }
                }
            }

            else if (regionIndex == 1) {
                if (scenarioIndex == 0) {
                    System.out.println("Event: Unstable Ceiling!");
                    if (simulatedChoice == 1) {
                        applyDamageToTeam(30, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                    } else if (simulatedChoice == 2) {
                        int minHPIndex = -1;
                        int minHP = 9999;
                        for(int i=0; i<3; i++) {
                            if(teamMemberAlive[i] && teamMemberCurrentHP[i] < minHP) {
                                minHP = teamMemberCurrentHP[i];
                                minHPIndex = i;
                            }
                        }
                        if(minHPIndex != -1) {
                            teamMemberCurrentHP[minHPIndex] = Math.max(0, teamMemberCurrentHP[minHPIndex] - 10);
                            if(teamMemberCurrentHP[minHPIndex] == 0) teamMemberAlive[minHPIndex] = false;
                        }
                    }
                } else if (scenarioIndex == 1) {
                    System.out.println("Event: Glowing Crystal Vein.");
                    if (simulatedChoice == 1) {
                        for(int i=0; i<3; i++) if(teamMemberAlive[i]) teamMemberAP[i]+=5;
                    } else if (simulatedChoice == 2) {
                        for(int i=0; i<3; i++) if(teamMemberAlive[i]) {
                            teamMemberCurrentHP[i]+=10; teamMemberMaxHP[i]+=10;
                        }
                    }
                }
            }

            else if (regionIndex == 2) {
                if (scenarioIndex == 0) {
                    System.out.println("Event: Ancient Mechanism.");
                    if (simulatedChoice == 1) {
                        System.out.println("Outcome: Trap! 20 damage.");
                        applyDamageToTeam(20, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                    }
                } else if (scenarioIndex == 1) {
                    System.out.println("Event: Sacrificial Altar.");
                    if (simulatedChoice == 1) {
                        for(int i=0; i<3; i++) {
                            if(teamMemberAlive[i]) {
                                teamMemberCurrentHP[i] = (int)(teamMemberCurrentHP[i] * 0.75);
                                if (teamMemberCurrentHP[i] < 1) teamMemberCurrentHP[i] = 1;
                                teamMemberAP[i] += 5;
                                teamMemberDP[i] += 5;
                            }
                        }
                    }
                }
            }
        }
    public static void applyDamageToTeam(int damage, int[] teamMemberCurrentHP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        int aliveCount = 0;
        for (boolean alive : teamMemberAlive) if (alive) aliveCount++;

        if (aliveCount == 0) return;
        int damagePerMember = damage / aliveCount;

        for (int i = 0; i < 3; i++) {
            if (teamMemberAlive[i]) {
                teamMemberCurrentHP[i] -= damagePerMember;
                if (teamMemberCurrentHP[i] <= 0) {
                    teamMemberCurrentHP[i] = 0;
                    teamMemberAlive[i] = false;
                }
            }
        }
    }

    public static void healTeam(int healAmount, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, boolean[] teamMemberAlive) {
        int eligibleCount = 0;
        for (int i = 0; i < 3; i++) {
            if ((teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i]) || !teamMemberAlive[i]) {
                eligibleCount++;
            }
        }
        if (eligibleCount == 0) return;
        int healPerMember = healAmount / eligibleCount;

        for (int i = 0; i < 3; i++) {
            boolean isEligible = (teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i]) || !teamMemberAlive[i];
            if (isEligible) {
                teamMemberCurrentHP[i] += healPerMember;
                if (teamMemberCurrentHP[i] > teamMemberMaxHP[i]) teamMemberCurrentHP[i] = teamMemberMaxHP[i];
                if (!teamMemberAlive[i] && teamMemberCurrentHP[i] > 0) teamMemberAlive[i] = true;
            }
        }
    }
}