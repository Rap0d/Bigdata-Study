package Jv_190829_10;

public class Atest {
    public static void main(String[] args) {
        // String str = "JAVA";
        // System.out.println(str.equals("Java"));
        // System.out.println(str.equals("JAVA"));
        // System.out.println(str.equalsIgnoreCase("java"));
        Education hong = new Education("홍길동", "JAVA", 10000.0, 1.0);
        hong.Display();
        Education kim = new Education("김철수 ", "JSP", 20000.0, 0.7);
        kim.Display();
    }
}
