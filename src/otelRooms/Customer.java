package otelRooms;

import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private List<Room> reserveRooms;


    public Customer(int customerId, String customerName, List<Room> reserveRooms) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.reserveRooms = reserveRooms;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Room> getReserveRooms() {
        return reserveRooms;
    }

    public void setReserveRooms(List<Room> reserveRooms) {
        this.reserveRooms = reserveRooms;
    }

    public void reserveRoom(Room room) {
        if (!room.Reserved()) {
            room.Reserved();
            reserveRooms.add(room);
            System.out.println("Room " + room.getRoomNomber() + " hass add List");
        } else {
            System.out.println("Otaq reserv olunub artiq");
        }

    }
    public void canselReserve (Room room){
        if(room.Reserved()){
            room.Reserved();
            reserveRooms.remove(room);
            System.out.println("Room " + room.getRoomNomber() + " hass remove List" );
        }
        else{
            System.out.println("Otaq reserv olunub artiq");
        }
    }
    public void displayDetails(){
        System.out.println("Customer ID: " + customerId + " Name "+ customerName + " Reserved Rooms " + reserveRooms);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", reserveRooms=" + reserveRooms +
                '}';
    }
}
