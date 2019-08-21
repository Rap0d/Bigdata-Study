package Jv_190821_04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		// Ex1();
		// Ex2(100);
		// gugu(9);
		// Ex3(10);
		// Ex4();
		// Ex5();
		// Ex6();
		// Ex7();
		Ex8();
	}

	private static void Ex8() {
		int[] a = new int[3] ;        
        for (int i  = 0; i  < a.length; i ++) {
            a[i] = 10 * ( i + 1 ) ;
            System.out.print( a[i] + "\t" );            
        }
        System.out.println();
        
        int[] b = new int[98/5+1] ;        
        for (int i  = 0; i  < b.length; i ++) {
            b[i] = 5 * i + 3 ;
            System.out.print( b[i] + "\t" );            
        }
        System.out.println();
        
        int[] c = new int[92/10+1] ;        
        for (int i  = 0; i  < c.length; i ++) {
            c[i] = 92 - 10 *  i ;
            System.out.print( c[i] + "\t" );            
        }
	}

	private static void Ex7() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i < 6; i++) {
			for (int j = 10; j > 5; j--) {
				System.out.print(j - i);
			}
			System.out.println();
		}
	}

	private static void Ex6() {
		int total = 0;

		for (int i = 1; i < 3; i++) {
			for (int j = 5; j < 8; j++) {
				total += j + i;
			}
		}
		System.out.println("total : " + total);
	}

	private static void Ex5() {
		Scanner sc = new Scanner(System.in);
		int limit = 100, cnt = 0, tmp = 0;
		int ran = new Random().nextInt(limit) + 1;
		tmp = limit / 2;
		while (true) {
			// System.out.print("정답은 ? ");
			// int ans = sc.nextInt();
			
			// if(ans == ran) {
			// 	System.out.println("정답입니다!");
			// 	break;
			// } else if (ans > ran) {
			// 	System.out.println("그거보단 작아요");
			// } else {
			// 	System.out.println("그거보단 커요");
			// }
			
			cnt += 1;

			if (ran == tmp) {
				System.out.println(cnt + "번 째 만에 성공");
				break;
			} else if (tmp > ran) {
				tmp = tmp / 2;
				System.out.println(cnt + "번 째 실패");
			} else if (tmp < ran) {
				tmp = tmp + (tmp / 2);
				System.out.println(cnt + "번 째 실패");
			}
		}
		sc.close();
	}

	private static void Ex4() {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (true) {
			System.out.print("자연수를 입력하세요 : ");
			int x1 = sc.nextInt();

			if (x1 == 0) {
				System.out.println("종료합니다.");
				break;
			}

			cnt += 1;

			System.out.println(cnt + "번째 입력한 자연수는 : " + x1);
		}
		sc.close();
	}

	private static void Ex3(int max) {
		int total1 = 0;
		int total2 = 0;
		int i = 1;

		while (i <= max) {
			if (i % 2 == 0)
				total1 += i;
			else
				total2 += i;
			i++;
		}

		System.out.println("짝수의 합 : " + total1 + ", 홀수의 합 : " + total2);
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
