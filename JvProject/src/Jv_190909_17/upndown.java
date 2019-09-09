package Jv_190909_17;

import java.util.Random;
import java.util.Scanner;

/**
 * upndown
 */
public class upndown {

    public static void main(String[] args) {
        updown();
    }

    private static void updown() {
        int res = new Random().nextInt(100) + 1;
        int cnt = 1;
        System.out.println("Find Number Game");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int x = 0;
            System.out.print("1과 100 사이의 값을 입력하세요.");
            try {
                x = sc.nextInt();
            } catch (Exception e) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.getStackTrace();
                continue;
            }

            if (x > 100 || x < 0) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
            }

            if (x == res) {
                System.out.println("정답입니다!");
                System.out.println(cnt + "번만에 성공했습니다.");
                break;
            } else if (x > res) {
                System.out.println("그거 보단 작습니다.");
                cnt++;
            } else {
                System.out.println("그거 보단 큽니다.");
                cnt++;
            }
        }
    }
}