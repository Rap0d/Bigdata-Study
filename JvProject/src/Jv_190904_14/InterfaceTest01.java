package Jv_190904_14;

/**
 * InterfaceTest01
 */
public class InterfaceTest01 {

    public static void main(String[] args) {
        Player01[] player = new Player01[3];

        // 인터페이스에 의한 승급
        player[0] = new VideoPlayer("친구2");
        player[1] = new Mp3Player("사랑");
        player[2] = new DVDPlayer("번지 점프");

        for (int i = 0; i < player.length; i++) {
            System.out.println("---------------------------------------");
            player[i].play();
            player[i].stop();

            if (player[i] instanceof VideoPlayer) {
                // 비디오는 스킨 색상 변경이 가능하다.
                VideoPlayer myvideo = (VideoPlayer) player[i];
                myvideo.changeSkin(1);

            } else if (player[i] instanceof DVDPlayer) {
                // dvd는 천천히 감기 기능이 존재한다.
                DVDPlayer mydvd = (DVDPlayer) player[i];
                mydvd.slow();
            }
        }
    }
}