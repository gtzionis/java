package project5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tameio {

	private String titlos;
	private String edra; 
	
	private ArrayList<Asfalismenoi> asfalismenos = new ArrayList<Asfalismenoi>();

	
	public Tameio(String text1, String text2) {
		titlos = text1;
		edra = text2;
	}

	public void addAsfalismenoi(Asfalismenoi aAsfalismenos) {
	 	
	    	asfalismenos.add(aAsfalismenos);
	}
	
	public String getTitlos() {
		return titlos;
	}
	
	public String getEdra() {
		return edra;
	}
	
	Scanner input = new Scanner(System.in);
	
	String name;
	String afm;
	double amount;
	double per;
	int memb;
	private Asfalismenoi a;
		
	public void insert() {
		int epilogi=0;
		System.out.println("Πληκτρολογησε");
		System.out.println("1.Για εργαζομενό");
		System.out.println("2.Για συνταξιούχο");
		epilogi=input.nextInt();
		input.nextLine();
		if(epilogi==1) {
			System.out.println("Επώνυμο:");
			name=input.nextLine();
			System.out.println("ΑΦΜ:");
			afm=input.nextLine();
			System.out.println("Ποσό μηνιαίων αποδοχών:");
			amount=input.nextDouble();
			System.out.println("Ποσοστό κρατήσεων:");
			per=input.nextDouble();
			System.out.println("Αριθμός προστατευόμενων μελών:");
			memb=input.nextInt();
			a = new Ergazomenos(name, afm, amount, per, memb);
			asfalismenos.add(a);
		}
		
		else if(epilogi==2) {
			System.out.println("Επώνυμο:");
			name=input.nextLine();
			System.out.println("ΑΦΜ:");
			afm=input.nextLine();
			System.out.println("Ποσό μηνιαίας σύνταξης:");
			amount=input.nextDouble();
			System.out.println("Ποσοστό κρατήσεων:");
			per=input.nextDouble();
			a = new Sintaxiouxos(name, afm, amount, per);
			asfalismenos.add(a);
		}
		
		
	}
		public void print(){
			for(int i=0;i<asfalismenos.size();i++){
				System.out.println("Επώνυμο: " + asfalismenos.get(i).name +" Καθαρές απολαβές: "+ asfalismenos.get(i).CalculateSalary());
			}
		}
}

