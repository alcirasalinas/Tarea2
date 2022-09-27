package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Person;
import dol.Student;
import dol.Student;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Student person;
	
	
	public PersonForm(Scanner person2) {
		scan = person2;
	}
	
	public PersonForm(Student p) {
		person = p;
	}
	
	
	public Student catchPerson() {
		Student p = new Student();
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(date);
		
		System.out.println("Ingrese el numero de carnet:");
		p.setNum_carnet(scan.nextInt());
		
		Date fechaInscr = DateUtil.catchValidDate(scan, "Fecha de inscripcion (dd/MM/yyyy): ");
		p.setFech_inscripcion(fechaInscr);
			
		return p;
	}
	
	public void showPerson() {
		System.out.printf("Primer nombre: %s\n" , person.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", person.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", person.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", person.getSecondSurname());
		
		System.out.printf("Género: %s\n", person.getGender());
		
	    System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));

		System.out.printf("Numero de Carnet: %s\n", person.getNum_carnet());
		
		System.out.printf("Fecha de inscripción: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));
		
	}
	
}
