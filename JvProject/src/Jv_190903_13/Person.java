package Jv_190903_13;

/**
 * Person
 */
public class Person {
    private String name;
    private int age;
    private String addr;
    private String pnum;
    private int ty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }

    public Person() {
    }

    public Person(String name, int age, String addr, String pnum, int ty) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.pnum = pnum;
        this.ty = ty;
    }

    private void chkTy(Person p) {
       
    }

    public void display() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("전화 번호 : " + pnum);
        System.out.println("타입 : " + ty);
    }
}