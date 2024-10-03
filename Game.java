package jobsheet6;

public class Game extends Software {
    // Attributes
    private String genre;
    private double rating;

    // No-argument constructor
    public Game() {
        super("Default Game", "Default Developer");
        this.genre = "Default Genre";
        this.rating = 0.0;
    }

    // Parameterized constructor
    public Game(String genre, double rating) {
        super("Game Name", "Game Developer");
        this.genre = genre;
        this.rating = rating;
    }

    // Methods
    public void start() {
        // Implementation for starting the game
        System.out.println("Starting the game: " + genre);
    }

    public void pause() {
        // Implementation for pausing the game
        System.out.println("Game paused: " + genre);
    }

    public void save() {
        // Implementation for saving the game
        System.out.println("Game saved: " + genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
