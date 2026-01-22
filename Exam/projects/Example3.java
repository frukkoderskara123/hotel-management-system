public class Example3 {
    public static void main(String[] args) {
        int Healt_points = 50;
        int Attack_power = 10;
        int Defense_power = 5;
        System.out.println("Welcome to the Digital Monster Creation Area");
        System.out.println("Let's create your first monster ! Give it a cool name :");
        String monsterName = "Pyre";
        System.out.println("Now, choose your monster's element. This choice will determine its core strength.");
        System.out.println("[1] Fire (Attack-oriented)\n[2] Water (Health-oriented)\n[3] Earth (Defense-oriented");
        System.out.println("Your choice (1-3) :");
        int element = 1;
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
            int potential = 2;
            if (potential == 2) {
                Healt_points = Healt_points + 10;
                Attack_power = Attack_power + 10;
                Defense_power = Defense_power + 10;
            }
            if (potential != 2 && potential != 1) {
                System.out.println("Error: Invalid potential choice. Exiting program.");
            } else {
                System.out.println("Finally ,enter a number between  1 and 10 influence its destiny: ");
                int destiny = 8;
                if (1 <= destiny && 10 >= destiny) {
                    if (element == 1) {
                        Attack_power = Attack_power + destiny;
                    } else if (element == 2) {
                        Healt_points = Healt_points + destiny;
                    } else if (element == 3) {
                        Defense_power = Defense_power + destiny;
                    }
                    System.out.println("Excellent choices!Your monster" + monsterName + "is being created...");
                    String elementStr = (element == 1 ? "FIRE" : element == 2 ? "WATER" : "Earth");
                    String potentialStr = (potential == 1 ? "NORMAL" : "RARE");
                    System.out.print("--Monster Profile Card--\nName: " + monsterName + "\nElement: " + elementStr + "\nPotential " + potentialStr + "\nHealth Points (HP) " + Healt_points + "\nAttack Power (AP) " + Attack_power + "\nDefense Power (DP) " + Defense_power);
                    int AP = Attack_power;
                    int HP = Healt_points;
                    int DP = Defense_power;
                    int newHP = HP;
                    int newAP = AP;
                    int newDP = DP;
                    int level = 1;
                    int currentxp = 0;
                    int trainingweek = 0;
                    System.out.println("\n---let's train your new monster---");
                    System.out.println("How many days would you like to train your monster?");
                    int trainingday = 20;
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
                            trainingfocus =0;
                        }
                        currentxp = currentxp + 30;
                        int xpToNextLevel = level * 100;
                        System.out.println("Day " + day + "... (XP + 30) Total XP: " + currentxp + "/" + xpToNextLevel);

                        while (currentxp >= xpToNextLevel) {
                            level++;
                            System.out.println("*** LEVEL UP! Your monster level " + level + "!");
                            newHP += 10;
                            newAP += 5;
                            newDP += 5;

                            if (trainingfocus == 1)
                                newHP += 5;
                            if (trainingfocus == 2)
                                newAP += 5;
                            if (trainingfocus == 3)
                                newDP += 5;
                            currentxp = currentxp - xpToNextLevel;

                        }
                    }
                    newHP = 85;
                    newAP = 45;
                    newDP = 25;
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
                    int damagetaken = 0;
                    int monsterHP_current = newHP;
                    int monsterHP_max = newHP;

                    while (guardianhp > 0 && monsterHP_current > 0) {
                        if (newAP - guardiandp > 0) {
                            damagedealt = newAP - guardiandp;
                        } else {
                            damagedealt = 5;
                        }
                        guardianhp -= damagedealt;
                        if (guardianhp < 0) guardianhp = 0;

                        System.out.printf("> Your monster attacks and deals %d damage\n", damagedealt);
                        System.out.printf("Guardian HP:%d/%d\n", guardianhp, 150);

                        if (guardianhp <= 0) {
                            break;
                        }

                        damagetaken = guardianap - newDP;
                        if (damagetaken < 5) {
                            damagetaken = 5;
                        }
                        monsterHP_current -= damagetaken;
                        if (monsterHP_current < 0) monsterHP_current = 0;

                        System.out.printf("> The Stone Guardian attacks and deals %d damage!\n", damagetaken);
                        System.out.printf("Your HP:" + monsterHP_current + "/" + monsterHP_max + "\n");
                    }
                    if (monsterHP_current > 0) {
                        System.out.println("\nVICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
                        System.out.println("Two skilled adventurers, Swiftclaw and Ironhide, are impressed by Pyre’s strength and decide to join the team!");
                        System.out.println("--- TEAM ROSTER INITIALIZED ---");
                        String[] teamMemberNames = new String[3];
                        int[] teamMemberCurrentHP = new int[3];
                        int[] teamMemberMaxHP = new int[3];
                        int[] teamMemberAP = new int[3];
                        int[] teamMemberDP = new int[3];
                        boolean[] teamMemberAlive = new boolean[3];
                        boolean[] regionsExploredStatus = {false, false, false};

                        initalizeTeam("Pyre", 85, 45, 25, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        int[] totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
                        triggerEvent(0,0,1,teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        regionsExploredStatus[0]=true;
                        totalTeamStats=calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
                        triggerEvent(1, 1, 2, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        regionsExploredStatus[1] = true;
                        totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
                        triggerEvent(2, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        regionsExploredStatus[2] = true;
                        totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
                        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);

                        if (allRegionsExplored(regionsExploredStatus) && checkTeamStatus(teamMemberAlive)) {
                            System.out.println("\nVICTORY! All regions explored successfully!");}
                        else {
                            System.out.println("\nDEFEAT!");}
                    }
                    else {
                        System.out.println("\nDEFEAT! Your monster has fallen. Return to training to prepare for the trial once more.");}

                } else {
                    System.out.println("Error: Destiny number must be between 1 and 10.");
                }
            }
        }
    }

    public static void initalizeTeam(String monsterName, int monsterHP_current, int monsterAP, int monsterDP, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        teamMemberNames[0] = monsterName;
        teamMemberNames[1] = "Switfclaw";
        teamMemberNames[2] = "Ironhide";


        teamMemberCurrentHP[0] = monsterHP_current;
        teamMemberCurrentHP[1] = 80;
        teamMemberCurrentHP[2] = 120;


        teamMemberMaxHP[0] = monsterHP_current;
        teamMemberMaxHP[1] = 80;
        teamMemberMaxHP[2] = 120;


        teamMemberAP[0] = monsterAP;
        teamMemberAP[1] = 40;
        teamMemberAP[2] = 20;


        teamMemberDP[0] = monsterDP;
        teamMemberDP[1] = 10;
        teamMemberDP[2] = 30;


        teamMemberAlive[0] = true;
        teamMemberAlive[1] = true;
        teamMemberAlive[2] = true;
    }

    public static int[] calculateTotalTeamStats(int[] teamMemberCurrentHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        int[] totalteamstate = new int[3];

        for (int i = 0; i < 3; i++) {
            if (teamMemberAlive[i] == true) {
                totalteamstate[0] = totalteamstate[0] + teamMemberCurrentHP[i];
                totalteamstate[1] = totalteamstate[1] + teamMemberAP[i];
                totalteamstate[2] = totalteamstate[2] + teamMemberDP[i];
            }
        }
        return totalteamstate;
    }

    public static void displayTeamStats(String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive, int[] totalTeamStats) {
        System.out.println("+------------------+---------+----+----+-------------+");
        System.out.println("| Member           | HP      | AP | DP | Status      |");
        System.out.println("+------------------+---------+----+----+-------------+");
        for (int j = 0; j < teamMemberNames.length; j++) {
            String Statu = teamMemberAlive[j] ? "Alive" : "Unconscious";
            String hpDisplay = teamMemberCurrentHP[j] + "/" + teamMemberMaxHP[j];

            System.out.printf("| %-16s | %-7s | %-2s | %-2s | %-11s |\n", teamMemberNames[j], hpDisplay, teamMemberAP[j], teamMemberDP[j], Statu);
        }
        System.out.println("+------------------+---------+----+----+-------------+");
        System.out.printf("| TOTAL STATS      | %-7s | %-7s | %-11s |%n", "HP: "+(totalTeamStats[0]), "AP: "+(totalTeamStats[1]), "DP: "+(totalTeamStats[2]));
        System.out.println("+------------------+---------+----+----+-------------+");
    }
    public static boolean allRegionsExplored(boolean[] regionsExploredStatus) {
        for (int j=0;j<regionsExploredStatus.length;j++) {
            if (!regionsExploredStatus[j]) {
                return false;
            }
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
                System.out.println("Event: Your team is ambushed by wild monsters");
                if (simulatedChoice == 1) {
                    int damage = Math.max(5, 40 - totalDP);
                    System.out.println("Outcome: The team fights back bravely! They take 5 damage in the skirmish. Ironhide’s resolve is hardened, increasing its AP by 5.\n");
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
                System.out.println("Event: You discover a glowing crystal vein in the cave wall.\n" +
                        "Outcome: The team harvests the crystals, feeling a surge of vitality. Their maximum and current HP increase!\n");
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
                System.out.println("Event: You find an ancient mechanism on a pressure plate.");
                if (simulatedChoice == 1) {
                    System.out.println("Outcome: It’s a trap! The mechanism releases a burst of negative energy, damaging the team.");
                    applyDamageToTeam(20, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                }
            } else if (scenarioIndex == 1) {
                System.out.println("");
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



    public static void healTeam(int healAmount, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, boolean[] teamMemberAlive) {
        int eligibleCount = 0;
        for (int i = 0; i < teamMemberCurrentHP.length; i++) {
            if ((teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i]) || !teamMemberAlive[i]) {
                eligibleCount++;
            }
        }

        if (eligibleCount == 0) return;

        int healPerMember = healAmount / eligibleCount;

        for (int i = 0; i < teamMemberCurrentHP.length; i++) {
            if ((teamMemberAlive[i] && teamMemberCurrentHP[i] < teamMemberMaxHP[i]) || !teamMemberAlive[i]) {
                int newHP = teamMemberCurrentHP[i] + healPerMember;
                teamMemberCurrentHP[i] = Math.min(newHP, teamMemberMaxHP[i]);

                if (teamMemberAlive[i] == false && teamMemberCurrentHP[i] > 0) {
                    teamMemberAlive[i] = true;
                }
            }
        }
    }
    public static boolean checkTeamStatus(boolean[] teamMemberAlive) {
        for (int k=0;k<teamMemberAlive.length;k++) {
            if (teamMemberAlive[k]) {
                return true;
            }
        }
        return false;
    }
    public static void applyDamageToTeam(int damage, int[] teamMemberCurrentHp, int[] teamMemberDP, boolean[] teamMemberAlive) {
        int live = 0;
        for (int a = 0; a < teamMemberAlive.length; a++) {
            if (teamMemberAlive[a] == true) {
                live++;
            }
        }
        if (live == 0) return;

        int damageper = damage / live;

        for (int b = 0; b < teamMemberAlive.length; b++) {
            if (teamMemberAlive[b] == true) {
                teamMemberCurrentHp[b] = teamMemberCurrentHp[b] - damageper;
                if (teamMemberCurrentHp[b] <= 0) {
                    teamMemberCurrentHp[b] = 0;
                    teamMemberAlive[b] = false;
                }
            }
        }
    }
}

