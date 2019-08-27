package Jv_190827_08;

/**
 * PersonEx
 */
public class PersonEx {
    private String name;
    private double height;
    private double weight;
    private String hob;
    private String bl;
    
    PersonEx() {}

    PersonEx(String name, double height, double weight, 
    String hob, String bl) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hob = hob;
        this.bl = bl;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("height : " + height);
        System.out.println("weight : " + weight);
        System.out.println("hobby : " + hob);
        System.out.println("blood : " + bl);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHob() {
        return hob;
    }

    public void setHob(String hob) {
        this.hob = hob;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    
}