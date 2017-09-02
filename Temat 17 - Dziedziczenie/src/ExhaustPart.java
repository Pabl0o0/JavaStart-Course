
public class ExhaustPart extends Part {

	public String czyZgodna;
	
	public ExhaustPart(int nrIdentyfikacyjny,String nazwaProducenta,String model,double seriaProduktu,String czyZgodna){
		super(nrIdentyfikacyjny,nazwaProducenta,model,seriaProduktu);
		this.czyZgodna=czyZgodna;
	}
	public void wyswietl() {
		System.out.println("ExhaustPart");
		System.out.println("numer identyfikacyjny " + nrIdentyfikacyjny + "\nnazwa producenta " + nazwaProducenta
				+ "\nmodel" + model + "\nseria produktu" + seriaProduktu+"\nZgodna? "+czyZgodna+"\n");
	}
}
