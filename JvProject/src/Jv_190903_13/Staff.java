package Jv_190903_13;

/**
 * Staff
 */
public class Staff extends Person {
    
    private String dep;

    public Staff(String name, int age, String addr, String pnum, int ty, String dep) {
        super(name, age, addr, pnum, ty);
        this.dep = dep;
    }

    public void work() {
        System.out.println("부서 : " + dep);
        System.out.println(super.getName() + "이(가)" + dep + " 부서에서 근무합니다.");
    }

    @Override
    public String toString() {
        super.display();
        this.work();
        return "";
    }
}