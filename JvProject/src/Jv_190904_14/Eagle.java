package Jv_190904_14;

/**
 * Eagle
 */
public class Eagle extends Animal {

	public Eagle(String name, String location) {
        super.setName(name);
        super.setLocation(location);
	}

    @Override
    public void move() {
        System.out.println(
            super.getName() + "이(가) " + super.getLocation() + "에서 날아다닙니다."
        );
    }

    
}