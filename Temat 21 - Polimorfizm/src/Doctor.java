
public class Doctor extends Person{

	Doctor(String name, String surname, int salary, int premia) {
		super(name, surname, salary);
		setPremia(premia);
		// TODO Auto-generated constructor stub
	}

	private int premia;

	public int getPremia() {
		return premia;
	}

	public void setPremia(int premia) {
		this.premia = premia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Premia: " + premia;
	}
	
	
}
