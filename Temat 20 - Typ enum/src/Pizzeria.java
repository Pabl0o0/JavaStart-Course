import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dostepne pizze: ");
		for(Pizza p: Pizza.values()){
			System.out.println(p.toString());
		}
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz pizze !");
		switch (sc.nextLine()){
		case ("MARGHERITA"):
			System.out.println("Potwierdzam zam�wienie pizzy "+Pizza.valueOf("MARGHERITA"));
			break;
		case ("CAPRICIOSA"):
			System.out.println("Potwierdzam zam�wienie pizzy "+Pizza.valueOf("CAPRICIOSA"));
			break;
		case ("PROSCIUTTO"):
			System.out.println("Potwierdzam zam�wienie pizzy "+Pizza.valueOf("PROSCIUTTO"));
			break;
		default:
			System.out.println("Nie ma takiej pizzy! Spr�buj wpisa� jeszcze raz");
		}
	
		sc.close();
*/
		Scanner input = new Scanner(System.in);
        System.out.println("Jak� pizz� wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
         
        System.out.println("Dzi�kujemy za zam�wienie pizzy " + pizza.name());
        input.close();
	}

}
