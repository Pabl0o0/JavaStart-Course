
public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		
	hospital.add(new Doctor("Pawe�", "Zagumny", 10000, 500));
	hospital.add(new Nurse("Agnieszka", "Wa��sa", 2000, 20));
	hospital.add(new Nurse("Zuzanna", "Kamilska", 1800, 5));
	System.out.println(hospital);
	}

}
