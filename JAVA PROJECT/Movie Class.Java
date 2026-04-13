class Movie {
    private String movieName;
    private String showTime;

    // Constructor
    public Movie(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    // Getter methods
    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }
}