
public class Part {

	public int nrIdentyfikacyjny;
	public String nazwaProducenta;
	public String model;
	public double seriaProduktu;

	public Part(int nrIdentyfikacyjny, String nazwaProducenta, String model, double seriaProduktu) {
		this.nrIdentyfikacyjny = nrIdentyfikacyjny;
		this.nazwaProducenta = nazwaProducenta;
		this.model = model;
		this.seriaProduktu = seriaProduktu;
	}

	public void wyswietl() {
		System.out.println("numer identyfikacyjny " + nrIdentyfikacyjny + "\nnazwa producenta " + nazwaProducenta
				+ "\nmodel" + model + "\nseria produktu" + seriaProduktu);
	}
}
