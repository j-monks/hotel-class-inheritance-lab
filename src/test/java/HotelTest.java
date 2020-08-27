import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before() {
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();

        bedroom1 = new Bedroom(1, RoomType.SINGLE);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE);
        bedroom3 = new Bedroom(3, RoomType.FAMILY);
        conferenceRoom1 = new ConferenceRoom(100, "The Hudson");
        conferenceRoom2 = new ConferenceRoom(50, "The Swan");

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canGetNumberOfBedrooms() {
        assertEquals(3, hotel.bedroomCount());
    }

    @Test
    public void canGetNumberOfConferenceRooms() {
        assertEquals(2, hotel.conferenceRoomCount());
    }

}
