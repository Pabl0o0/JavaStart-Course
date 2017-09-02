import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

	static Scanner sc = new Scanner(System.in);
	static Integer sum = 0;
	static int i =0;
	static String numbers;
	static StringBuilder sb = new StringBuilder();
	
	private static Integer FiguresCount(List list) {
		sb.append(list.get(i)+"+");
		sum += (Integer) list.get(i);
		i++;
		if(i == list.size()){
			sb.replace(sb.length()-1, sb.length(), " = ");
			sb.append(sum);
			System.out.println(sb.toString());
			return sum;
		}
		FiguresCount(list);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please write down the numbers to sum, if you want to get a result write EXIT");
		List<Integer> ints = new ArrayList<>();
		
		numbers = sc.nextLine();			
		while(!numbers.equals("EXIT") && !numbers.equals("exit")) {
			Integer num = Integer.valueOf(numbers);
			ints.add(num);
			numbers = sc.nextLine();
		}
		
			
		
		FiguresCount(ints);
		sc.close();
		
		
		
		

	}
}
