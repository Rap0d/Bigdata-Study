package Jv_190916_20;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedIOEx
 */
public class BufferedIOEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        // 콘솔과 연결된 입력 문자 스트림 생성
        BufferedOutputStream out = new BufferedOutputStream(System.out, 5);

        try {
            int c;
            while ((c = in.read()) != -1) {
                // ctrl-z가 입력될 때까지 반복
                out.write(c);
                // 실제 버퍼가 다 찰 때만 문자가 화면으로 출력
            }
        } catch (Exception e) {
            System.out.println("IO Exception");
        } finally {
            try {
                out.flush();
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}