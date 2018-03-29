
public class Employee 
{
	int empId;
	String empName;
	
	Employee(int id, String name)
	{
		this.empId=id;
		this.empName=name;
	}
	
	void info()
	{
		System.out.println("Id: "+empId +" Name: "+empName);
	}
}
