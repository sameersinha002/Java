// package Assignment1;

public class p3 {
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(2, "Bedroom", 45.78f, 4);
        room.displayData();
    }
}

class Room {
    int roomno;
    String roomType;
    float roomArea;
    int ACmachine;

    void setData(int roomno, String roomType, float roomArea, int ACmachine) {
        this.roomno = roomno;
        this.roomArea = roomArea;
        this.roomType = roomType;
        this.ACmachine = ACmachine;
    }

    void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Type: " + roomType);
        System.out.println("Area: " + roomArea);
        System.out.println("AC Machine: " + ACmachine);
    }
}