package Jv_190916_20;

import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {
        String pathname = "../testfile.txt"; // 새롭게 작성될 파일 이름
        File target = new File(pathname);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(target);
            bw = new BufferedWriter(fw);

            // 여기서 파일에 기록하고
            bw.write("제시카,60.0,70.0,80.0,F");
            bw.newLine(); // 엔터 키를 누르는 효과
            bw.write("홍길동,50.0,70.0,100.0,M");
            bw.newLine();
            bw.write("유재석,60.0,70.0,80.0,M");
            bw.newLine();
            bw.write("티파니,40.0,80.0,50.0,F");
            bw.newLine();

            System.out.println("파일 기록 완료");

        } catch (IOException e) {
            System.out.println("입출력 오류 발생");
            e.printStackTrace();

        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
