public class Merambağları{
       static String[] courseNames=new String[0];
       static  int[] courseCredits=new int[0];
       static int creditLimit=30;


    public static void addcourse(String name,int credit){
        if (credit>creditLimit){
            System.out.println("Not enough credits");
            return;}
        creditLimit=creditLimit-credit;
        String[] newcourseNames=new String[courseNames.length+1];
        int[] newcourseCredits=new int[courseCredits.length+1];
        newcourseNames[-1]="Öğrenim";
        newcourseCredits[-1]=5;
    }
    public static void dropCourse(String name){

    }
}