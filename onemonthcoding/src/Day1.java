

class phone {
    String brand;
    int battery;
    int storoge;

    public void batterycount() {
        System.out.println(brand + "begin to decrease: " + battery);
        System.out.println("in addition ,storoge is: " + storoge);


        while (battery > 0) {
            battery = battery - 10;
            System.out.println("battery is decreasing current battery is: " + battery);

            if (battery < 0) {
                battery = 0;
            }
        }

        System.out.println("battery run out of phone");
    }
}
    public class Day1 {
        public void main(String[] args) {
            phone myphone=new phone();
            myphone.battery=100;
            myphone.brand="Samsung";
            myphone.storoge=64;

            myphone.batterycount();
        }
    }


