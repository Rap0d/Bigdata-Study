package Jv_190904_14;

/**
 * VideoPlayer
 */
public class VideoPlayer implements Skinnable01, Player01 {
    private String vid;

    public VideoPlayer() {
    }

    public VideoPlayer(String vid) {
        this.vid = vid;
    }

    @Override
    public void changeSkin(int skin) {
        switch (skin) {
        case 0:
            System.out.println("검은색으로 변경");
            break;
        case 1:
            System.out.println("노란색으로 변경");
            break;
        case 2:
            System.out.println("파란색으로 변경");
            break;
        default:
            break;
        }
    }

    @Override
    public void play() {
        System.out.println(this.vid + "비디오를 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println(this.vid + "비디오를 중지합니다.");
    }

    @Override
    public void fast() {

    }

    @Override
    public void reverse() {

    }

}