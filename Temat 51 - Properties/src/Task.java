import java.util.Scanner;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Task {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IntegerProperty first = new SimpleIntegerProperty();
	     IntegerProperty second = new SimpleIntegerProperty();
	        
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<2; i++){
		System.out.println("Wprowadz liczb�");
		first.setValue(sc.nextInt());
		
		second.bind(first);
		System.out.println("Warto�� zmiennej second wynosi:" + second.getValue());
		}
		sc.close();
	}

}
