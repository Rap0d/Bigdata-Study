package Jv_190904_14;

/**
 * Unicon
 */
public class Unicon implements Bird, Horse{

    private String name;

    @Override
    public String toString() {
        this.fly();
        this.run();
        return "";
    }
    
    @Override
    public void run() {
        System.out.println(this.name + "가(이) " + Horse.speed + "로 달립니다.");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "가(이) " + Bird.speed + "로 날아다닙니다.");
    }

    public Unicon(String name) {
        this.name = name;
    }

    
}