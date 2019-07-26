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
		System.out.println("�������������");
		System.out.println("1.��� ����������");
		System.out.println("2.��� �����������");
		epilogi=input.nextInt();
		input.nextLine();
		if(epilogi==1) {
			System.out.println("�������:");
			name=input.nextLine();
			System.out.println("���:");
			afm=input.nextLine();
			System.out.println("���� �������� ��������:");
			amount=input.nextDouble();
			System.out.println("������� ���������:");
			per=input.nextDouble();
			System.out.println("������� ��������������� �����:");
			memb=input.nextInt();
			a = new Ergazomenos(name, afm, amount, per, memb);
			asfalismenos.add(a);
		}
		
		else if(epilogi==2) {
			System.out.println("�������:");
			name=input.nextLine();
			System.out.println("���:");
			afm=input.nextLine();
			System.out.println("���� �������� ��������:");
			amount=input.nextDouble();
			System.out.println("������� ���������:");
			per=input.nextDouble();
			a = new Sintaxiouxos(name, afm, amount, per);
			asfalismenos.add(a);
		}
		
		
	}
		public void print(){
			for(int i=0;i<asfalismenos.size();i++){
				System.out.println("�������: " + asfalismenos.get(i).name +" ������� ��������: "+ asfalismenos.get(i).CalculateSalary());
			}
		}
}

