package Jv_190828_09;

import java.util.Scanner;

/**
 * GoodsMain01
 */
public class GoodsMain01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods01[] arr = new Goods01[2];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("상품 이름 : ");
            String name = sc.next();

            System.out.println("상품 가격 : ");
            int price = sc.nextInt();

            System.out.println("상품 재고 : ");
            int stack = sc.nextInt();

            System.out.println("상품 판매 : ");
            int sold = sc.nextInt();

            arr[i] = new Goods01(name, price, stack, sold);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
            Goods01.allSold += arr[i].getSold();
        }
        System.out.println("total : " + Goods01.allSold);
        sc.close();
    }
}