package Jv_190906_16;

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object target) {
        MyDate mydate = (MyDate) target;
        boolean result = this.year == mydate.year && this.month == mydate.month && this.day == mydate.day;

        return result;
    }
}

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2019, 9, 6);
        MyDate date2 = new MyDate(2019, 9, 5);

        if (date1.equals(date2)) {
            System.out.println("동일함");
        } else {
            System.out.println("동일하지 않음");
        }
    }
}