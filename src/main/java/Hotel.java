import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void checkIn(Room room, Guest guest1) {
        room.addGuest(guest1);
    }

    public void checkOut(Room room, Guest guest1) {
        room.removeGuest(guest1);
    }


    public Booking bookRoom(Bedroom bedroom, int night) {
       Booking booking = new Booking(bedroom, night);
       return booking;
    }
}
