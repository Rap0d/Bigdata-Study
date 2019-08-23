package Jv_190823_06;

public class ArrayEx {
	public static void main(String[] args) {
		ex01();
		ex02();
	}

	private static void ex02() {
		
	}

	private static void ex01() {
		int[] arr = {10, 20, 30};
		
		int result = arrsum(arr);
		System.out.println("RES : " + result);
		
		Ex07 e7 = new Ex07();
		System.out.println(e7.signOf(-12));
	}

	private static int arrsum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}

class Ex07 {
	public int signOf(int a) {
		int res;
		if(a < 0) {
			res = -1;
		} else if (a > 0) {
			res = 1;
		} else {
			res = 0;
		}
		return res;
	}
}