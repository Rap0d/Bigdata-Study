package Jv_190816_01;

public class CalculArea {
    public static void main(String[] args) {
        double radius;
        double area;
        double height;
        double weight;
        double weight2;

        radius = 10.3;
        area = Circle(radius);

        System.out.println("Circle Area : " + area);

        height = 4.33;
        weight = 5.22;
        area = Triangle(height, weight);

        System.out.println("Triangle Area : " + area);

        height = 40;
        weight = 10;
        weight2 = 20;

        System.out.println("Square : " + Square(height, weight, weight2));
    }

    private static double Circle(double ra) {
        double PI = 3.141592;
        double area = ra * ra * PI;
        return area;
    }

    private static double Triangle(double hig, double wei) {
        double height = hig;
        double weight = wei;
        double area = (height * weight) / 2;
        return area;
    }

    private static int Square(double hig, double w1, double w2) {
        return (int)((w1 + w2) * hig / 2);
    }
}
