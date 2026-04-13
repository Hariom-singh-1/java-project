class Seat {
    private String type;     // Premium / Regular
    private double price;
    private boolean isBooked;

    // Constructor
    public Seat(String type, double price) {
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        isBooked = true;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}