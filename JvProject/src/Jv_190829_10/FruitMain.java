package Jv_190829_10;

import java.util.Scanner;

/**
 * FruitMain
 */
public class FruitMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Fruit[] fruit = new Fruit[2]; // 배열 정의

        for (int i = 0; i < fruit.length; i++) {
            fruit[i] = new Fruit(); // 객체 생성

            System.out.println("과일 정보 입력");

            System.out.println("품목 입력");
            String name = scan.next();
            fruit[i].setName(name);

            System.out.println("수량 입력");
            fruit[i].setQty(scan.nextInt());

            System.out.println("단가 입력");
            fruit[i].setPrice(scan.nextInt());

            fruit[i].display();

        }
        System.out.println("총금액 : " + Fruit.total);
        System.out.println("할인된 금액 : " + Fruit.minTo);
        scan.close();
    }
}
