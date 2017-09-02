import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Iterators_excersice {

	
	
	public static void main(String [] args){
		Map<String,Person> map  = new TreeMap<>();
		map.put("Kowalski", new Person("Kowalski","Jan",29));
		map.put("Stachowiak", new Person("Stachowiak", "Janusz", 24));
		map.put("Walewski", new Person("Walewski","Tomasz", 35));
		map.put("Jedrczyk", new Person("Jedrczyk","Maria",34));
		map.put("Ananas", new Person("Ananas", "Ma³gorzata", 56));
		
		
//		System.out.println(map.values());
		
		Iterator<Person> it = map.values().iterator();
		while(it.hasNext()){
			Person person = it.next();
			System.out.println(person);
		}
	}
}
