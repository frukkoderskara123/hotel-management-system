public class Method{
    public static void nPrintln(String message,int n){
        for (int i=0;i<n;i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        nPrintln("kale",4);
        faktöriyel(5);
        String a="kale";
        System.out.println(a.substring(1,3));


    }
    public static int faktöriyel(int num){
        int a=1;
        for (int i=1;i<=num;i++) {
            a=a*i;
        }
        System.out.println(a);
        return a;
    }
}