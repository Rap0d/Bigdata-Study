package Jv_190910_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Candidate
 */
class Candidate {
    private int no;
    private String name;
    private String dang;
    private double rate;

    public Candidate(int no, String name, String dang, double rate) {
        this.no = no;
        this.name = name;
        this.dang = dang;
        this.rate = rate;
    }

    public Candidate() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDang() {
        return dang;
    }

    public void setDang(String dang) {
        this.dang = dang;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return no + " " + name + "\t" + dang + "\t" + rate;
    }
}

/**
 * Dosi
 */
public class CandidateEx {
    public static void main(String[] args) {
        candi();
    }

    private static void candi() {
        List<Candidate> al = new ArrayList<Candidate>();
        Candidate[] cd = { 
            new Candidate(1, "문재인", "파란당", 0.4), 
            new Candidate(2, "홍준표", "빨간당", 0.3),
            new Candidate(3, "안철수", "초록당", 0.2), 
            new Candidate(4, "유승민", "하늘당", 0.07),
            new Candidate(5, "심상정", "노란당", 0.03)
        };

        for (int i = 0; i < cd.length; i++) {
            al.add(cd[i]);
        }

        display(al);
    }

    private static void display(List<Candidate> al) {
        System.out.println("확장 for 구문으로 출력하기");

        for (Candidate cd : al) {
            int no = cd.getNo();
            String name = cd.getName();
            String dang = cd.getDang();
            double rate = cd.getRate();

            String tmp = no + " " + name + "\t" + dang + "\t" + rate;
            System.out.println(tmp);
        }

        Iterator<Candidate> it = al.iterator();
        
        while(it.hasNext()) {
            int no = it.next().getNo();
            String name = it.next().getName();
            String dang = it.next().getDang();
            double rate = it.next().getRate();

            String tmp = no + " " + name + "\t" + dang + "\t" + rate;
            System.out.println(tmp);
        }
    }
}