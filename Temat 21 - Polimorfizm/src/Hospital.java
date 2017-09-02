
public class Hospital {

	private Person [] employees;
	private int employeesNumber;
	private final static int MAX_EMPLOYYES = 3;	
	
	public Person[] getEmployees() {
		return employees;
	}

	public void setEmployees(Person[] employees) {
		this.employees = employees;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	public Hospital(){
		setEmployees(new Person[MAX_EMPLOYYES]);	
		setEmployeesNumber(0);
	}
	
	public void add(Person person){
		if (getEmployeesNumber()<MAX_EMPLOYYES){
			getEmployees()[getEmployeesNumber()] = person;
			setEmployeesNumber(getEmployeesNumber() +1);
		}
	}

	@Override
	public String toString() {
		String result = "";
		for (int i =0; i<employeesNumber; i++){
			result = result + employees[i] +"\n";
		}
		return result;
	}
	
	
	
}
