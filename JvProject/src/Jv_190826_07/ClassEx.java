package Jv_190826_07;

/**
 * ClassEx
 */
public class ClassEx {

    public static void main(String[] args) {
        Acc1();
        Acc2();
    }

    private static void Acc2() {
        Acc2[] account;
        account = new Acc2[2];
        
        Acc2[] xx = 
            {
                    new Acc2(),
                    new Acc2()
            };
        
        for (int i = 0; i < account.length; i++) {
            account[i] = new Acc2();
        }
 
        account[0].bank = "KB";
        account[0].name = "김철수";
        account[0].account = 1234;
        account[0].money = 1000;
 
        account[1].bank = "SH";
        account[1].name = "박영희";
        account[1].account = 5678;
        account[1].money = 2000;
 
        for (int i = 0; i < account.length; i++) {
            account[i].display();
        }
    }

    private static void Acc1() {
        Acc2 soo = new Acc2();
        Acc2 hee = new Acc2();
        
        soo.bank = "KB";
        soo.name = "김영수";
        soo.account = 10829083;
        soo.money = 124141231;

        soo.display();

        hee.bank = "SH";
        hee.name = "최영희";
        hee.account = 980238459;
        hee.money = 1827938789;

        hee.display();
    }

}

/**
 * InnerClassEx
 */
class Acc2 {
    String bank = "";
    String name = "";
    int account = 0;
    int money = 0;

    public void display() {
        System.out.println("은행 : " + bank);
        System.out.println("이름 : " + name);
        System.out.println("계좌 : " + account);
        System.out.println("잔액 : " + money);
    }
}