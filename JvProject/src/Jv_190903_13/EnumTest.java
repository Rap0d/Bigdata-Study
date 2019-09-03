package Jv_190903_13;

/**
 * ShoesTypeName
 */
public class EnumTest {

    public static void main(String[] args) {
        Shoes s = new Shoes("나이키", 230, ShoesType.RUNNING, ShoesTypeName.RUNNING);

        s.display();

        for(ShoesType type : ShoesType.values()) {
            System.out.println("타입 : " + type + ", 정수값 : " + type.ordinal());
        }

        try {
            ShoesType mytype = ShoesType.valueOf("xxx");
            System.out.println(mytype);
        } catch (IllegalArgumentException e) {
            System.out.println("타입이 존재하지 않음");
            e.getStackTrace();
            //TODO: handle exception
        }
    }
}

enum ShoesType {
    WALKING, RUNNING, TRACKING, HIKING;
}

enum ShoesTypeName {
    WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트래킹화"), HIKING("등산화");
    private String name;

    private ShoesTypeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Shoes {
    String name;
    int size;

    ShoesType shoesType;
    ShoesTypeName shoesTypeName;

    public Shoes(String name, int size, ShoesType shoesType, ShoesTypeName shoesTypeName) {
        this.name = name;
        this.size = size;
        this.shoesType = shoesType;
        this.shoesTypeName = shoesTypeName;
    }

    public void display() {
        System.out.println("신발 이름 : " + this.name);
        System.out.println("신발 사이즈 : " + this.size);
        System.out.println("신발 코드 : " + this.shoesType);
        System.out.println("신발 종류 : " + this.shoesTypeName.getName());
    }
}