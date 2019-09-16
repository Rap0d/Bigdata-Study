package Jv_190916_20;

import java.io.*;

/**
 * FindKang
 */
public class FindKang {

    public static void main(String[] args) {
        File file = new File("/Users/seungheonchang/Desktop/news.txt");

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr, 20);

            String str = "";
            int cnt = 0;
            int cntLine = 0;
            while ((str = br.readLine()) != null) {
                if(str.contains("강호동")) {
                    cnt++;
                }
                cntLine++;
            }
            System.out.println("Count : " + cnt + ", Total Line : " + cntLine);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}