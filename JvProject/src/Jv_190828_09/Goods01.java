package Jv_190828_09;

/**
 * Goods01
 */
public class Goods01 {
    private String name = "";
    private int price = 0;
    private int stack = 0;
    private int sold = 0;
    private int soldPrice = 0;
    public static int allSold = 0;

    public Goods01(String name, int price, int stack, int sold) {
        super();
        this.name = name;
        this.price = price;
        this.stack = stack;
        this.sold = sold;
    }

	void allSold() {
        allSold += sold;
        System.out.println("전체 판매 개수 : " + allSold);
    }

    void display() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("재고 : " + stack);
        System.out.println("판매 : " + sold);
        System.out.println("판매 금액 : " + (sold * price));
        System.out.println();
    }

    public int getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(int soldPrice) {
        this.soldPrice = soldPrice;
    }

    public int getAllSold() {
        return allSold;
    }

    int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}