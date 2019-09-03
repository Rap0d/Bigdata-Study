package Jv_190903_13;

/**
 * Test001
 */
public class Test001 {

    public static void main(String[] args) {
        Calc c = new Calc(5);
        System.out.println(c.getRes());
    }
}

class Calc {
    private int a;
    private int res;

    public Calc(int a) {
        this.a = a;
        calcNum(a);
    }
    
    private int calcNum(int a) {
        for(int i = 1; i <= a; i++) {
            if(i % 2 != 0) {
                res += i * i;
            } else {
                res -= i * i * i;
            }
        }
        return res;
    }

    /**
     * @return the res
     */
    public int getRes() {
        return res;
    }
}