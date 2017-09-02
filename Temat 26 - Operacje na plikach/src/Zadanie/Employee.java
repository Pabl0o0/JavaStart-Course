package Zadanie;

public class Employee extends Person{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2791193196340572820L;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(String name, String surname, double salary){
		super(name, surname);
		setSalary(salary);
	}

	@Override
	public String toString() {
		return "imiê: "+ getName()+" nazwisko: "+ getSurname()+" wyplata:" + salary;
	}
	
	
}
