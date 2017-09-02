
public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pair<Double,String> pair1 = new Pair<>(33.33,"coœ tam");
		Pair<String,String> pair2 = new Pair<>("jest", " dobrze");
		Pair<Double,Integer> pair3 = new Pair<>(123.123, 1242523454);
	
		PairTest.wyswietlPare(pair1);
		PairTest.wyswietlPare(pair2);
		PairTest.wyswietlPare(pair3);
		
	}
	
	static <T,N> void wyswietlPare(Pair <T,N> pair){
		System.out.println("<" + pair.getT()+ " ; "+ pair.getV()+ ">");
	}

}
