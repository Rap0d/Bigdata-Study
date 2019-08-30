package Jv_190830_11;

public class Parent05 {
    int x = 100;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Parent05() {
        System.out.println("난 슈퍼야");
    }

    public Parent05(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Display() {
        String imsi = this.name + "는(은) " + this.age + "살입니다";
        System.out.println(imsi);
    }
}
