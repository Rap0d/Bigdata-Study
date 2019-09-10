package Jv_190909_17;

/**
 * MinScoreException
 */
class MinScoreException extends Exception {
    private String msg;
    private String name;
    
    public MinScoreException(String name, String msg) {
        this.msg = msg;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "님은 " + this.msg;
    }
}

/**
 * FailedException
 */
class FailedException extends Exception {
    private String msg;
    private String name;

    public FailedException(String name, String msg) {
        this.msg = msg;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "님은 " + this.msg;
    }
}

/**
 * ExceptionEx01
 */
public class ExceptionEx01 {
    public static void main(String[] args) {
        String name = "김철수";
        int kor = 100, eng = 50, math = 20;

        int total = kor + eng + math;

        if(kor <= 40 || eng <= 40 || math <= 40) {
            String msg = "과락입니다.";
            try {
                throw new FailedException(name, msg);
            } catch (FailedException e) {
                System.out.println(e.toString());
            }
        }
        if(total < 180) {
            String msg = "총점 미달입니다.";
            try {
                throw new MinScoreException(name, msg);
            } catch (MinScoreException e) {
                System.out.println(e.toString());
            }
        }
        double avg = (double)total / 3.0;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
    }
}
