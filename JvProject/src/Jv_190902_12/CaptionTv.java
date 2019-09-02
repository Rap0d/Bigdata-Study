package Jv_190902_12;

/**
 * CaptionTv
 */
public class CaptionTv extends Television{
    private String cap;
    public CaptionTv() {
        super();
        cap = "노캡션";
    }

    public CaptionTv(String color, String cap) {
        super.setColor(color);
        this.cap = cap;
    }

    public CaptionTv(String color, String cap, int vol, int chan) {
        super.setColor(color);
        super.setVol(vol);
        super.setChan(chan);
        this.cap = cap;
    }
    
    @Override
    void Display() {
        super.Display();
        System.out.println("캡션 : " + cap);
    }

	public void setVolume(int i) {
        setVol(i);
	}

	public void volumeDown(int i) {
        setVol(getVol() - i);
	}

	public void volumeUp(int i) {
        setVol(getVol() + i);
	}

	public void channelUp(int i) {
        setChan(getChan() + i);
	}
}