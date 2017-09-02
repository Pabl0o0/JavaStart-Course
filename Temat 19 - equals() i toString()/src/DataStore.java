
public class DataStore {

	public final static int maxLiczbaKomputerow = 100;

	private Computer[] computers;
	private int computersNumber;
	
	public Computer[] getComputers(){
		Computer[] comps = new Computer[computersNumber];
		for (int i = 0; i<computersNumber; i++){
			comps[i] = computers[i];
		}
		return comps;
	}
	
	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}

	public int getComputersNumber() {
		return computersNumber;
	}

	public void setComputersNumber(int computersNumber) {
		this.computersNumber = computersNumber;
	}

	public DataStore() {
		computers = new Computer[maxLiczbaKomputerow];
		computersNumber = 0;
	}
	
	public void add(Computer comp){
		if (computersNumber < maxLiczbaKomputerow){
			computers[computersNumber] = comp;
			computersNumber++;
		}
	}

	public int checkAvalability(Computer comp){
		int iloscTakichSamychKomputerow = 0;
		for(int i =0; i<computersNumber; i++){
		if (comp.equals(computers[i])){
			iloscTakichSamychKomputerow++;
			}
		}
		return iloscTakichSamychKomputerow;
	}

}







