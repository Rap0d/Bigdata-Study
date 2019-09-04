package Jv_190904_14;

import java.io.FileInputStream;

/**
 * FileInputStreamEx
 */
public class FileInputStreamEx {

    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("/Users/seungheonchang/Desktop/file_test.txt");
            // 파일과 연결된 바이트 스트림을 생성
            byte [] sentence = new byte [100];
            // 바이트 스트림을 담을 byte형 배열 생성

            String str = "";
            int c = 0;

            while((c = in.read(sentence)) != -1) {  // read()는 파일의 끝을 만나면 -1 리턴
                str += new String(sentence, "UTF-8");    // 바이트 c를 문자로 변환하여 출력
            }

            System.out.println("data1 : " + str);
            
            in.close(); // 스트림을 닫는다. 더 이상 스트림으로부터 읽을 수 없다.
        } catch (Exception e) {
            System.out.println("입출력 오류");
        }
    }
}