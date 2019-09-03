package Jv_190903_13;

/**
 * Student
 */
public class Student extends Person {
    private int grade;
    private String score;

    public Student(String name, int age, String addr, String pnum, int ty, int grade, String score) {
        super(name, age, addr, pnum, ty);
        this.grade = grade;
        this.score = score;
    }

    public void learn() {
        System.out.println("학년 : " + grade);
        System.out.println("학점 : " + score);
        System.out.println(super.getName() + "이(가) 공부합니다.");
    }

    @Override
    public String toString() {
        super.display();
        this.learn();
        return "";
    }
}