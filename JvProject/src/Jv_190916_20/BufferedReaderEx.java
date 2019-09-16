package Jv_190916_20;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * BufferedReaderEx
 */
public class BufferedReaderEx {

    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.print("밑변 : ");
            double w = Double.parseDouble(br.readLine());

            System.out.print("높이 : ");

            double h = Double.parseDouble(br.readLine());

            System.out.println(w * h + " <- Area");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}