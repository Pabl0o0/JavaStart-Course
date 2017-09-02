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
			System.out.println("Potwierdzam zamówienie pizzy "+Pizza.valueOf("MARGHERITA"));
			break;
		case ("CAPRICIOSA"):
			System.out.println("Potwierdzam zamówienie pizzy "+Pizza.valueOf("CAPRICIOSA"));
			break;
		case ("PROSCIUTTO"):
			System.out.println("Potwierdzam zamówienie pizzy "+Pizza.valueOf("PROSCIUTTO"));
			break;
		default:
			System.out.println("Nie ma takiej pizzy! Spróbuj wpisaæ jeszcze raz");
		}
	
		sc.close();
*/
		Scanner input = new Scanner(System.in);
        System.out.println("Jak¹ pizzê wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
         
        System.out.println("Dziêkujemy za zamówienie pizzy " + pizza.name());
        input.close();
	}

}
