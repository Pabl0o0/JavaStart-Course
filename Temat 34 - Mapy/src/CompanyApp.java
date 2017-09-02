import java.util.Scanner;

public class CompanyApp {	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		System.out.println("Menu: \n1 - add new employee "
				+ "\n2 - find an employee by name and surname "
				+ "\n0 - exit :-(");
		int x = sc.nextInt();
		while(x != 0){
			switch (x){
			case 1:
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Surname: ");
				String surname = sc.nextLine();
				System.out.println("Sallary: ");
				int sallary = sc.nextInt();
				c.employees.put(name+surname, new Employee(name, surname, sallary));
				break;
			case 2:
				sc.nextLine();
				System.out.println("Give name and surname of employee");
				System.out.println("Name: ");
				String name1 = sc.nextLine();
				System.out.println("Surname: ");
				String surname1 = sc.nextLine();
				System.out.println(c.employees.get(name1+surname1));
				break;
			default:
				System.out.println("Choose 0, 1 or 2 :-)");
			}
			System.out.println("Menu: \n1 - add new employee "
					+ "\n2 - find an employee by name and surname "
					+ "\n0 - exit :-(");
			x = sc.nextInt();
		}
		System.out.println("Exit");
		sc.close();
		
	}
}
