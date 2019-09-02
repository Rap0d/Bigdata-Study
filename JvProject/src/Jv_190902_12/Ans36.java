package Jv_190902_12;

public class Ans36 {
    public static void main(String[] args) {
        System.out.println("대표 이사 이름 : " + Employee.ceoname);

        System.out.println();

        Employee hong = new Employee("홍길동", 10000, "영업"); // 이름, 급여, 부서명
        hong.Display();

        System.out.println();

        Employee soo = new Employee("김철수", "광고");
        soo.Display();
    }
}

class Employee extends Salary {
    static String ceoname = "강감찬";

    public Employee(String name, int salary, String department) {
        super(name, salary, department);
    }

    public Employee(String name, String department) {
        super(name, department);
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("부서명 : " + getDepartment());
    }
}

class Salary {
    private String name;
    private int salary;
    private int money;
    private String department;
    
    public Salary(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        Calc(department);
    }

    public Salary(String name, String department) {
        this.name = name;
        this.department = department;
        this.salary = 3000;
        Calc(department);
    }

    private void Calc(String department) {
        if(department.equals("판매") || department.equals("영업")) {
            this.money = this.salary * 12;
        } else {
            this.money = this.salary * 10;
        }
    }

    void Display() {
        System.out.print("이름 : " + name + ", 급여 : " + salary + ", 연봉 : " + money + "\n");
    }

    public String getDepartment() {
        return this.department;
    }
}