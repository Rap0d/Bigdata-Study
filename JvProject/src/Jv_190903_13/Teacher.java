package Jv_190903_13;

/**
 * Teacher
 */
public class Teacher extends Person {
    private String cl;

    public Teacher(String name, int age, String addr, String pnum, int ty, String cl) {
        super(name, age, addr, pnum, ty);
        this.cl = cl;
    }

    public void teach() {
        System.out.println("강의 과목 : " + cl);
        System.out.println(super.getName() + "이(가) " + cl + "를 강의합니다.");
    }

    @Override
    public String toString() {
        super.display();
        this.teach();
        return "";
    }
}