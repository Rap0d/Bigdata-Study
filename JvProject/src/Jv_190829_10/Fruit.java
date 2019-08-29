package Jv_190829_10;

/**
 * Fruit
 */
public class Fruit {

    private String name;
    private int qty;
    private int price;
    private int amount;
    private int tmp;

    static int total;
    static int minTo;

    void display() {
        this.amount = this.qty * this.price;

        if (this.name.equals("사과") && this.amount >= 10000) {
            tmp = this.amount;
            this.amount = (int) ((1 - 0.05) * this.amount);
        } else if (this.name.equals("바나나")) {
            if (this.amount >= 10000) {
                tmp = this.amount;
                this.amount = (int) ((1 - 0.08) * this.amount);
            } else {
                tmp = this.amount;
                this.amount = (int) ((1 - 0.03) * this.amount);
            }
        }
        Fruit.total += this.amount;
        Fruit.minTo += tmp;

        System.out.println("품목 : " + this.name);
        System.out.println("수량 : " + this.qty);
        System.out.println("단가 : " + this.price);
        System.out.println("금액 : " + this.amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}