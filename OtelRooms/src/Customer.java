import java.util.List;

public class Customer {
    private int customerId;
    private List<Room> reserveRooms;

    public Customer(int customerId, List<Room> reserveRooms) {
        this.customerId = customerId;
        this.reserveRooms = reserveRooms;
    }

    public int getCustomerId() {
        return customerId;
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

}
