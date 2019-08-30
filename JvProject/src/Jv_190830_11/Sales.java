package Jv_190830_11;

/**
 * Sales
 */
public class Sales extends Book {
    private double amount = 0;

    public void display() {
        System.out.print(super.getArticle() + " : ");
        System.out.println(amount + "원");
    }

    public Sales() {
        super();
        this.amount = super.getCost() * super.getQty() * (1 - Book.discount);
    }
}