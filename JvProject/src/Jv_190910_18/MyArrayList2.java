package Jv_190910_18;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
    public Person() {
    }

    private String name;
    private int kor;
    private int eng;
    private int math;

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return name + "\t" + kor + "\t" + eng + "\t" + math;
    }
}

public class MyArrayList2 {
    public static void main(String[] args) {
        ArrayList<Person> lists = new ArrayList<Person>();

        Person kim = new Person("김철수", 30, 40, 50);
        Person lee = new Person("박영희", 70, 80, 90);

        lists.add(kim);
        lists.add(lee);

        PrintList(lists); // 데이터 리스트 출력
        PrintFor(lists); // 이름과 총점 및 평균 출력
    }

    private static void PrintList(ArrayList<Person> abcd) {
        System.out.println();
        System.out.println("데이터 리스트 출력");
        System.out.println("이름\t국어\t영어\t수학");

        for (Person person : abcd) {
            System.out.println(person);
        }
    }

    private static void PrintFor(ArrayList<Person> asdf) {
        System.out.println();
        System.out.println("이름과 총점 및 평균 출력");
        // 요구 사항대로 출력하세요.
        Iterator<Person> it = asdf.iterator();
        while (it.hasNext()) {
            Person p = new Person();
            p = it.next();
            System.out.println(p.getName() + "의 총점 : " + (p.getKor() + p.getEng() + p.getMath()) + ", 평균 : "
                    + (((double)p.getKor() + (double)p.getEng() + (double)p.getMath()) / 3));
        }
    }

}
