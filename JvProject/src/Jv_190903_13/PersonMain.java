package Jv_190903_13;

/**
 * PersonMain
 */
public class PersonMain {

    public static void main(String[] args) {
        Person[] p = {
            new Student(    "김철수",   30, "마포 공덕동",  "01012345678",    3,  2,  "A"),
            new Teacher(    "박영희",   40, "용산 도원동",  "01033334444",    2,  "Java"),
            new Staff(      "최직원",   50, "강남 역삼동",  "01055557667",    1,  "총무")
        };
        
        for (int i = 0; i < p.length; i++) {
            System.out.println();
            System.out.println(p[i]);
        }

    }
}