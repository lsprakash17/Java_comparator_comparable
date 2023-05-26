package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.util.comparator.Comparators;

final class Employee1
{
	public Employee1(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	

	int age;
	String name;
	double sal;
	@Override
	public String toString() {
		return "Employee1 [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
}
class mains implements Comparator
{

	public int compare(Object o1, Object o2) 
	{
		Employee1 e= (Employee1)o1;
		Employee1 e1= (Employee1)o2;
		
		return e.age-e1.age;
	}
	
	
}
public class ComparatorExa 
{
public static void main(String[] args) 
{
Employee1 e=new Employee1(27,"rpitha",25000);
Employee1 e1=new Employee1(22,"brpitha",210255.6);
Employee1 e2=new Employee1(19,"Arpitha",24000.56);
Employee1[] arr = { e, e1, e2 };
Arrays.sort(arr,new mains());
for(Employee1 o:arr)
{
	System.out.println(o);
}

}
}
