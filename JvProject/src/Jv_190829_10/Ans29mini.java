package Jv_190829_10;

class Ans29Sub {
	private double width = 5.0 ; //밑변 
	private double height = 3.5; //높이
	
	private double area ; //삼각형 넓이
	private double hypotenuse ; //빗변 길이 
	private double perimeter ; //둘레 길이
	
	//아래의 메소드는 모두 void 형으로 구현하세요.
	public Ans29Sub() {
		this.setArea() ;//삼각형의 넓이 = (밑변 * 높이) /2
		this.setHypotenuse(); //빗변 길이 = Math.sqrt(밑변*밑변 + 높이*높이)
		this.setPerimeter(); //둘레 길이 = 밑변 + 높이 + 빗변길이	
	}
	private void setPerimeter() {
		perimeter = width + height + hypotenuse;
	}
	private void setHypotenuse() {
		hypotenuse = Math.sqrt(width * width + height * height);
	}
	private void setArea() {
		area = (width * height) / 2;
	}
	public void Display() {
		System.out.println("삼각형의 넓이 : " + this.area );
		System.out.println("빗변 길이 : " + this.hypotenuse );
		System.out.println("둘레 길이 : " + this.perimeter );		
	}
}
public class Ans29mini {
	
	public static void main(String[] args) {
		Ans29Sub obj = new Ans29Sub() ;
		obj.Display();
	}
}