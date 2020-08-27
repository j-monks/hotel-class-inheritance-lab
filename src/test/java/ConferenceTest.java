import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
    guest = new Guest("Donald Sand");
    conferenceRoom = new ConferenceRoom(100,"The Hudson");
    }

    @Test
    public void canGetName() {
        assertEquals("The Hudson", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getGuestCount());
    }
}
