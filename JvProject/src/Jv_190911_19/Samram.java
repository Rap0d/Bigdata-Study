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
            
            while ((c = isr.read()) != -1) {
                // System.out.print((char) c);
                str += (char)c;
            }
            System.out.println(str);
            
            System.out.println();
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