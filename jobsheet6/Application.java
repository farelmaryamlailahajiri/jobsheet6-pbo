package jobsheet6;

public class Application extends Software {
    // Attributes
    private String appName;
    private String version;

    // No-argument constructor
    public Application() {
        super("Default Application", "Default Developer");
        this.appName = "Default App";
        this.version = "1.0";
    }

    // Parameterized constructor
    public Application(String appName, String version) {
        super("Application Name", "App Developer");
        this.appName = appName;
        this.version = version;
    }

    // Methods
    public void launch() {
        // Implementation for launching the application
        System.out.println("Launching application: " + appName);
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
