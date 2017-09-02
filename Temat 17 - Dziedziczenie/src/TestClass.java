
public class TestClass {


	public static void main(String[] args) {
		Tire tire = new Tire(4585,"continental","model12",45867,4,5);
		Wheel wheel = new Wheel(4545885,"continentalik","model1452",0214,44,55);
		ExhaustPart ep = new ExhaustPart(4545885,"continentalik12","model",7854,"zgodna");
		tire.wyswietl();
		wheel.wyswietl();
		ep.wyswietl();
	}

}
