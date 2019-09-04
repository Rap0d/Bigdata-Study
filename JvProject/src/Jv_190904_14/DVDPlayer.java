package Jv_190904_14;

/**
 * DVDPlayer
 */
public class DVDPlayer implements ExtPlayer01 {
    private String dvd;

    public DVDPlayer() {
    }

    public DVDPlayer(String dvd) {
        this.dvd = dvd;
    }

    @Override
    public void play() {
        System.out.println("DVD " + this.dvd + "을(를) 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("DVD " + this.dvd + "을(를) 중지합니다.");
    }

    @Override
    public void fast() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public void slow() {
        System.out.println("DVD " + this.dvd + "을(를) 천천히 재생합니다.");
    }

}