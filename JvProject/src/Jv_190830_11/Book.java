package Jv_190830_11;

import java.util.Scanner;

/**
 * Book
 */
public class Book {
    private String article;
    private int qty;
    private int cost;
    static int totalcnt = 0;
    static double discount = 0.0;
    static int count = 0;

    public Book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("품목 : ");
        article = sc.nextLine();
        System.out.print("수량 : ");
        qty = sc.nextInt();
        System.out.print("단가 : ");
        cost = sc.nextInt();

        totalcnt += qty;
        count++;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}