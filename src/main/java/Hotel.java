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
}
