public class Bedroom extends Room {

    private int number;
    private RoomType roomType;

    public Bedroom(int number, RoomType roomType) {
        super(roomType.getCapacity());
        this.number = number;
        this.roomType = roomType;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

}
