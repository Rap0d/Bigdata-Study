package Jv_190916_20;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 * FileEx
 */
public class FileEx {
    private static final String SOURCE = "../testfile1.txt";
    private static final String TARGET = "../testfile2.txt";

    public static void main(String[] args) {
        resString();
    }

    private static void resString() {
        File source = new File(SOURCE);
        File target = new File(TARGET);
        BufferedWriter bw = null;
        BufferedReader br = null;

        String str = "";

        try {
            br = new BufferedReader(new FileReader(source));
            bw = new BufferedWriter(new FileWriter(target));

            while ((str = br.readLine()) != null) {
                String res = makeStr(str);
                System.out.println(res);
                bw.write(res);
                bw.newLine();
            }

            System.out.println("\nFINISH");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String makeStr(String str) {
        String arr[] = str.split(",");
        String name = arr[0];
        double kor = Double.parseDouble(arr[1]);
        double eng = Double.parseDouble(arr[2]);
        double math = Double.parseDouble(arr[3]);
        String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자";

        double _total = kor + eng + math;
        double _avg = _total / 3;

        String pattern = "###.0";
        DecimalFormat df = new DecimalFormat(pattern);

        String total = df.format(_total);
        String avg = df.format(_avg);

        String res = name + " / " + total + " / " + avg + " / " + gender;
        return res;
    }
}