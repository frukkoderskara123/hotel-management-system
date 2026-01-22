class wallet {
    private double balance;// bu direk objecte erişmeyi engelliyo
    public double getbalanc() {
        return this.balance;

    }
    public void setbaalance(double amount) {
        if (amount<0) {
            System.out.println("Invalid amount entered");
            return;
        }
        this.balance=amount;

    }
}
public class NEWKONU {
    public static void main(String[] args) {
        wallet object=new wallet();
        object.setbaalance(-500);
        object.setbaalance(1000);
        System.out.println(object.getbalanc());
    }

}