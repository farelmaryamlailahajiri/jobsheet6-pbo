package jobsheet6;

public class Software {
    // Attributes
    private String name;
    private String developer;

    // No-argument constructor
    public Software() {
        this.name = "Default Software";
        this.developer = "Default Developer";
    }

    // Parameterized constructor
    public Software(String name, String developer) {
        this.name = name;
        this.developer = developer;
    }

    // Methods
    public void install() {
        // Implementation for installing the software
        System.out.println("Installing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
