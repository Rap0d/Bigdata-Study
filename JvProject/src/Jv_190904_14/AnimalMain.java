package Jv_190904_14;

/**
 * AnimalMain
 */
public class AnimalMain {

    public static void main(String[] args) {
        Animal[] an = new Animal[3];
        an[0] = new Lion("사자", "아프리카 초원");
        an[1] = new Eagle("독수리", "하늘");
        an[2] = new Goldfish("금붕어", "어항");
        
        for (int i = 0; i < an.length; i++) {
            an[i].move();
        }
    }
}