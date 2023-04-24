package teacher;

public class CircleExam {

	public static void main(String[] args) {
		Circle circle = new Circle(7, 12);
		
		System.out.println("넓이는 : " + circle.getArea());
		System.out.println("둘레는 : " + circle.getPerimeter());
		
		circle.setWidth(16);
		circle.setHeight(15);
		
		System.out.println("수정 된 넓이는 : " + circle.getArea());
		System.out.println("수저 된 둘레는 : " + circle.getPerimeter());

	}

}
