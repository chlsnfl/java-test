package test0421;

public class Circle {
	
	public double half = 3.14;
	
	public void width(double half) {
		System.out.println("원의 면적은 : " +Math.round(half* half* Math.PI));
	}
	
	public void around(double half) {
		System.out.println("원의 둘레는 : " + Math.round(half * 2 * Math.PI));
	}
}
