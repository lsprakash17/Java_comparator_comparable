package ComparableAndComparator;

import java.util.Arrays;
class Employee implements Comparable
{
	int age;
	String name;
	double sal;

	public Employee(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}

	public int compareTo(Object o) {
		Employee v=(Employee)o;
//		return this.age-v.age;
//		return this.name.compareTo(v.name);
		return (int) ((int)this.sal-v.sal);
	}
	
	
}

public class Comparableex {
	public static void main(String[] args) {
		Employee e = new Employee(17, "Rakesh", 789.235);
		Employee e1 = new Employee(15, "Prakash", 78.25);
		Employee e2 = new Employee(17, "Akash", 7896.235);
		Employee[] arr = { e, e1, e2 };
		Arrays.sort(arr);
		for(Employee o:arr)
		{
			System.out.println(o);
		}
	}

}