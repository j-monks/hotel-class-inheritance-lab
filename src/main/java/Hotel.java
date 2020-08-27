import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
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
