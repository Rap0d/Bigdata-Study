package Jv_190902_12;

/**
 * Sports
 */
public class Sports {
    private String name;
    private int entry;

    public Sports() {

    }
    
    public Sports(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    public final void play() {
        System.out.println(name + "게임을 합니다.");
    }

    public void show() {
        System.out.println("게임 이름 : " + name);
        System.out.println("게임 인원 : " + entry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}