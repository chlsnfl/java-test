package test0421;

public class Dog {
	private String name;
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
		System.out.println("성격 :" + value );
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("품종 :" + name);
	}

	
}
