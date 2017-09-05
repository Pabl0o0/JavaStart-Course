package zadanie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	ArrayList<Integer> numbers;
	List<Integer> firstSixNumbers;
	List<Integer> userNumbers;
	int winningumbers =0;
	
	public ArrayList<Integer> generate(){
		numbers = new ArrayList<Integer>();
		for (int i =1; i<50; i++){
			numbers.add(i);
		}
		return numbers;		
	}
	
	public void randomize(){
		Collections.shuffle(numbers);
		firstSixNumbers = new ArrayList<Integer>();
		for (int i=0; i <6; i++){
			firstSixNumbers.add(numbers.get(i));
		}
	}
	
	public int checkResult(List<Integer> UserNumbers){
		for(int number: firstSixNumbers){
			for(int number2: UserNumbers){
				if (number == number2)
					winningumbers++;
			}
		}
		return winningumbers;
	}
	
	public void getNumbersFromUser(){
		Scanner sc = new Scanner(System.in);
		userNumbers = new ArrayList<Integer>();
		int Number = 0;
		for(int i=0;i<6;i++){
			System.out.println("Give your lucky number "+ (i+1));
			
			boolean error = true;
	        while(error) {
	        	try {
	            	Number = sc.nextInt();
	                error = false;
	            } catch(InputMismatchException e) {
	                System.out.println("You don't give a number, try once again ");
	                sc.nextLine();
	            }
	            if (Number<=0 || Number>49){
	            		System.out.println("You have to give number from 1 to 49, try once again !");
	            		error=true;
	            	}
	            if (userNumbers.contains(Number)){
	            	System.out.println("You already gave that number, try once again !");
	            	error=true;
	            }
	        }
	        userNumbers.add(Number);
	        }			
		sc.close();
	}
	
	 private static void printCollection(Collection<Integer> collection) {
	        for(int s: collection) {
	            System.out.print(s + " ");
	        }
	        System.out.println();
	    }
	 
	 public static void main(String[] args){
		 Lotto lotto = new Lotto();
		 lotto.generate();
//		 System.out.println(lotto.generate());
		 lotto.randomize();		
		 lotto.getNumbersFromUser();
		 System.out.println("You shot "+lotto.checkResult(lotto.userNumbers)+" number/s!");
		 System.out.print("Drawing results: ");
		 Lotto.printCollection(lotto.firstSixNumbers);
	 }
	
}
