import java.util.ArrayList;

public class ARRAYLİST {
    public static void main(String[] args){
        ArrayList<String>  ada=new ArrayList<String>();
        ada.add("MonaLisa");
        ada.add("Monte Carlo");
        ada.add("Sakıp Sabancı");
        ada.add("Yahya Kemal");

        ada.remove(3);
        ada.remove("Sakıp Sabancı");

        System.out.println(ada.get(0));
        for (int i=0;i<ada.size();i++) {
            System.out.println(ada.get(i));

        }


        }
    }
