package aula3.facade;

public class BookingApp {
    public static void main(String[] args) {
        BookingFacade facade = new BookingFacade();
        facade.bookRoom("2021-10-01", 
                        3, 
                        "Single", 
                        "1234-5678-9012-3456",
                        "x@y.com");
    }
    
}
