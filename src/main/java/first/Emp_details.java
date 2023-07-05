package first;

public class Emp_details {

	String empName="Hari";
	double empSalary=100;
	String empDept="HR";
	int id=1343;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp_details e=new Emp_details();
		System.out.println(e.calculateSalary(254.7));
System.out.println(e.dept());
e.empName("mounika");
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double calculateSalary(double sal) {
		return sal*12;
	}
public String dept() {
	return empDept;
}

public void empName(String empName ) {
	System.out.println(empName);
}


}
