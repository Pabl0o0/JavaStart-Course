
public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Liczba studentów przed zapisami: " + Student.liczbaStudentow);
		Student stud1 = new Student("Jacek","Kowalski",568951);
		Student stud2 = new Student("Jarek","Tkacz",857412);
		System.out.println("Iloœæ studentów po zapisach wynosi: " +Student.liczbaStudentow);
		System.out.println("S¹ to: ");
		stud1.getStudent();
		stud2.getStudent();
	}

}
