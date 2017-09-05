import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

	public static void main (String[] args){
		List<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		generate(numbers, () -> r.nextInt(100));
		display(numbers, num -> System.out.print(num + " "));	
		System.out.println();
		filteredList(numbers, num -> num%2 ==0);
		display(numbers, num -> System.out.print(num + " "));
	}
	
	private static <T> void generate(List<T> list, Supplier<T> sup) {
		for(int i =0; i<10; i++){
			list.add(sup.get());
		}
	}
		
	private static <T> void display(List<T> list, Consumer<T> con) {
		for (T t: list)
			con.accept(t);
	}
	
	private static <T> void filteredList(List<T> list, Predicate<T> pre){
		System.out.println("Even numbers: ");
		Iterator<T> it = list.iterator();
        while(it.hasNext()) {
            T tmp = it.next();
            if(pre.test(tmp)) {
                it.remove();
            }
        }
	}
	
}
