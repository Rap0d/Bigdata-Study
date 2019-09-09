package Jv_190909_17;

import java.util.Scanner;

/**
 * GGException
 */
public class GGException {
    public static void main(String[] args) {
        String[] gG = {"서현", "수영", "써니", "유리", "윤아", "제시카", "태연", "티파니", "효연"};
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        boolean isMem = false;

        for (int i = 0; i < gG.length; i++) {
            if(name.equals(gG[i])) {
                isMem = true;
                break;
            }
        }

        if(isMem) {
            System.out.println("소시 멤버 맞아요");
        } else {
            String msg = name + "은 소시 멤버아님";

            try {
                throw new GGEx(msg);
            } catch (GGEx e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

class GGEx extends Exception {
    private String msg;

    public GGEx(String msg) {
        System.out.println("GGEx 호출됨");
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "문자열 : " + this.msg;
    }

    @Override
    public String getMessage() {
        return "메시지 내용 : " + this.msg;
    }
}