package jobsheet6;

public class SoftwareDemo {
    public static void main(String[] args) {
        // Instantiate the Game class
        Game game = new Game("Adventure", 4.5);
        
        // Modify attribute values
        game.setGenre("Action");
        game.setRating(5.0);
        
        // Print information about the game
        System.out.println("Game Genre: " + game.getGenre());
        System.out.println("Game Rating: " + game.getRating());
        System.out.println("Software Name: " + game.getName());
        System.out.println("Developer: " + game.getDeveloper());
        
        // Call game methods
        game.start();
        game.save();

        // Instantiate the Application class
        Application app = new Application("ChatGPT", "1.0");
        
        // Modify attribute values
        app.setAppName("ChatGPT Plus");
        app.setVersion("1.1");
        
        // Print information about the application
        System.out.println("App Name: " + app.getAppName());
        System.out.println("App Version: " + app.getVersion());
        System.out.println("Software Name: " + app.getName());
        System.out.println("Developer: " + app.getDeveloper());
        
        // Call application methods
        app.launch();
    }
}
