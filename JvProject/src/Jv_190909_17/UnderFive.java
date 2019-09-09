package Jv_190909_17;

/**
 * UnderFive
 */
public class UnderFive {

    public static void main(String[] args) {
        int x = 3;

        try {
            if(x < 5) {
                throw new LessThan5("5보다 큰 수 넣으세요.");
            } else {
                System.out.println("정상");
            }
        } catch(LessThan5 e) {
            System.out.println("5보다 작은 정수");
            System.out.println(e.getMsg());
            System.out.println(e.toString());
        }
    }
}

class LessThan5 extends Exception {
    private String msg;
    public LessThan5(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return "오버라이딩 : " + this.msg;
    }
}