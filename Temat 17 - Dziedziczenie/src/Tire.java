
public class Tire extends Part {

	public int rozmiar;
	public int szerokosc;

	public Tire(int nrIdentyfikacyjny,String nazwaProducenta,String model,double seriaProduktu,int rozmiar,int szerokosc){
		super(nrIdentyfikacyjny,nazwaProducenta,model,seriaProduktu);
		this.rozmiar=rozmiar;
		this.szerokosc=szerokosc;
	}
	public void wyswietl() {
		System.out.println("Opona");
		System.out.println("numer identyfikacyjny " + nrIdentyfikacyjny + "\nnazwa producenta " + nazwaProducenta
				+ "\nmodel" + model + "\nseria produktu" + seriaProduktu+"\nrozmiar "+rozmiar+"\nszerokosc "+szerokosc+"\n");
	}
}

