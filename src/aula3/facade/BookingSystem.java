package aula3.facade;


public class BookingSystem {
    public boolean bookRoom(String date, int nights, String roomType) {
        System.out.println("Booking room for " + nights + " nights.");
        System.out.println("On " + date + " in a " + roomType);
        return true;
    }
}