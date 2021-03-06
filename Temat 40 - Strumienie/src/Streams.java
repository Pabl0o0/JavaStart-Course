import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
 
	public static void main(String [] args){
		 List<Integer> numbers = Stream.iterate(0, x -> x+1)
                 .filter(x -> x>100 && x<1000 && x%5 ==0)
                 .limit(10)
                 .map(x -> x*3)
                 .collect(Collectors.toList());
		 
		 numbers.forEach(System.out::println);
		
		
/*		
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1)
										.filter(x -> x>100 && x<1000 && x%5==0);
										
		List<Integer> numList = numStream.map(x -> x*3).limit(10)
				.peek(System.out::println)
				.collect(Collectors.toList());
*/						
	}
}
