package Jv_190904_14;

/**
 * Animal
 */
public abstract class Animal {
    private String name;
    private String location;

    public abstract void move();

    public Animal() {

    }

    public Animal(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal [name:" + name + ", location:" + location + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
