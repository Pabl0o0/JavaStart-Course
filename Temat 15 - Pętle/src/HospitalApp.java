import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int liczba;
		System.out.println("Wybierz 1 je�li chcesz dopisa� pacjenta \nWybierz 2 je�li chcesz wy�wietli� list� pacjent�w"
				+ "\nWybierz 0 je�li chcesz wyj�� z programu!");
		liczba = sc.nextInt();
		sc.nextLine();

		Hospital hospital = new Hospital();
		Patient patient = new Patient();

		while (liczba>0) {
			if(liczba==1){
			System.out.println("imi�: ");
			patient.setFirstName(sc.nextLine());
			System.out.println("nazwisko: ");
			patient.setLastName(sc.nextLine());
			System.out.println("pesel: ");
			patient.setPesel(sc.nextLine());
			hospital.addPatient(patient);
			System.out.println("dopisano pacjenta");
			System.out.println("Wybierz 1 je�li chcesz dopisa� pacjenta \nWybierz 2 je�li chcesz wy�wietli� list� pacjent�w"
					+ "\nWybierz 0 je�li chcesz wyj�� z programu!");
			liczba = sc.nextInt();
		}
			if (liczba==2) {
			hospital.printPatients();
			System.out.println("Wybierz 1 je�li chcesz dopisa� pacjenta \nWybierz 2 je�li chcesz wy�wietli� list� pacjent�w"
					+ "\nWybierz 0 je�li chcesz wyj�� z programu!");
			liczba = sc.nextInt();
		}
		}
		if (liczba==0) {
			System.out.println("wychodzisz z programu");
			sc.close();
		}
	}

}
