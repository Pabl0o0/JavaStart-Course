import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ile s³ów chcesz wprowadziæ ?");
		int lengh = input.nextInt();
		input.nextLine();
		System.out.println("Wprowadz s³owa");
		StringBuilder builder = new StringBuilder();
//		String[] tab = new String[lengh];
		for(int i =0; i<lengh; i++){
//			tab[i] = input.nextLine();
//			builder.append(tab[i].charAt(tab[i].length() -1));
			String word = input.nextLine();
			builder.append(word.charAt(word.length() -1));
		}
		
		System.out.println(builder.toString());
		input.close();
	}
	
}
