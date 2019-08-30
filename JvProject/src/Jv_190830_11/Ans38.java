package Jv_190830_11;

/**
 * Ans38
 */
public class Ans38 {

    public static void main(String[] args) {
        Sales[] myBook = new Sales[2];
        Book.discount = 0.15;

        for (int i = 0; i < myBook.length; i++) {
            myBook[i] = new Sales();
        }
        System.out.println("총 판매 권수 : " + Book.totalcnt);
        for (int i = 0; i < myBook.length; i++) {
            System.out.println(i + "번째 품목");
            myBook[i].display();
        }
    }
}