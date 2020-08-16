import java.util.*;
import java.util.stream.*;
class Employee{

	int empid;
	String empName;
	String empDesignation;
	float empSalary;
	String empLocation;

	int getEmpid(){
		return this.empid;
	}
	String getEmpName(){
		return this.empName;
	}
	String getEmpDesignation(){
		return this.empDesignation;
	}
	float getEmpSalary(){
		return this.empSalary;
	}
	String getEmpLocation(){
		return this.empLocation;
	}

	void setEmpid(int id){
		this.empid = id;
	}
	void setEmpName(String name){
		this.empName = name;
	}
	void setEmpDesignation(String desig){
		this.empDesignation = desig;
	}
	void setEmpSalary(float salary){
		this.empSalary = salary;
	}
	void setEmpLocation(String loc){
		this.empLocation = loc;
	}

	public String toString(){
		return String.format(this.getEmpid() + " : " + this.getEmpName()+ "->" + this.getEmpSalary());
	}

	public static void main(String[] args){

		Employee[] emp = new Employee[10];
		 //emp1.setEmpid(1);
		 emp1.setEmpName("Jack");
		 //emp1.setEmpDesignation("Manager");
		 //emp1.setEmpLocation("Munchester");
		 //emp1.setEmpSalary(500000);
		 //System.out.println(emp1);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; ++i)
		{
			emp[i] = new Employee();
			try
			{
				emp[i].setEmpid(Integer.parseInt(sc.nextLine()));

			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			emp[i].setEmpName(sc.nextLine());
			emp[i].setEmpDesignation(sc.nextLine());
			emp[i].setEmpLocation(sc.nextLine());
			emp[i].setEmpSalary(Float.parseFloat(sc.nextLine()));
		}
		ArrayList<Employee> arr = new ArrayList<>();
		for(int i = 0; i < 10; ++i)
		{
			arr.add(emp[i]);
		}

		Stream<Employee> st = arr.stream();
		Stream<Employee> st2 = arr.stream().filter(e -> e.empSalary > 50000);
		Stream<Employee> st3 = arr.stream().filter(e -> e.empLocation.charAt(0) == 'M' );
		Stream<Employee> st4 = arr.stream().filter(e -> e.empDesignation.charAt(e.empDesignation.length()-1) == 'e' );
		st.forEach(s -> System.out.println(s));
		st2.forEach(s -> System.out.println(s));
		st3.forEach(s -> System.out.println(s));
		st4.forEach(s -> System.out.println(s));

	}

}
