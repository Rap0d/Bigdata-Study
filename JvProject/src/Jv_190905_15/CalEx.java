package Jv_190905_15;

import java.util.Calendar;

/**
 * CalEx
 */
public class CalEx {

    public static void main(String[] args) {
        String today = "20190905";
        cal(today);
    }

    private static void cal(String today) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        
        System.out.println(year + ", " + month);
        
    }
}