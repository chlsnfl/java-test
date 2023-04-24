package test0421;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Person(String name, int age) {
		System.out.println("이름 : "+name + " 나이 : "+age);
	}
	
}
