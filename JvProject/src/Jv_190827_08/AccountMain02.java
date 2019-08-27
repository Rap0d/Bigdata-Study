package Jv_190827_08;

public class AccountMain02 {
	public static void main(String[] args) {
		Account02 a1 = new Account02("SB", "이영희", 53245, 198237);
		Account02 a2 = new Account02("KB", "김철수", 13123, 0);
		Account02 a3 = new Account02("김유신", 10);
		
		a2.display();
		a2.Deposit(10000);
		a2.Deposit(15000);
		System.out.println(a2.getBalance());
		a2.WithDraw(20000);

		a2.setName("박영희");
		a2.setNo(53432);

		a2.setName("김영수");
		a2.setNo(51235123);
		a2.setBankname("신한은행");
		System.out.println(a2.getName());
		a2.display();

		a1.display();

		a3.display();
	}
}
