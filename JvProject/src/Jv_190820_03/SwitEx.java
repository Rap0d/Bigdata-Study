package Jv_190820_03;

/**
 * SwitEx
 */
public class SwitEx {

    public static void main(String[] args) {
        Grade();
        Dice(3);
        Dice2(4);
        Dice3(5);
        Logical01();
        Gradecomment();
    }

    private static void Gradecomment() {
        String grade = "C";
        String prize = "";
        switch (grade) {
        case "A":
        case "B":
            System.out.println("참 잘하였습니다.");
            prize += "빌딩";
            break;
        case "C":
        case "D":
            System.out.println("좀 더 노력하세요.");
            prize += "연필";
            break;
        case "F":
            System.out.println("다음 학기에 다시 재수강하세요.");
            prize += "지우개";
            break;
        default:
            System.out.println("잘못된 학점입니다.");
        }
        System.out.println("경품은 " + prize + "입니다.");
    }

    private static void Dice3(int su) {
        if (su > 0 && su < 7) {
            switch (su % 2) {
            case 1:
                System.out.println("홀수");
                break;

            default:
                System.out.println("짝수");
                break;
            }
        } else {
            System.out.println("이상한 주사위네");
        }
    }

    private static void Dice2(int su) {

        switch (su) {
        case 1:
            System.out.println("홀수");
            break;
        case 3:
            System.out.println("홀수");
            break;
        case 5:
            System.out.println("홀수");
            break;
        case 2:
            System.out.println("짝수");
            break;
        case 4:
            System.out.println("짝수");
            break;
        case 6:
            System.out.println("짝수");
            break;
        default:
            System.out.println("error");
            break;
        }
    }

    private static void Dice(int su) {

        switch (su) {
        case 1:
        case 3:
        case 5:
            System.out.println("홀수");
            break;
        case 2:
        case 4:
        case 6:
            System.out.println("짝수");
            break;
        default:
            System.out.println("error");
            break;
        }
    }

    private static void Grade() {
        int score = 75;

        switch (score / 10) {
        case 10:
        case 9:
            System.out.println("A학점");
            break;
        case 8:
            System.out.println("B학점");
            break;
        case 7:
            System.out.println("C학점");
            break;
        case 6:
            System.out.println("D학점");
            break;
        default:
            System.out.println("F학점");
            break;
        }
    }

    private static void Logical01() {
        double ran = Math.random();
        int month = (int) (ran * 12) + 1;

        System.out.print(month + "월은 ");
        switch (month) {
        case 3:
        case 4:
        case 5:
            System.out.println("봄");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("여름");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("가을");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println("겨울");
            break;
        default:
            System.err.println();
            break;
        }
    }
}