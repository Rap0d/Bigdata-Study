package Jv_190905_15;

class A03_MathEx {
    public static void main(String[] args) {
        int a = -100;

        double b = 10.2;

        System.out.println(a + " => abs : " + Math.abs(a));

        System.out.println(b + " => ceil : " + Math.ceil(b));

        System.out.println(b + " => floor : " + Math.floor(b));

        System.out.println("반올림하기(3.2) : " + Math.round(3.2));

        System.out.println("반올림하기(3.7) : " + Math.round(3.7));

        System.out.println("16의 제곱근은? " + Math.sqrt(16));

        System.out.println("4와 7 중 큰 수는? " + Math.max(4, 7));

        System.out.println("4와 7 중 작은 수는? " + Math.min(4, 7));

        System.out.println("min(|a|,b) = " + Math.min(Math.abs(a), b));

        // rint : 가장 가까운 정수
        System.out.println("10.5 => rint : " + Math.rint(10.5));

        System.out.println("10.7 => rint : " + Math.rint(10.7));

        System.out.println(b + " => rint : " + Math.rint(b));

        System.out.println("2의 3승은 " + Math.pow(2, 3));

        System.out.println("오일러 상수 : " + Math.E);// 오일러 상수

        System.out.println("파이 : " + Math.PI);// 3.14 파이 상수

        // 삼각 함수 : 라디안(radian)
        System.out.println("sin(pi) = " + Math.sin(Math.PI));

        System.out.println("cos(pi) = " + Math.cos(Math.PI));

        System.out.println("tan(pi) = " + Math.tan(Math.PI));

        // 랜덤 값은 0 ~ 0.99999999 사이의 값을 출력한다. 0 <= 값 < 1

        // 0 <= 값 < 1
        // 0 <= 5 * 값 < 5
        // 4 <= 5 * Math.random() + 4 < 9

        // 4 <= 어떤값 < 9

        System.out.println(Math.random());

        System.out.println(Math.random());

        System.out.println(Math.random());

        for (int i = 0; i <= 45; i += 5) { // 삼각 함수 출력하기

            System.out.println("Sin" + i + " = " + Math.sin(i * Math.PI / 180));

            System.out.println("Cos" + i + " = " + Math.cos(i * Math.PI / 180));
        }
    }
}
