package Jv_190829_10;

public class Student {
    private String name;
    // 인스턴스 변수에 값을 대입하면, 초기 값이 된다.
    private int kor = 80;
    private int eng = 70;
    private int math = 50;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public Student(String name, int kor) {
        this.name = name;
        this.kor = kor;
    }

    char grade(double avg) {
        char g = 'F';
        switch ((int)(avg / 10)) {
        case 10:
        case 9:
            g = 'A';
        case 8:
        case 7:
            g = 'B';
            break;
        case 6:
        case 5:
            g = 'C';
            break;
        case 4:
        case 3:
            g = 'D';
            break;
        default:
            break;
        }
        return g;
    }

    public void Display() {
        int total = kor + eng + math; // 총점
        double average = (double) total / 3; // 평균
        char g = grade(average);

        String imsi = "%s의 총점은 %d이고, 평균은 %.2f, 학점은 %c이다.\n";
        System.out.printf(imsi, name, total, average, g);
    }
}
