package Jv_190909_17;

import java.util.Calendar;

/**
 * UserCalender
 */
public class UserCalender {
    public UserCalender() {
        Calendar cal = Calendar.getInstance();

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int ampm = cal.get(Calendar.AM_PM);
        String sAmPm = ampm == 0 ? "오전" : "오후";

        String tmp = "현재 시각 : " + sAmPm + ", " + hour + "시 " + min + "분 " + sec + "초";
        System.out.println(tmp);
    }
}