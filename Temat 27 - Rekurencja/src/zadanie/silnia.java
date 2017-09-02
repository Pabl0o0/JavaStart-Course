package zadanie;

public class silnia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		silnia sil = new silnia();
		int z = 5;
		int number = sil.obliczSilnie(z);
		System.out.println("Silnia z: "+z+ " wynosi = " +number);
	}
		public int obliczSilnie(int x){
			return x>1? x*obliczSilnie(x-1) : 1;
		}


}
