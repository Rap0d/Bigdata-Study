package Jv_190821_04;

public class WhileEx {
	public static void main(String[] args) {
		Ex1();
		Ex2(100);
		gugu(9);
	}

	private static void gugu(int dan) {
		int i = 1, j = 1;
		while (j <= dan) {
			i = 1;
			while (i <= 9) {
				System.out.println(j + " x " + i + " = " + (j * i));
				i++;
			}
			System.out.println();
			j++;
		}
	}

	private static void Ex2(int max) {
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;

		int i = 1;
		while (i <= max) {
			total1 += i;
			i += 3;
		}
		System.out.println("total1 : " + total1);

		i = 3;
		while (i <= max) {
			total2 += (max - i);
			i += 5;
		}
		System.out.println("total2 : " + total2);

		i = 1;
		while (i <= max) {
			total3 += (i * i);
			i += 5;
		}
		System.out.println("total3 : " + total3);
	}

	private static void Ex1() {
		int total = 0;
		int i = 1;

		while (i <= 10) {
			total += i;
			i++;
		}

		System.out.println("total : " + total);
	}
}
