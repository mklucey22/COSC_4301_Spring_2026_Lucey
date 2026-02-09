//TIP
public class Monster {
    private String name;
    private String type;
    private String description;

    // Constructor
    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
        this.description = name + " is a " + type + "-type monster from the Neon Ark training program.";
    }

    // Method that returns a description
    public String getDescription() {
        return description;
    }

    // Optional: Getters for name and type
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}