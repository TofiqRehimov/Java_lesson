package otelRooms;

import otelRooms.Room;
import otelRooms.RoomType;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        OtelAgents otelAgents = new OtelAgents("Elnur");

        Room room1 = new Room(1,2500,RoomType.STANDARD);
        Room room2 = new Room(2,5500,RoomType.DELIXE);
        Room room3 = new Room(3,2500,RoomType.SUITE);

        otelAgents.addRoom(room1);
        otelAgents.addRoom(room2);
        otelAgents.addRoom(room3);

        otelAgents.DisplayRooms();

        otelAgents.addCustomer(new Customer(1,"Tofiq",Arrays.asList(room1,room2)));
        Customer customer1 = new Customer(2,"Ramazan",Arrays.asList(room2,room3));
        otelAgents.addCustomer(customer1);
        customer1.displayDetails();
        otelAgents.DisplayCustomers();
        room1.Reserved();
        room2.CanselReserved();
        room3.Reserved();


    }
}