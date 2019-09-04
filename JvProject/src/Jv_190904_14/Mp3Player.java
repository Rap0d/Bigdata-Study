package Jv_190904_14;

/**
 * Mp3Player
 */
public class Mp3Player implements Player01 {
    private String song;

    public Mp3Player() {
    }

    public Mp3Player(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("노래 " + this.song + "을(를) 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("노래 " + this.song + "을(를) 중지합니다.");
    }

    @Override
    public void fast() {

    }

    @Override
    public void reverse() {

    }

}