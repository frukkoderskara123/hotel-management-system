import java.util.ArrayList;
public class DAY1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();// Array list açma
        list.add("Ali");// listeye eleman ekler 0 indeksinden başlayarak
        list.add("kemal");//
        String a = list.get(0);// listenin 0. elemanını alır
        int k = list.size();// arrayin uzunluğunu gösterir
        list.remove(1);// listenin belirtilen indeksindeki elemanı kaldırır
        System.out.println(list);


    }
}