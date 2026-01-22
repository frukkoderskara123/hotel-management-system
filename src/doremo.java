public class doremo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            i++;
            if(i%2==0 || i%5==0 || i%7==0|| i%3==0)
                continue;
           switch (i){
               case 2:System.out.println("primary key" + 2);
               break;
               case 3:System.out.println("primary key" +3);
               break;
               case 5:System.out.println("primary key" +5);
               break;
               case 7:System.out.println("primary key" +7);
               default:System.out.println("primary key" +i);
            }i++;
        }
    }
}
