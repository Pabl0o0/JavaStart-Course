package Zadanie;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8529439398501069089L;
	/**
	 * 
	 */

	private String name;
	private String surname;
	
	
	public Person(String name, String surname){
		setName(name);
		setSurname(surname);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "imie: " + name + ", nazwisko: " + surname ;
	}
	
	
	
}
