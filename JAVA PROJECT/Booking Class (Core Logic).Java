// Booking.java
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Seat[][] seats;
    private double totalCost;
    private Movie movie;
    private List<String> selectedSeats;

    // Constructor
    public Booking(Movie movie, int rows, int cols) {
        this.movie = movie;
        this.seats = new Seat[rows][cols];
        this.totalCost = 0;
        this.selectedSeats = new ArrayList<>();

        // Initialize seats
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < 2) { // first 2 rows premium
                    seats[i][j] = new Seat("Premium", 250);
                } else {
                    seats[i][j] = new Seat("Regular", 150);
                }
            }
        }
    }

    // Book seat
    public boolean bookSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid seat selection!");
            return false;
        }

        Seat seat = seats[row][col];
        if (seat.book()) {
            totalCost += seat.getPrice();
            selectedSeats.add("(" + (row+1) + "," + (col+1) + ")");
            System.out.println("Seat booked successfully!");
            return true;
        } else {
            System.out.println("Seat already booked!");
            return false;
        }
    }

    // Display seat layout
    public void displaySeats() {
        System.out.println("Seat Layout:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].isBooked()) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    // Display booking confirmation
    public void displayConfirmation() {
        System.out.println("\nBooking Confirmed!");
        movie.displayMovieInfo();
        System.out.println("Selected Seats: " + selectedSeats);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}