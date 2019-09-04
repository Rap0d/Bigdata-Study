package Jv_190904_14;

/**
 * Lion
 */
public class Lion extends Animal {

	public Lion(String name, String location) {
        super.setName(name);
        super.setLocation(location);
	}

    @Override
    public void move() {
        System.out.println(
            super.getName() + "이(가) " + super.getLocation() + "에서 달립니다."
        );
    }

    
} 