import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(50, RoomType.DOUBLE, 120.99);
        guest = new Guest("Jane Doe");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetNumber() {
        assertEquals(50, bedroom.getNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canGetRate() {
        assertEquals(120.99, bedroom.getRate());
    }
}
