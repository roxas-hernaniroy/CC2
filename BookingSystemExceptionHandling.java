//Roxas, Hernani Roy B.
//CITCS 1B-B

class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String error) {
        super(error);
    }
}

public class BookingSystemExceptionHandling {
    public static void main(String[] args) {
        int filledSeats = (int)(Math.random() * 392); //random generator for demonstration, assume Boeing 777-300ER seat capacity
        //int filledSeats = 392; //test full capacity
        System.out.println(filledSeats + " seats have been booked in this flight. Capacity is 392.");

        try {
            System.out.println("We are attempting to book a seat for your chosen flight...");

            if (filledSeats == 392) {
                throw new NoSeatsAvailableException("There are no more seats available for your chosen flight. Try a different flight.");
            }
            else {
                filledSeats += 1;
                System.out.println("Your seat has been booked. You are number " + filledSeats + " in the seat assignment queue. Thank you for your patronage.");
            }
        }
        catch (NoSeatsAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
