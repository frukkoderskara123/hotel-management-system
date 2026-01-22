class Room {
    int roomNumber;
    String guestName;
    boolean isoccupied;
    public Room(int roomNumber) {
        this.roomNumber=roomNumber;
        this.isoccupied=false;
        this.guestName="Empty";
    }
}
class Hotel {
    Room[] rooms;

    public Hotel(int capacity) {
        this.rooms=new Room[capacity];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = new Room(i + 1);
        }
    }

    public void checkin(int roomIndex, String customerName) {
        if (this.rooms[roomIndex].isoccupied) {
            System.out.println("Room is already full!");
        } else {
            this.rooms[roomIndex].guestName = customerName;
            this.rooms[roomIndex].isoccupied = true;
            System.out.printf("Checked in %s to room number %d\n", customerName, roomIndex);
        }
    }

    public void checkout(int roomIndex) {
        if (this.rooms[roomIndex].isoccupied == false) {
            System.out.println("Room is already empty!");
        } else {
            this.rooms[roomIndex].guestName = "Empty";
            this.rooms[roomIndex].isoccupied = false;
            System.out.printf("Checked out from Room %d\n", roomIndex);
        }
    }

    public void display() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.printf("Room %d :[%s]\n", i+1, this.rooms[i].guestName);
        }

    }
}
public class DAY7 {
    public static void main(String[] args) {
        Hotel capacity=new Hotel(5);
        capacity.checkin(0,"Ahmet");
        capacity.checkin(2,"Mehmet");
        capacity.checkin(0,"can");
        capacity.checkout(0);
        capacity.display();
    }
}
