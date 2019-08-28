package Jv_190828_09;

/**
 * Hakseng
 */
class Hakseng {
    String name; // 이름
    int no; // 학년
    int ban; // 반
    int kor; // 국어
    int eng; // 영어
    int math; // 수학

    // 학생의 정보를 입력 받는 생성자
    public Hakseng(String name, int no, int ban, int kor, int eng, int math) {
        this.name = name;
        this.no = no;
        this.ban = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void Display() { // 결과를 보여주는 메소드
        System.out.println("학생 이름 : " + this.name);
        System.out.println("학년 / 반 : " + this.no + " / " + this.ban);
        System.out.println("국어 : " + this.kor);
        System.out.println("영어 : " + this.eng);
        System.out.println("수학 : " + this.math);

        int total = this.kor + this.eng + this.math; // 총점
        double average = (double) total / 3; // 평균
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f \n", average);
    }
}
