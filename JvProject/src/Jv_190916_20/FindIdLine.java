package Jv_190916_20;

import java.io.*;

/**
 * FindIdLine
 */
public class FindIdLine {

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;
        File source = new File("/Users/seungheonchang/Desktop/findId.txt");

        try {
            fr = new FileReader(source);
            br = new BufferedReader(fr);

            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                int ap = tmp.indexOf("(");
                int bp = tmp.indexOf(")");

                if (ap > -1 && bp > -1) {
                    if ((ap + 1) < bp) {
                        String id = tmp.substring(ap + 1, bp);
                        System.out.println(id);
                    }
                }
            }
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