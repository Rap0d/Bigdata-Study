package Jv_190816_01;

public class TimeCalcul {
    public static void main(String[] args) {
        int TIME = 354934;
        int day, hour, hourRes, min, sec;

        hour = TIME / 3600;
        day = hour / 24;
        hourRes = hour - (day * 24);
        min = (TIME - (hour * 3600)) / 60;
        sec = TIME % 60;

        System.out.println(TIME + "초는 " + day + "일 " + hourRes + "시간 " + min + "분 " + sec + "초 입니다.");

        int su = 1234;
        System.out.println("result = " + ((su / 1000) + (su%10)*1000 +
         ((su%100)/10)*100 + ((su%1000)/100)*10));
    }
}