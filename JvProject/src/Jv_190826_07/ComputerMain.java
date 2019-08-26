package Jv_190826_07;

/**
 * ComputerMain
 */
public class ComputerMain {

    public static void main(String[] args) {
        Computer c1 = new Computer();

        c1.cpu = "RYZEN 2700x";
        c1.ram = "Samsung 8G RAM";
        c1.mb = "Asus X470";
        c1.vga = "RTX2070";
        c1.csys = "NH-D15";
        c1.cs = "3RSYS T200";
        c1.pwr = "Antec 750W";
        c1.price = 1500000;

        c1.display();
    }
}