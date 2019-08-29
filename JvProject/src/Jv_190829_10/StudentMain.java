package Jv_190829_10;

public class StudentMain {
    public static void main(String[] args) {
        Student jessica = new Student("제시카", 70, 80, 90);
        jessica.Display();

        Student tiffany = new Student("티파니", 60, 50);
        tiffany.Display();

        Student taeyeon = new Student("태연", 30);
        taeyeon.Display();
    }
}
