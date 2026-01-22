

public class exam3{

    public static void main(String[] args) {

        String monsterName = "Pyre";
        int monsterHP = 85;
        int monsterAP = 45;
        int monsterDP = 25;


        String[] teamMemberNames = new String[3];
        int[] teamMemberCurrentHP = new int[3];
        int[] teamMemberMaxHP = new int[3];
        int[] teamMemberAP = new int[3];
        int[] teamMemberDP = new int[3];
        boolean[] teamMemberAlive = new boolean[3];
        boolean[] regionsExploredStatus = {false, false, false};


        initializeTeam(monsterName, monsterHP, monsterAP, monsterDP, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);

        System.out.println("VICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
        System.out.println("Two skilled adventurers, Swiftclaw and Ironhide, are impressed by Pyre’s strength and decide to join the team!");
        System.out.println("--- TEAM ROSTER INITIALIZED ---");


        int[] totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);



        System.out.println("\n--- Step 1: The Murky Forest ---");
        triggerEvent(0, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        regionsExploredStatus[0] = true;
        totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);


        System.out.println("\n--- Step 2: The Crystal Caves ---");
        triggerEvent(1, 1, 2, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        regionsExploredStatus[1] = true;
        totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);

        System.out.println("\n--- Step 3: The Ancient Ruins ---");
        triggerEvent(2, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        regionsExploredStatus[2] = true;
        totalStats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);
        displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalStats);


