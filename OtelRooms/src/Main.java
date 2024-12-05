import java.sql.Array;

public class Main {
    public static void main(String[] args) {
//        StandartRoom standartRoom = new StandartRoom(1,150);
//        Suite suiteRoom = new Suite(2,22);
//        Deluxe deluxeRoom = new Deluxe(3,30);


        Room room = new Room(1,2200,RoomType.SUITE);
        Room room2 = new Room(2,2500, RoomType.STANDARD);
        Room room3 = new Room(3,5000,RoomType.DELIXE);
        Room [] rooms = new Room[3];
        rooms[0] = room;
        rooms[1] = room2;
        rooms[2] = room3;

                for(Room room1: rooms){
            if(room1.isBooked()){
                room1.displayInfo();
            }
        }

//        Room [] rooms = new Room[3];
//        rooms[0] = standartRoom;
//        rooms[1] = suiteRoom;
//        rooms[2] = deluxeRoom;
//
//        for(Room room: rooms){
//            if(room.isBooked()){
//                room.displayInfo();
//            }
//        }



    }
}