package Jv_190902_12;

/**
 * Football
 */
public class Football extends Sports{
    private int goal;

    public Football() {

    }

    public Football(String name, int entry, int goal) {
        super(name, entry);
        this.goal = goal;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("골 수 : " + goal);
    }

    @Override
    public String toString() {
        return  super.getName() + "는 재밌어.";
    }
}