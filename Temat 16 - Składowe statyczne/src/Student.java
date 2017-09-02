
public class Student {
private String imie;
private String nazwisko;
private int nrIndeksu;
public static int liczbaStudentow =0;

public String getImie() {
	return imie;
}
public void setImie(String imie) {
	this.imie = imie;
}
public String getNazwisko() {
	return nazwisko;
}
public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}
public int getNrIndeksu() {
	return nrIndeksu;
}
public void setNrIndeksu(int nrIndeksu) {
	this.nrIndeksu = nrIndeksu;
}

public Student(String imie, String nazwisko, int nrIndeksu){
	this.setImie(imie);
	this.setNazwisko(nazwisko);
	this.setNrIndeksu(nrIndeksu);
	liczbaStudentow++;
}
public void getStudent(){
	System.out.println(getImie()+" "+getNazwisko()+" "+getNrIndeksu());
}
}
