package Jv_190902_12;

/**
 * Baseball
 */
public class Baseball extends Sports{
    private double hitrate;
    
    public Baseball() {

    }

    public Baseball(String name, int entry, double hitrate) {
        super(name, entry);
        this.hitrate = hitrate;
    }

    void Display() {
        super.show();
        System.out.println("타율 : " + hitrate);
    }
}