package Jv_190904_14;

/**
 * Goldfish
 */
public class Goldfish extends Animal {

	public Goldfish(String name, String location) {
        super.setName(name);
        super.setLocation(location);
	}

    @Override
    public void move() {
        System.out.println(
            super.getName() + "이(가) " + super.getLocation() + "에서 헤엄칩니다."
        );
    }

    
}