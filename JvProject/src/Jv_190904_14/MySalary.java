package Jv_190904_14;

/**
 * MySalary
 */
public class MySalary implements Output01, Calc01 {
    static double incen = 0.5;
    static int count; // 총인원 - 초기값(0)

    private String name;
    private double pay;
    private int family;
    private int overtime;

    private double family_p;
    private double overtime_p;
    private double tax;
    private double incen_p;
    private double total_p;

    @Override
    public void clac() {
        this.family_p = family * 20000;
        this.overtime_p = overtime * 5000;
        this.tax = -pay / 10;
        this.incen_p = pay * incen;
        this.total_p = pay + family_p + overtime_p + incen_p + tax;
    }

    @Override
    public void out() {
        System.out.println(this.name + "\t\t" + (int) this.pay + "\t\t" + this.family + "\t\t" + (int) this.family_p
                + "\t\t" + this.overtime + "\t\t" + (int) this.overtime_p + "\t\t" + (int) this.tax + "\t\t" + incen
                + "\t\t" + (int) this.incen_p + "\t\t" + (int) this.total_p);
    }

    public MySalary(String name, double pay, int family, int overtime) {
        this.name = name;
        this.pay = pay;
        this.family = family;
        this.overtime = overtime;
    }

}