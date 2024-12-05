package otelRooms;

import otelRooms.RoomType;

public  class Room { /// Abstract islede bilerik
    private int roomNomber;
    private  double price;
    private boolean isBooked;
    private RoomType roomType;

    public Room(int roomNomber, double price, RoomType roomType) {
        this.roomNomber = roomNomber;
        this.price = price;
        this.isBooked = true;
        this.roomType = roomType;
    }

    public int getRoomNomber() {
        return roomNomber;
    }

    public void setRoomNomber(int roomNomber) {
        this.roomNomber = roomNomber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

//    public abstract void displayInfo();

    public boolean Reserved (){
        if(!isBooked){
            System.out.println("Otaq bosdur");
            isBooked= false;
        }
        else {

            System.out.println("Otaq artiq doludur");
        }
        return true;
    }

    public void CanselReserved (){
        if(!isBooked){
            isBooked = true;
            System.out.println("Sizin Reserve legv olundu"+ getRoomNomber());
        }
        else {
            System.out.println("Reserv olunmayib otaq bosdur");
        }

    }
    public void displayDetails(){
        System.out.println("Room Nomber: " + getRoomNomber()+ ", " + " Rooms price: " +
                price+ ", " +  "Room Type: "+ roomType+ ", " + " Room Booked: " + (isBooked ? "Yes" : "No")

        );
    }
    @Override
    public String toString() {
        return "Room{" +
                "roomNomber=" + roomNomber +
                ", price=" + price +
                ", isBooked=" + isBooked +

                '}';
    }


}
