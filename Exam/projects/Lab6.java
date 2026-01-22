import java.util.Arrays;

public class Lab6{

    static int[] inventory = {101, 505, 202};

    public static void main(String[] args) {
        System.out.println("--- START ---");

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- LOOTING RING (550) ---");

        lootItem(550);

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING SHIELD (202) ---");
        dropItem(202);

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING MISSING ITEM (999) ---");
        dropItem(999);

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());
    }
    public static void lootItem(int newItemID){
        int[] newinventory=new int[inventory.length+1];
        for (int i=0;i<inventory.length;i++){
            newinventory[i]=inventory[i];

        }
        newinventory[newinventory.length-1]=newItemID;
        inventory=newinventory;
    }
    public static void dropItem(int itemToRemove){
        boolean temp=false;
        for (int kale : inventory) {
            if (kale==itemToRemove) {
                temp=true;
                break;
            }
        }
        if (temp==false){
            return;
        }
        int index=0;
        int[] newinventory=new int[inventory.length-1];
        boolean şato=false;
        for (int i=0;i<inventory.length;i++) {
            if (inventory[i]==itemToRemove && şato==false){
                şato=true;
                continue;}
            newinventory[index]=inventory[i];
            index++;
        }
        inventory=newinventory;
    }
    public static double calculateTotalWeight(){
        double totalweight=0;
        for (int i=0;i<inventory.length;i++){
            if(inventory[i]>=100 && inventory[i]<=199){
                totalweight+=5;
            }
            if (inventory[i]>=200 && inventory[i]<=299){
                totalweight+=10;
            }
            if (inventory[i]<100 || inventory[i]>299){
                totalweight+=1;
            }
        }
        return totalweight;

    }
}