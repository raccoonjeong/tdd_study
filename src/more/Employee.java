package more;

public class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { 
		return this.name;
	}
}
