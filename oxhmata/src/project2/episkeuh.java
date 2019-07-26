package project2;

import java.util.Date;

public class episkeuh {
	private ergazomenos ergaz;
	private oxhma car;
	private ergasia listErgas[]=new ergasia[10];
	private int diarkeia;
	private int day ;
	private int month;
	private int year;
	
	public episkeuh(ergazomenos ergaz,oxhma car,ergasia listErgas[],int diarkeia,int day,int month,int year){
		this.ergaz=ergaz;
		this.car=car;
		this.listErgas[10]=null;
		this.diarkeia=diarkeia;
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ergazomenos getErgaz() {
		return ergaz;
	}

	public void setErgaz(ergazomenos ergaz) {
		this.ergaz = ergaz;
	}

	public oxhma getCar() {
		return car;
	}

	public void setCar(oxhma car) {
		this.car = car;
	}

	public ergasia[] getListErgas() {
		return listErgas;
	}

	public void setListErgas(ergasia[] listErgas) {
		this.listErgas = listErgas;
	}

	public int getDiarkeia() {
		return diarkeia;
	}

	public void setDiarkeia(int diarkeia) {
		this.diarkeia = diarkeia;
	}

	

	
	
	
	
	

}
