package Jv_190826_07;

/**
 * Computer
 */
public class Computer {
    String cpu = "";
    String ram = "";
    String vga = "";
    String mb = "";
    String pwr = "";
    String csys = "";
    String cs = ""; 
    int price = 0;

    void display(){
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("VGA : " + vga);
        System.out.println("Main Board : " + mb);
        System.out.println("Power : " + pwr);
        System.out.println("Cooling Solution : " + csys);
        System.out.println("Case : " + cs);
        System.out.println("Price : " + price);
    }
}