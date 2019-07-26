package project3;










import java.util.Date;
import java.util.Scanner;


public class etairia {
	private String onoma;
	private int afm;
	private String dieu8unsh;
	private NewSortedList akinhto=new NewSortedList();
	private NewSortedList ergaz=new NewSortedList();
	private int numAkinhtwn=0;
	private int numErgazomenwn=0;
	private akinhta akin=new akinhta();
	private idiokthtaKth id= new idiokthtaKth();
	public etairia(String onoma,int afm,String dieu8unsh){
		this.onoma=onoma;
		this.afm=afm;
		this.dieu8unsh=dieu8unsh;
	}
	public etairia() {
		// TODO Auto-generated constructor stub
		this.afm=afm;
		this.dieu8unsh=dieu8unsh;
		this.onoma=onoma;
		}
	Scanner sc= new Scanner(System.in);
	
		
	public void insertAkinhto(){
		String dieu;
		int tetra;
		akinhta a = null;
		System.out.println("������������� ��������� ");
		dieu=sc.next();
		System.out.println("������������� ����������� ");
		tetra=sc.nextInt();
		int epilogh=5;
		//while (epilogh<3 && epilogh>3){
		System.out.println("������� ����� ��������");
		System.out.println("1.��������");
		System.out.println("2.������� �������������");
		System.out.println("3.������� ���������");
		epilogh=sc.nextInt();
		if(epilogh==1){
			int syntele=0;
			System.out.println("������������� ������ ����������");
			syntele=sc.nextInt();
			a=new oikopeda(dieu,tetra,syntele);
			akinhto.insert(new akinhtaItem(a));
		}
		else if (epilogh==2){
			System.out.println("���� ����� ");
			int lh3h=sc.nextInt();
			System.out.println("���� ����������� ");
			int enoikio=sc.nextInt();
			a=new enoikiazomenaKth(dieu,tetra,lh3h,enoikio);
			akinhto.insert(new akinhtaItem(a));
		}
		else if (epilogh==3){
		    System.out.println("����");	
			int a3ia=sc.nextInt();
			a=new idiokthtaKth(dieu,tetra,a3ia);
			akinhto.insert(new akinhtaItem(a));
		}
			numAkinhtwn++;
		//}
		
		
	}
	
	
	
	public void insertErgaz()
	{
	ergazomenos e=null;
	System.out.println("������������� ����� �����������");
	String onom=sc.next();
	System.out.println("������������� ������� �����������");
	String epwnum=sc.next();
	System.out.println("������������� ���");
	int af=sc.nextInt();
	System.out.println("������������� ���������");
	String die=sc.next();
	System.out.println("������������� ��� ��������� �����������");
	int epilogh=0;
	//while(epilogh<3 && epilogh>3){
	System.out.println("������������� �� ����� �����������");
	System.out.println("1.����������");
	System.out.println("2.CommissionEmployee");
	System.out.println("3.BasePlusCommissionEmployee");
	epilogh=sc.nextInt();
	if (epilogh==1){
		System.out.println("������ ��� ���");
		int xre=sc.nextInt();
		e= new wromis8ios(onom,epwnum,af,die,xre);
		ergaz.insert(new ergazomenosItem(e));
	}
	else if(epilogh==2){	
		System.out.println("������� ��������");
        int atPol=sc.nextInt();
		System.out.println("������� ����������");
		int arPro=sc.nextInt();
		e=new  CommissionEmployee(onom,epwnum,af,die,atPol,arPro);
		ergaz.insert(new ergazomenosItem(e));
	}
	else if(epilogh==3){
		System.out.println("������� ��������");
        int BatPol=sc.nextInt();
		System.out.println("������� ����������");
		int BarPro=sc.nextInt();
		System.out.println("������ ");
		int mis=sc.nextInt();
		e=new BasePlusCommissionEmployee(onom,epwnum,af,die,BatPol,BarPro,mis);
		ergaz.insert(new ergazomenosItem(e));
	}
	//}
	numErgazomenwn++;
	}
	
	public void print(int c)
	{
		if(c==1 && akinhto.isEmpty())
		{
			System.out.println("��� �������� �������");
			return ;
		}
		else if(c==2 && ergaz.isEmpty())
		{
			System.out.println("��� �������� �����������");
			return ;
		}
				
		if(c==1){
           akinhto.print();
		}
		else if (c==2){
	       ergaz.print();
		}	
	}
	
	public void printAkinhto(){
		if(akinhto.isEmpty())
		{
			System.out.println("��� �������� �������");
			return ;
		}
		else 
			akinhto.print();
	}
	
	public void printErgaz(){
		if(ergaz.isEmpty())
		{
			System.out.println("��� �������� �����������");
			return ;
		}
		else 
			ergaz.print();
	}
	
	public void insertEtairias(){
		System.out.println("������������� ����� �������� ");
		onoma=sc.next();
		System.out.println("��� ");
		afm=sc.nextInt();
		System.out.println("��������� ");
		dieu8unsh=sc.next();
		System.out.println("");
	}
	
	public void printEtairia(){
		System.out.println("������� ");
		System.out.println("�����: "+onoma);
		System.out.println("���: "+afm);
		System.out.println("���������: "+dieu8unsh);
	}

	public String getOnoma() {
		return onoma;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public int getAfm() {
		return afm;
	}

	public void setAfm(int afm) {
		this.afm = afm;
	}

	public String getDieu8unsh() {
		return dieu8unsh;
	}

	public void setDieu8unsh(String dieu8unsh) {
		this.dieu8unsh = dieu8unsh;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void delete(){
		
		int i;
		int ch=0;
		System.out.println("������������� �� ������ �� ����������");
		System.out.println("1.����������");
		System.out.println("2.�������");
		ch=sc.nextInt();
		if(ch==1){
			if(akinhto.isEmpty()){
			
				System.out.println("��� �������� �������");
				return ;
			                     }
			else{
			
				print(1);
				System.out.println("����� �� �� �������� ��� ������ �� ����������");
				
				do
					i=sc.nextInt();
				while(i<0 || i>akinhto.getLength());
				akinhtaItem tmp=(akinhtaItem)akinhto.getIthElement(i);
				akinhto.delete(akinhto.getIthElement(i));
			    }
		}
		else if(ch==2){
			if(ergaz.isEmpty()){
			
				System.out.println("��� �������� �����������");
				return ;
		             }
		        }
			else{
				print(2);
			
			System.out.println("����� �� �� ��� ��������� ��� ������ �� ����������");
			do
				i=sc.nextInt();
			while(i<0 || i>ergaz.getLength());
			ergaz.delete(ergaz.getIthElement(i));
				
			}
	}
				
		
	
	public void search()
	{
		int epilog=0;
		System.out.println("������������� �� ������ �� ����������");
		System.out.println("1.�����������");
		System.out.println("2.�������");
		epilog=sc.nextInt();
		if(epilog==1)
		{
			System.out.println("������������� ����� ����� �� ���� ������ ������ �� ����������");
			int i=sc.nextInt();
			ergazomenosItem tmp=(ergazomenosItem)ergaz.getIthElement(i);
			tmp.print();
			
		}
		else if(epilog==2)
		{
			
			System.out.println("������������� ����� ����� �� ���� ������ ������ �� ����������");
			int i=sc.nextInt();
			akinhtaItem tmp=(akinhtaItem)akinhto.getIthElement(i);
			tmp.print();
			
		}
		
	}
		
		
	//node n=omologa.search(new OmologoItem(o));	
			
			
	
}
