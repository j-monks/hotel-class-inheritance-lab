public class Bedroom extends Room {

    private int number;
    private RoomType roomType;
    private double rate;

    public Bedroom(int number, RoomType roomType, double rate) {
        super(roomType.getCapacity());
        this.number = number;
        this.roomType = roomType;
        this.rate = rate;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }
}
