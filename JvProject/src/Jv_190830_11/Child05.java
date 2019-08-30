package Jv_190830_11;

public class Child05 extends Parent05 {
    int y = 200;

    // 어노테이션(annotation) :
    // @다음에 의미있는 단어를 붙여 개발자에게 제공하는 일종의 고급스런 툴팁/주석
    @Override // Display 메소드는 오버라이드 되었다.
    public void Display() {
        String imsi = "이름 : " + super.getName() + ", 나이 : " + super.getAge();
        System.out.println(imsi);
    }

    public Child05() {
        super();
        System.out.println("난 서브야");
    }

    public Child05(String name, int age) {
        // 다음과 같이 코딩하게 되면 super() 은 더 이상 실행이 안된다.
        super(name, age);
    }

    public void getData() {
        System.out.println("super.x : " + super.x);
        System.out.println("this.y : " + this.y);

        this.Display();
        super.Display();
    }

    public Child05(int x, int y) {
        overload(x);
        overload(x, y);
    }

    private void overload(int data) {
        int total = 0; // 1부터 x까지의 정수의 총합 구하기
        for (int i = 0; i <= data; i++) {
            total += i;
        }
        System.out.println("총합 : " + total);
    }

    private void overload(int first, int second) {
        // 2개의 정수의 덧셈
        System.out.println(first + second);
    }
}
