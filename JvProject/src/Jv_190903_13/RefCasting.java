package Jv_190903_13;

public class RefCasting {
    public static void main(String[] args) {
        String str = new String("대한민국");
        Integer x = new Integer(5);
        Book java = new Book("자바 P/G", 10000, "itBank");

        Display(str);
        Display(x);
        Display(java);
    }

    private static void Display(Object obj) {
        if (obj instanceof Integer) {
            Integer X = (Integer) obj;
            // Integer 클래스는 Object.toString() 메소드를 오버라이딩하여 구현해 놓았다.
            System.out.println(X.toString());

            int x = X.intValue();
            System.out.println(x);

            int y = 100;
            Integer Y = new Integer(y);
            System.out.println(Y.toString());

        } else if (obj instanceof String) {
            String mystr = (String) obj;
            // String 클래스는 Object.toString() 메소드를 오버라이딩하여 구현해 놓았다.
            System.out.println(mystr.toString());

        } else if (obj instanceof Book) {
            // Object obj = new Book("자바", 10000); ;
            String name = ((Book) obj).getName();
            System.out.println(name);

            double price = ((Book) obj).getPrice();
            System.out.println(price);

            String education = ((Book) obj).getEducation();
            System.out.println(education);

            Book myjava = (Book) obj;
            // Book 클래스의 toString() 메소드를 구현하라
            System.out.println(myjava);
        }
    }
}
