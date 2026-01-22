class produc{
    String name;
    double price;
    int stock;
    public produc(String name,double price,int stock) {
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

}
class vendingmachine {
    produc[] slots;
    double balance;

    public vendingmachine(int capacity) {
        this.slots = new produc[capacity];
    }

    public void addproduct(int index, String name, double price, int stock) {
        produc eşya1 = new produc(name,price,stock);
        this.slots[index]=eşya1;
    }

    public void insertmoney(int amount) {
        this.balance += amount;

    }

    public void selectproduct(int index) {
        if (this.slots[index] != null) {
            if (this.slots[index].stock > 0) {
                if (this.balance >= this.slots[index].price) {
                    this.balance -= this.slots[index].price;
                    this.slots[index].stock -= 1;
                    System.out.println("selection of prodoct was finished succesfully");


                }

            }

        }

    }
}
    public class ad {
        public static void main(String[] args) {
            vendingmachine machine=new vendingmachine(3);
            machine.addproduct(1,"phone",100.00,5);
            machine.insertmoney(101);
            machine.selectproduct(1);
        }
    }

