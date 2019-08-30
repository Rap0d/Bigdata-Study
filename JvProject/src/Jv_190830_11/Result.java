package Jv_190830_11;

/**
 * Result
 */
public class Result extends Sungjuk {
    private int total = 0;
    private double average = 0.0;
    
    public Result(String name, int kor, int eng, int math) {
        super(name, kor, eng, math);
    }
    
	public void getData() {
        super.display();
        this.display();
    }
    
    public void display() {
        total = getKor() + getEng() + getMath();
        average = (double)total / 3;
        System.out.println(super.getName() + "의 총점 : " + total + ", " + "평균 : " + average);
    }

}