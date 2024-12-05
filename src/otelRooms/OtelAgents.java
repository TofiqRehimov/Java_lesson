package otelRooms;


import java.util.ArrayList;
import java.util.List;

public class OtelAgents {
    private String agentName;
    private  List <Room> rooms;
    private List<Customer> customers;

    public OtelAgents(String agentName) {
        this.agentName = agentName;
        this.rooms = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addRoom(Room room) {
//        rooms.add(room);
        rooms.add(room);
        System.out.println("Room "+ room.getRoomNomber()+ "  elave olundu");
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer "+ customer.getCustomerName()+ "  elave olundu");
    }
    public void DisplayRooms() {
        for (Room room : rooms) {
            room.displayDetails();
        }
    }
    public void DisplayCustomers() {
        for (Customer customer : customers) {
            customer.displayDetails();
        }
    }



}
