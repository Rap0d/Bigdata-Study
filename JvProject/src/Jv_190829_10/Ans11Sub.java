package Jv_190829_10;

import java.util.Scanner;

/**
 * Ans11Sub
 */
public class Ans11Sub {
    private double mid;
    private double fin;
    private double rep;
    private double att;
    private double score;
    private String comment;
    private final double WEIGHT_03 = 0.3;
    private final double WEIGHT_02 = 0.2;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("중간고사 성적을 입력하세요 : ");
        mid = sc.nextInt();
        System.out.print("기말고사 성적을 입력하세요 : ");
        fin = sc.nextInt();
        System.out.print("리포트 점수를 입력하세요 : ");
        rep = sc.nextInt();
        System.out.print("출석 점수를 입력하세요 : ");
        att = sc.nextInt();
    }

    double calcScore() {
        mid = mid * WEIGHT_03;
        fin *= WEIGHT_03;
        rep *= WEIGHT_02;
        att *= WEIGHT_02;
        score = (mid + fin + rep + att);

        return score;
    }

    char getGrade() {
        char grade = 'F';
        switch ((int) (score / 10)) {
        case 10:
        case 9:
            grade = 'A';
            comment = "Excellent";
            break;
        case 8:
        case 7:
            grade = 'B';
            comment = "Excellent";
            break;
        case 6:
        case 5:
            grade = 'C';
            comment = "Good";
            break;
        case 4:
        case 3:
            grade = 'D';
            comment = "Good";
            break;
        default:
            comment = "Poor";
            break;
        }
        return grade;
    }

    void display() {
        System.out.print("성적 : ");
        System.out.printf("%.2f\n", calcScore());
        System.out.println("학점 : " + getGrade());
        System.out.println("평가 : " + comment);
    }
}