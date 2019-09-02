package Jv_190902_12;

/**
 * Television
 */
public class Television {
    private String color;
    private int vol;
    private int chan;
    public Television() {
        color = "검정";
        vol = 5;
        chan = 11;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }

	void Display() {
        System.out.println("색상 : " + getColor());
        System.out.println("볼륨 : " + getVol());
        System.out.println("채널 : " + getChan());
	}
}