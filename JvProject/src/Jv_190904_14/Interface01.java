package Jv_190904_14;

/**
 * Interface01
 */
public class Interface01 implements Display01 {
    int speed = Speed.SPEED;
    public static void main(String[] args) {
        Interface01 obj = new Interface01();
        System.out.println("최초 속도 : " + obj.speed);
        obj.speedUp(80);
        obj.display();
        obj.speedDown(50);
        obj.display();
    }

    @Override
    public void speedUp(int inc) {
        System.out.println(inc + "만큼 가속합니다.");
        speed += inc;
    }

    @Override
    public void speedDown(int dec) {
        System.out.println(dec + "만큼 감속합니다.");
        speed -= dec;
    }

    @Override
    public void display() {
        System.out.println("최종 속도 : " + this.speed);
    }
}