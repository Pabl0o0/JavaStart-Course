
public class Person {

	private String name;
	private String surname;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	Person(String name, String surname, int salary){
		setName(name);
		setSurname(surname);
		setSalary(salary);
	}
	@Override
	public String toString() {
		return "Imiê: " + name + ", Nazwisko: " + surname + ", Wyp³ata " + salary;
	}
	
}
