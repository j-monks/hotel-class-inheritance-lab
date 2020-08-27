import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(22, RoomType.TWIN, 120.99);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void checkBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void checkNights() {
        assertEquals(2, booking.getNights());
    }
}
