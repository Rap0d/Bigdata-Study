package Jv_190911_19;

import java.io.*;

/**
 * Samram
 */
public class Samram {

    public static void main(String[] args) {
        InputStream in = null;
        InputStreamReader isr = null;

        try {
            in = new FileInputStream("/Users/seungheonchang/Desktop/findId.txt");
            isr = new InputStreamReader(in);

            int c;
            String str = null;
            String tmp = "";
            int si = 0, ei = 0;

            while ((c = isr.read()) != -1) {
                // System.out.print((char) c);
                str += (char) c;

            }
            
            si = str.indexOf("(");
            ei = str.indexOf(")");
            if (str.equals("\\n"))
                tmp = "";
            for (int i = si; i <= ei; i++) {
                tmp += str.charAt(i);
            }

            System.out.println();
            System.out.println("tmp : " + tmp);
            System.out.println("==============================================");
            System.out.println("FILE FINISHED");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}