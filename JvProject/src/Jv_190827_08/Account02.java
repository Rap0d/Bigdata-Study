package Jv_190827_08;

public class Account02 {
	private String bankname;
	private String name;
	private int no;
	private int balance;

	Account02() {
	}

	Account02(String bankname, String name, int no, int balance) {
		this.bankname = bankname;
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	Account02(String name, int no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		this.balance = money;
	}

	public void Deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금되어 잔액은 " + balance + "원입니다.\n");
	}

	public void WithDraw(int money) {
		balance -= money;
		System.out.println(money + "원 출금되어 잔액은 " + balance + "원입니다.\n");
	}

	void display() {
		System.out.println("은행 : " + bankname);
        System.out.println("이름 : " + name);
        System.out.println("계좌 : " + no);
		System.out.println("잔액 : " + balance);
		System.out.println();
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
