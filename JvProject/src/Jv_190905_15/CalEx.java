package Jv_190905_15;

import java.util.Calendar;

/**
 * CalEx
 */
public class CalEx {
    private static void cal(String today) {
        Calendar c = Calendar.getInstance();

        int y2 = Integer.parseInt(today.substring(0, 4));
        int m2 = Integer.parseInt(today.substring(4, 6));
        int d2 = Integer.parseInt(today.substring(6, 8));

        c.set(y2, m2 - 1, d2);

        System.out.println(y2 + ", " + m2 + ", " + d2);

        int lastday = c.getActualMaximum(Calendar.DATE);
        int weekconst = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(lastday + ", " + weekconst);

        System.out.println();
        System.out.println(y2 + "년 " + m2 + "월 달력");
        System.out.println("========================================================"
                + "================================================");
                
        System.out.println("일\t\t월\t\t화\t\t수\t\t목\t\t금\t\t토");

        for (int j = 1; j < weekconst; j++) {
            System.out.print("\t\t");
        }

        for (int i = 1; i <= lastday; i++) {
            if (weekconst % 8 == 0) {
                System.out.println();
                weekconst = 1;
            }
            System.out.print(i + "\t\t");
            weekconst++;
        }
    }

    public static void main(String[] args) {
        String today = "20191001";
        cal(today);
    }
}