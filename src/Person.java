
public class Person  {

	private String name;
	private int age;
	private String job;
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public String toString() {
		return "Name: " + name + " Age: " + age + " Job: " + job;
	}
}
