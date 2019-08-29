package Jv_190829_10;

public class Human {
    private String name ; 
    private int age = 30 ;
    
    public Human(String name) {
        this.name = name ;
    }
    public Human(String name, int age) {
        this.name = name ;
        this.age = age ;
    }
    
    public void Display() {
        System.out.println("이름 : " + this.name );
        System.out.println("나이 : " + this.age );
    }    
}
