package cleaner;

public class RoomApplication {
    public static void main(String[] args) {
        // Anti pattern
        new Room(99);
        System.out.println("How can i clean my room?");
        // gc가 없으면, 청
        System.gc();

        // right pattern
        try (Room adultRoom = new Room(7)){
            System.out.println("How can i clean my room?");
        }
    }
}
