import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int liczba;
		System.out.println("Wybierz 1 jeœli chcesz dopisaæ pacjenta \nWybierz 2 jeœli chcesz wyœwietliæ listê pacjentów"
				+ "\nWybierz 0 jeœli chcesz wyjœæ z programu!");
		liczba = sc.nextInt();
		sc.nextLine();

		Hospital hospital = new Hospital();
		Patient patient = new Patient();

		while (liczba>0) {
			if(liczba==1){
			System.out.println("imiê: ");
			patient.setFirstName(sc.nextLine());
			System.out.println("nazwisko: ");
			patient.setLastName(sc.nextLine());
			System.out.println("pesel: ");
			patient.setPesel(sc.nextLine());
			hospital.addPatient(patient);
			System.out.println("dopisano pacjenta");
			System.out.println("Wybierz 1 jeœli chcesz dopisaæ pacjenta \nWybierz 2 jeœli chcesz wyœwietliæ listê pacjentów"
					+ "\nWybierz 0 jeœli chcesz wyjœæ z programu!");
			liczba = sc.nextInt();
		}
			if (liczba==2) {
			hospital.printPatients();
			System.out.println("Wybierz 1 jeœli chcesz dopisaæ pacjenta \nWybierz 2 jeœli chcesz wyœwietliæ listê pacjentów"
					+ "\nWybierz 0 jeœli chcesz wyjœæ z programu!");
			liczba = sc.nextInt();
		}
		}
		if (liczba==0) {
			System.out.println("wychodzisz z programu");
			sc.close();
		}
	}

}
