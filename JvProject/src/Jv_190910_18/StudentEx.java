package Jv_190910_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * StudentEx
 */
public class StudentEx {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<Student>();
        st.add(new Student("김철수", 1, 3, 30, 40, 50));
        st.add(new Student("박영희", 2, 4, 70, 80, 90));
        st.add(new Student("홍길동", 3, 5, 40, 50, 60));

        display(st);
    }

    private static void display(List<Student> st) {
        System.out.println("이름\t학년\t반\t국어\t영어\t수학\t총점\t평균");
        Iterator<Student> it = st.iterator();
        while (it.hasNext()) {
            Student stt = new Student();
            String name;
            int grade, cl;
            int sub[] = new int[3];
            int total = 0;
            double avg = 0.0;

            stt = it.next();
            name = stt.getName();
            grade = stt.getGrade();
            cl = stt.getCl();
            sub = stt.getSubj();

            for (int i = 0; i < sub.length; i++) total += sub[i];
            avg = ((double) total) / sub.length;

            System.out.println(name + "\t" + grade + "\t" + cl + "\t" + sub[0] + "\t" + sub[1] + "\t" + sub[2] + "\t"
                    + total + "\t" + avg);
        }
    }
}

class Student {
    private String name;
    private int grade;
    private int cl;
    private int[] subj = new int[3];

    public Student(String name, int grade, int cl, int kor, int eng, int math) {
        this.name = name;       this.grade = grade;
        this.cl = cl;           this.subj[0] = kor;
        this.subj[1] = eng;     this.subj[2] = math;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }

    public int[] getSubj() {
        return subj;
    }

    public void setSubj(int[] subj) {
        this.subj = subj;
    }
}