
public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Liczba student�w przed zapisami: " + Student.liczbaStudentow);
		Student stud1 = new Student("Jacek","Kowalski",568951);
		Student stud2 = new Student("Jarek","Tkacz",857412);
		System.out.println("Ilo�� student�w po zapisach wynosi: " +Student.liczbaStudentow);
		System.out.println("S� to: ");
		stud1.getStudent();
		stud2.getStudent();
	}

}
