package Jv_190906_16;

import java.util.Arrays;
import java.util.List;

/**
 * ArraysEx
 */
public class ArraysEx {
    public static void main(String[] args) {
        arrayEx01();
    }

    private static void arrayEx01() {
        String[] arr1 = new String[3];
        // 모든 배열 요소를 "제시카"로 채우시오.
        Arrays.fill(arr1, "제시카");
        printArryy(arr1);
        // 1번째부터 2번째 요소를 "티파니"로 채우시오.
        Arrays.fill(arr1, 1, 3, "티파니");
        printArryy(arr1);
        // 2번째 요소만 "써니"로 채우시오.
        Arrays.fill(arr1, 2, 3, "써니");
        printArryy(arr1);

        String[] arr2 = { "제시카", "티파니", "써니" };
        String[] arr3 = { "제시카", "티파니", "써니", "효연" };

        // equals 메소드를 사용하여 배열의 요소, 길이, 내용이 모두 같으면 true 출력, 아니면 false.
        // arr1 배열과 arr2 배열이 동일한가요?
        System.out.println((Arrays.equals(arr1, arr2)));
        // arr1 배열과 arr3 배열이 동일한가요?
        System.out.println((Arrays.equals(arr1, arr3)));

        // arr3 배열이 써니 요소가 들어 있는 지 확인
        int idx = Arrays.binarySearch(arr3, "써니");

        System.out.println("써니의 인덱스 : " + idx);

        String[] arr4 = { "김", "이", "최" };
        List<String> lists = Arrays.asList(arr4);
        for (String str : lists) {
            System.out.print(str + "씨  ");
        }

        System.out.println();
        String[] arr5 = { "김철수", "박영희", "강감찬", "을지문덕", "심수봉" };
        for (int i = 1; i <= 10; i++) {
            // arr5 배열을 복사하여 arr6 배열을 생성한다.
            // arr6 배열은 요소 갯수가 i개이다.
            String[] arr6 = Arrays.copyOf(arr5, i);
            printArryy(arr6);
        }
        // copyOfRange : arr5 배열의 1번째 부터 3번째까지만 복사하여 arr7 배열 생성
        String[] arr7 = Arrays.copyOfRange(arr5, 1, 4);
        printArryy(arr7);
    }

    private static void printArryy(String[] array) {
        // 배열 요소 출력하기 메소드
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}