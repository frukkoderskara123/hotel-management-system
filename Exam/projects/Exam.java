public class Exam {
    public static void main(String[] args) {
        System.out.println(4/8);// kesirli sayılara girmiyor
        String a="kale";
         a= a.replace('a','e');
         System.out.println(a);
         System.out.println(a.toUpperCase());// Eğer böyle yaparsak tüm kelimeyi büyütmüüş oluruz
        int c=120;
        int b=2;
        System.out.println(divide(c,b));
        int k=10;
        int l=6;
        //immutable=dedğişmez
        //primitive=constant
        double[] weight={45,56,77};
        double[] şato={1,2,3,4};
        double finish=5.5;
        System.out.println(şato[2]*weight[1]+finish);






    }





    public static int[] divide(int c,int b) {
        return new int[] {c/b,c%b};
    }
}