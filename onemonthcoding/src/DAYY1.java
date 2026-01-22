import java.util.Scanner;
class ogrenci{
    String name;
    double averageofnotes;
}
public class DAYY1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ogrenci[]  ogr=new ogrenci[5];
        for (int i=0;i< ogr.length;i++) {
            System.out.println("Can you write students name");
            ogr[i]=new ogrenci();
            ogr[i].name= input.nextLine();
            System.out.println("Can you said his/her note");
            ogr[i].averageofnotes= input.nextInt();
            input.nextLine();// enter yutma sorunu
        }
        double max=0;
        String maxname="";
        for (int j=1;j<ogr.length;j++) {
           if (ogr[j-1].averageofnotes>ogr[j].averageofnotes) {
               max=ogr[j-1].averageofnotes;
               maxname=ogr[j-1].name;}
           else {max=ogr[j].averageofnotes;
            maxname=ogr[j].name;}
    }
        System.out.println("The most succesful student: "+maxname+" and its note: "+max);
    }
}