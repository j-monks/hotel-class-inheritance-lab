import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Booking booking;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    HashMap<String, DiningRoom> diningRooms;



    @Before
    public void before() {
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        diningRooms = new HashMap<String, DiningRoom>();
        booking = new Booking(bedroom1, 2);

        bedroom1 = new Bedroom(1, RoomType.SINGLE, 120.99);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE,120.99);
        bedroom3 = new Bedroom(3, RoomType.FAMILY, 120.99);
        conferenceRoom1 = new ConferenceRoom(100, "The Hudson");
        conferenceRoom2 = new ConferenceRoom(50, "The Swan");
        diningRoom1 = new DiningRoom(30, "The Rose");
        diningRoom2 = new DiningRoom(60, "The Oxe");
        diningRooms.put(diningRoom1.getName(), diningRoom1);

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        guest1 = new Guest("John Doe");

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

    @Test
    public void canCheckInGuestIntoBedroom() {
        hotel.checkIn(bedroom1, guest1);
        assertEquals(1, bedroom1.getGuestCount());
    }


    @Test
    public void canCheckOutGuestFromBedroom() {
        hotel.checkIn(bedroom1, guest1);
        hotel.checkOut(bedroom1, guest1);
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void canCheckInGuestIntoConferenceRoom() {
        hotel.checkIn(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.getGuestCount());
    }


    @Test
    public void canCheckOutGuestFromConferenceRoom() {
        hotel.checkIn(conferenceRoom1, guest1);
        hotel.checkOut(conferenceRoom1, guest1);
        assertEquals(0, conferenceRoom1.getGuestCount());
    }

    @Test
    public void canBookBedroom() {
        booking = new Booking (bedroom1, 2);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(2, booking.getNights());
    }


}
