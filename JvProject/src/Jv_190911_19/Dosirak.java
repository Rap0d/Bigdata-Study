package Jv_190911_19;

import java.text.DecimalFormat;

/**
 * Dosirak
 */
public class Dosirak {
	private Saram saram;
    private String dname;
    private int price;
    private String[] banchan = new String[3];

    public Dosirak(Saram saram, String dname, int price, String[] banchan) {
        this.saram = saram;
        this.dname = dname;
        this.price = price;
        this.banchan = banchan;
	}

    public Saram getSaram() {
        return saram;
    }

    public void setSaram(Saram saram) {
        this.saram = saram;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPrice() {
        String str = "";
        String p = "#,###.00";
        DecimalFormat df = new DecimalFormat(p);
        str = df.format(this.price);
        return str;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getBanchan() {
        return banchan;
    }

    public void setBanchan(String[] banchan) {
        this.banchan = banchan;
    }
}