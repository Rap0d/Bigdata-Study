package Jv_190904_14;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FileInputStreamEx
 */
public class FileInputStreamEx {
    private static final String filePath = "/Users/seungheonchang/Desktop/file_test";

    public static void main(String[] args) {
        // fiseEx();
        fosEx();

    }

    private static void fosEx() {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);

            int num[] = { 1, 4, -1, 88, 50, 65 };
            byte b[] = { 7, 51, 3, 4, 1, 24 };
            byte[] bytes = {0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77};

            for (int i = 0; i < num.length; i++) {
                fos.write(num[i]);
            }
            fos.write(b); // 파일에 바이트 배열 b의 내용을 모두 그대로 기록한다.
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            System.out.println("입력 에러");
            e.printStackTrace();
        }
    }

    private static void fisEx() {
        FileInputStream in = null;
        try {
            in = new FileInputStream(filePath);
            // 파일과 연결된 바이트 스트림을 생성
            byte[] sentence = new byte[100];
            // 바이트 스트림을 담을 byte형 배열 생성

            String str = "";
            int c = 0;

            while ((c = in.read(sentence)) != -1) { // read()는 파일의 끝을 만나면 -1 리턴
                str += new String(sentence, "UTF-8"); // 바이트 c를 문자로 변환하여 출력
            }

            System.out.println("data1 : " + str);

            in.close(); // 스트림을 닫는다. 더 이상 스트림으로부터 읽을 수 없다.
        } catch (Exception e) {
            System.out.println("입출력 오류");
        }
    }
}