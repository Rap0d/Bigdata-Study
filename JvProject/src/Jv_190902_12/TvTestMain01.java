package Jv_190902_12;

/**
 * TvTestMain01
 */
public class TvTestMain01 {

    public static void main(String[] args) {
        CaptionTv tv1 = new CaptionTv();
        tv1.Display(); // 결과 출력

        System.out.println();

        CaptionTv tv2 = new CaptionTv("빨강", "호호호"); // 색상, 캡션
        tv2.setVolume(10); // 볼륨을 10으로 설정
        tv2.volumeDown(2); // 볼륨을 2줄임 : 10 - 2 = 8으로 설정된다.
        tv2.volumeUp(5); // 볼륨을 5늘림 : 8 + 5 = 13 으로 설정된다.
        tv2.Display(); // 결과 출력

        System.out.println();

        CaptionTv tv3 = new CaptionTv("파랑", "가나다", 8, 7); // 색상, 캡션, 볼륨, 채널
        tv3.volumeDown(4); // 볼륨을 4줄인다.
        tv3.channelUp(2); // 채널을 +2시킨다.
        tv3.Display(); // 결과 출력
    }
}