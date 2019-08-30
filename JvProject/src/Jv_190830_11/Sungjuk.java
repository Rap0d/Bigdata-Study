package Jv_190830_11;

/**
 * Sungjuk
 */
public class Sungjuk extends Object {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Sungjuk(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
	}

	void display() {
        System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
    }

    @Override
    public String toString() {
        return "메롱";
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}