package dol;

import java.util.Date;

public class Student extends Person {
	
	public int num_carnet;
	public Date fech_inscripcion;
	
	public Student() {
		super();
		
		
	}

	public int getNum_carnet() {
		return num_carnet;
	}

	public void setNum_carnet(int num_carnet) {
		this.num_carnet = num_carnet;
	}

	public Date getFech_inscripcion() {
		return fech_inscripcion;
	}

	public void setFech_inscripcion(Date fech_inscripcion) {
		this.fech_inscripcion = fech_inscripcion;
	}


	}


	
	
