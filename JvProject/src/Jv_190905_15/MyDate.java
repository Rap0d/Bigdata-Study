package Jv_190905_15;

/**
 * MyDate
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        MyDate mydate = (MyDate) obj;
        boolean res = this.year == mydate.year && this.month == mydate.month && this.day == mydate.day;
        return res;
    }
}

/**
 * MyDateMain
 */
class MyDateMain {
    public MyDateMain() {
    }

    public static void main(String[] args) {
        MyDate mydate1 = new MyDate(2019, 9, 5);
        MyDate mydate2 = new MyDate(2019, 9, 5);

        if(mydate1.equals(mydate2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}