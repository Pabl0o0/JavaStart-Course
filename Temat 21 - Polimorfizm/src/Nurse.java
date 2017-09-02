
public class Nurse extends Person {

	Nurse(String name, String surname, int salary, int overtime) {
		super(name, surname, salary);
		setOvertime(overtime);
		// TODO Auto-generated constructor stub
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	private int overtime;
	@Override
	public String toString() {
		return super.toString() + ", Nadgodziny: " + overtime;
	}

	
	
}
