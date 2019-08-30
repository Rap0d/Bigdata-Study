package Jv_190830_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("품목 : ");
            article = in.readLine();
            System.out.print("수량 : ");
            qty = Integer.parseInt(in.readLine());
            System.out.print("단가 : ");
            cost = Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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