import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(30, "Golden Nugget");
        guest = new Guest("John Smith");
    }

    @Test
    public void canGetName() {
        assertEquals("Golden Nugget", diningRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.getGuestCount());
    }
}
