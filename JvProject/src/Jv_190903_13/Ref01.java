package Jv_190903_13;

class Animal {
    int x = 100;

    void cry() {
        System.out.println("동물이 짖는다.");
    }
}

class Dog extends Animal {
    int y = 200;
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("고양이가 짖는다.");
    }
}

public class Ref01 {
    public static void main(String[] args) {
        // 기본 자료형의 형변환
        double dbl = 35;
        System.out.println("dbl : " + dbl);                         // 1

        // upcasting(업 캐스팅) : 참조 자료형의 형변환
        Animal animal = new Dog();                                  // x = 100, y = 200;

        System.out.println("animal.x : " + animal.x);               // 2

        // 형변환시 서브 클래스의 변수는 한시적으로 접근을 막는다.
        // System.out.println("animal.y : " + animal.y );

        // 상속을 받고 있으므로
        // 수퍼 클래스에 존재하는 메소드 cry()가 실행된다.
        animal.cry();                                               // "동물이 짖는다."

        showData(animal);                                           // i = 3 // x = 100 y = 200

        Animal mycat = new Cat();
        mycat.cry();

        // 동물 2마리를 취급하기 위한 Animal 배열
        Animal[] myani = new Animal[2];

        myani[0] = new Dog();
        myani[1] = new Cat();

        for (int i = 0; i < myani.length; i++) {
            myani[i].cry();
        }
    }

    private static void showData(Animal animal) {
        int i = (int) 3.14; // 명시적인 형변환
        System.out.println(" i : " + i);

        // 강등(downCasting)
        Dog mydog = (Dog) animal;

        System.out.println("강등 후의 출력 결과 ");
        System.out.println("mydog.x : " + mydog.x);

        // 원래 자신의 타입으로 강등되었으므로 y 값을 참조할 수 있다.
        System.out.println("mydog.y : " + mydog.y);
    }
}