package Jv_190822_05;

public class Swap {
    public static void main(String[] args) {
        int x = 3, y = 4, temp;

        // swap 기법을 적용한다.
        temp = x;
        x = y;
        y = temp;

        System.out.println("swap 된 결과");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println();

        x = 3;
        y = 4;
        int z = 5;

        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("swap 된 결과");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
        System.out.println();

        int[] arr = { 1, 2, 3, 4 };

        // cnt는 스왑이 이루어지는 횟수를 의미한다.
        int cnt = arr.length / 2;

        // 배열 요소를 swap 시킨다.
        for (int i = 0; i < cnt; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        System.out.println("배열 요소 역순 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
