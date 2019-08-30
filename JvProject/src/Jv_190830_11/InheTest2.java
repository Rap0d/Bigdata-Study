package Jv_190830_11;

class Mysuper2 {
    private String name;
    public Mysuper2() {
        System.out.println("매개 변수 없는 슈퍼 생성자");
    }

    public Mysuper2(String name2) {
        name = name2;
    }
}

class Mysub2 extends Mysuper2 {
    public Mysub2() {
        super();
        System.out.println("매개 변수 없는 서브 생성자");
    }
    public Mysub2(String name) {
        super(name);
        System.out.println("매개 변수 있는 서브 생성자");
        System.out.println(name);
    }
}

public class InheTest2 {
    public static void main(String[] args) {
        Mysub2 sub = new Mysub2();

        Mysub2 soo = new Mysub2("김철수");

        System.out.println("finished");
    }
}
