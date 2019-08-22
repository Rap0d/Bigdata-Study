package Jv_190822_05;

import java.util.Random;

public class Ds01 {
	public static void main(String[] args) {
		sort01(100);
		sort02(100);
	}

	private static void sort02(int max) {
		int ran = randInt(max);
		int cnt = 0;
		int pnt = max / 2;
		int tmp = max;

		System.out.println("find " + ran + " start ->");
		while (true) {
			cnt += 1;
			if (isValid(ran, pnt)) {
				System.out.println(cnt + "번 만에 검색완료, ran : " + ran + ", point : " + pnt);
				break;
			} else if (ran > pnt) {
				System.out.println(pnt + "보다 큽니다.");
				pnt = tmp - (pnt / 2);
			} else if (ran < pnt) {
				System.out.println(pnt + "보다 작습니다.");
				pnt = (pnt / 2) + 1;
			}
		}
	}

	private static void sort01(int max) {
		int ran = randInt(max);
		int cnt = 0;
		// int pnt = max / 2;
		int pnt = 1;

		System.out.println("find " + ran + " start ->");
		while (true) {

			cnt += 1;
			if (isValid(ran, pnt)) {
				System.out.println(cnt + "번 만에 검색완료, ran : " + ran + ", point : " + pnt);

				break;
			} else {
				System.out.println(pnt + "는 아니네요.");
				pnt += 1;
				if (isValid(ran, pnt)) {
					System.out.println(cnt + "번 만에 검색완료, ran : " + ran + ", point : " + pnt);

					break;
				}
			}
		}
	}

	private static int randInt(int max) {
		return new Random().nextInt(max) + 1;
	}

	private static boolean isValid(int ran, int pnt) {
		boolean isPass = false;

		if (ran == pnt) {
			isPass = true;
		} else
			isPass = false;
		return isPass;
	}
}
