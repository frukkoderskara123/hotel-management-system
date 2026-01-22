import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class student {
    String name;
    int midterm;
    int finalExam;
    public student(String name,int midterm,int finalexam) {
        this.name=name;
        this.finalExam=finalexam;
        this.midterm=midterm;}
    public double calculateaverage() {
        this.midterm=midterm;
        this.finalExam=finalExam;
        double sonuç=(this.midterm * 40 / 100)+ (this.finalExam * 60 /100);
        return sonuç;
    }
}
public class DAY3 {
    public static void main(String[] args) {
        student ogrenci1=new student("Ela",0,100);
        student ogrenci2=new student("ali",100,0);
        student ogrenci3=new student("Kemal",0,80);
        ArrayList<Double> LİST1=new ArrayList<>();
        LİST1.add(ogrenci1.calculateaverage());
        LİST1.add((ogrenci2.calculateaverage()));
        LİST1.add(ogrenci3.calculateaverage());
        ArrayList<student> List2=new ArrayList<>();
        List2.add(ogrenci1);
        List2.add(ogrenci2);
        List2.add(ogrenci3);
        int i=0;
        double max=0;
        String name="";
        for (double p : LİST1) {
            System.out.printf("Name: %s  Puan: %f\n",List2.get(i).name,p);
            if (p>max) {
                max=p;
                name=List2.get(i).name;
            }
            i++;
        }
        System.out.printf("The best student: %s and its not: %f ",name,max);




    }
}