        if (checkTeamStatus(teamMemberAlive) && allRegionsExplored(regionsExploredStatus)) {
            System.out.println("\nVICTORY! All regions explored successfully!");
        } else {
            System.out.println("\nDEFEAT! Your team has fallen.");
        }
    }
    public static boolean checkTeamStatus(boolean[] teamMemberAlive) {
        for (int k = 0; k < teamMemberAlive.length; k++) {
            if (teamMemberAlive[k]) {
                return true;
            }
        }
        return false;
    }


    public static void initializeTeam(String monsterName, int monsterHP, int monsterAP, int monsterDP, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {

        teamMemberNames[0] = monsterName;
        teamMemberCurrentHP[0] = monsterHP;
        teamMemberMaxHP[0] = monsterHP;
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
        int[] totalStats = {0, 0, 0};
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
        System.out.println("| Member      |    HP    |     AP   |     DP   |     STATUS   |");
        System.out.println("+-------------+----------+----------+----------+--------------+");
        for (int j = 0; j < teamMemberNames.length; j++) {
            String status = teamMemberAlive[j] ? "Alive" : "Unconscious";
            String hpDisplay = teamMemberCurrentHP[j] + "/" + teamMemberMaxHP[j];
            System.out.printf("| %-11s | %-8s | %-8d | %-8d | %-12s |\n", teamMemberNames[j], hpDisplay, teamMemberAP[j], teamMemberDP[j], status);
        }
        System.out.println("+-------------+----------+----------+----------+--------------+");
        System.out.printf("| TOTAL STATS | HP:%-5d | AP:%-5d | DP:%-5d |              |\n", totalTeamStats[0], totalTeamStats[1], totalTeamStats[2]);
        System.out.println("+-------------+----------+----------+----------+--------------+");
    }

    public static boolean allRegionsExplored(boolean[] regionsExploredStatus) {
        for (boolean status : regionsExploredStatus) {
            if (!status) return false;
        }
        return true;
    }


    public static void triggerEvent(int regionIndex, int scenarioIndex, int simulatedChoice, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive) {
        // Input Validation
        if (scenarioIndex != 0 && scenarioIndex != 1) scenarioIndex = 0;
        if (simulatedChoice != 1 && simulatedChoice != 2) simulatedChoice = 1;

        int[] totals = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);


        if (regionIndex == 0) {
            if (scenarioIndex == 0) {
                System.out.println("Event: Your team is ambushed by wild monsters.");
                if (simulatedChoice == 1) { // Fight
                    int damage = Math.max(5, 40 - totals[2]);
                    System.out.println("Outcome: The team fights back! They take " + damage + " damage.");
                    applyDamageToTeam(damage, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);


                    int minAPIndex = -1;
                    int minAP = 1000;
                    for (int i = 0; i < 3; i++) {
                        if (teamMemberAlive[i] && teamMemberAP[i] < minAP) {
                            minAP = teamMemberAP[i];
                            minAPIndex = i;
                        }
                    }
                    if (minAPIndex != -1) {
                        teamMemberAP[minAPIndex] += 5;
                        System.out.println(teamMemberNames[minAPIndex] + "'s AP increased by 5.");
                    }

                } else {
                    System.out.println("Outcome: Flee attempt failed. Team takes 15 damage.");
                    applyDamageToTeam(15, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                }
            } else {
                System.out.println("Event: You enter a Whispering Grove.");
                if (simulatedChoice == 1) { // Meditate
                    System.out.println("Outcome: The team meditates.");
                    healTeam(20, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAlive);
                    // Increase Highest DP
                    int maxDPIndex = -1;
                    int maxDP = -1;
                    for (int i = 0; i < 3; i++) {
                        if (teamMemberAlive[i] && teamMemberDP[i] > maxDP) {
                            maxDP = teamMemberDP[i];
                            maxDPIndex = i;
                        }
                    }
                    if (maxDPIndex != -1) teamMemberDP[maxDPIndex] += 3;
                }
            }
        }


        else if (regionIndex == 1) {
            if (scenarioIndex == 0) { // Unstable Ceiling
                System.out.println("Event: The ceiling begins to collapse!");
                if (simulatedChoice == 1) { // Run Through
                    System.out.println("Outcome: Ran through falling rocks. 30 damage.");
                    applyDamageToTeam(30, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                } else { // Take Cover
                    System.out.println("Outcome: Cover failed. Lowest HP member takes 10 damage.");
                    int minHPIndex = -1;
                    int minHP = 10000;
                    for (int i = 0; i < 3; i++) {
                        if (teamMemberAlive[i] && teamMemberCurrentHP[i] < minHP) {
                            minHP = teamMemberCurrentHP[i];
                            minHPIndex = i;
                        }
                    }
                    if (minHPIndex != -1) {
                        teamMemberCurrentHP[minHPIndex] = Math.max(0, teamMemberCurrentHP[minHPIndex] - 10);
                        if (teamMemberCurrentHP[minHPIndex] == 0) teamMemberAlive[minHPIndex] = false;
                    }
                }
            } else {
                System.out.println("Event: You discover a glowing crystal vein.");
                if (simulatedChoice == 1) {
                    for (int i = 0; i < 3; i++) if (teamMemberAlive[i]) teamMemberAP[i] += 5;
                } else {
                    System.out.println("Outcome: Harvesting for durability. +10 Max/Current HP.");
                    for (int i = 0; i < 3; i++) {
                        if (teamMemberAlive[i]) {
                            teamMemberMaxHP[i] += 10;
                            teamMemberCurrentHP[i] += 10;
                        }
                    }
                }
            }
        }


        else if (regionIndex == 2) {
            if (scenarioIndex == 0) { // Ancient Mechanism
                System.out.println("Event: You find an ancient mechanism.");
                if (simulatedChoice == 1) { // Activate
                    System.out.println("Outcome: It's a trap! 20 Damage.");
                    applyDamageToTeam(20, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                }
            } else {
                System.out.println("Event: A sacrificial altar.");
                if (simulatedChoice == 1) { // Sacrifice
                    System.out.println("Outcome: Sacrifice made. HP reduced, AP/DP increased.");
                    for (int i = 0; i < 3; i++) {
                        if (teamMemberAlive[i]) {
                            teamMemberCurrentHP[i] = Math.max(1, (int) (teamMemberCurrentHP[i] * 0.75));
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
        for (boolean alive : teamMemberAlive) {
            if (alive) aliveCount++;
        }

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
                if (teamMemberCurrentHP[i] > teamMemberMaxHP[i]) {
                    teamMemberCurrentHP[i] = teamMemberMaxHP[i]; // Cap at Max
                }
                if (!teamMemberAlive[i] && teamMemberCurrentHP[i] > 0) {
                    teamMemberAlive[i] = true;
                }
            }
        }
    }
}