import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class References {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Pawe³", "Dominik", "Adam", "Marek", "Grzegorz");
		Collections.sort(names, String::compareToIgnoreCase);
		consumeArray(names, System.out::println);
	}

	private static <T> void consumeArray(List<String> names, Consumer<T> consumer) {
        for (String t : names) {
            consumer.accept((T) t);
        }
    }
	
}
