import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class SetsTask {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new FileReader("namespl.txt"));
		TreeSet<String> namesSet = new TreeSet<>(new Comparator<String>(){
				
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s2.compareTo(s1);
			}
		});
		
		String nextLine;
        while ((nextLine = reader.readLine()) != null) {
                namesSet.add(nextLine);
                }
         reader.close();
 /*        
         for(String names: namesSet){
        	 System.out.println(names);
         }
 */        
         System.out.println("Ilość imion w zbiorze: " + namesSet.size());
         System.out.println("Pierwsze imię: " + namesSet.first());
         System.out.println("Ostatnie imię w zbiorze: " + namesSet.last());
        
		}	  
}


