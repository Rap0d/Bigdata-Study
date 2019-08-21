package Jv_190821_04;

public class WhileEx {
	public static void main(String[] args) {
		Ex1();
	}

	private static void Ex1() {
		int total = 0;
		int i = 1 ;
		
		while (i > 10) {
			total += i;
			i++;
		}

		System.out.println("total : " + total);
	}
}
