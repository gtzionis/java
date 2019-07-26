package project2;

import java.util.Date;
import java.util.Scanner;







public class synergeio {
	//���������� �� ����� ��� ����� ���������� ���� � ������� ��������� �� �������� � �� ����� ������� ���� ���������������� ���� � ��� ������ ������ � ������������ �������
	private String onoma;
	private String epwnumo;
	private String odos;
	private int ari8mos;
	private String polh;
	private int thlefwno;
	private ergasia listaergasias[]= new ergasia[100]; //��� ����� 100 ��������� ��������
	private int numergasia=0; //������� ��������� ��������� ��� �������� ��� �� ��� �������� ���� ��������� � ���������
	private oxhma listaOxhmatwn[]=new oxhma[100];
	private int numOxhmatwn=0;
	private ergazomenos listaErgazomenwn[]=new ergazomenos[100];
	private int numErgazomenwn=0;
	private episkeuh listaEpiskeuwn[]=new episkeuh[100];
	private int numEpiskeuwn=0;
	
	Scanner sc = new Scanner(System.in);
	
	public synergeio(){
		this.onoma=onoma;
		this.epwnumo=epwnumo;
		this.odos=odos;
		this.ari8mos=ari8mos;
		this.polh=polh;
		this.thlefwno=thlefwno;
	}
	
	public synergeio(String onoma,String epwnumo,String odos,int ari8mos,String polh,int thlefwno){
		this.onoma=onoma;
		this.epwnumo=epwnumo;
		this.odos=odos;
		this.ari8mos=ari8mos;
		this.polh=polh;
		this.thlefwno=thlefwno;
	}
	
	public void insertEpiskeuh(){//���������� ��� ������� �������� ��������� � �� ������� ��� ����� insert ����� � ��������
		
		int targetErgaz;
		int targetOxhma;
		int targetergasia;
		int diark = 0;
		ergasia ergasies[]=new ergasia[7];
		int da;
		int mon;
		int yea;

		
		
		if(numErgazomenwn!=0 && numOxhmatwn!=0 && numergasia!=0)
		{
			
			
			System.out.println("������� ��� ������ ��� ��������");
			int ar=sc.nextInt();
			
				while(ar>5){
					System.out.println("������� ������ �������� ��������� ��� 6");
					ar=sc.nextInt();
				}
				for(int in=0;in<ar;in++ ){
					targetergasia=sc.nextInt();
					findErgasia(targetergasia);	
					System.out.println("\n �������� : ");
					diark=sc.nextInt();
				}
			
	

			printErgazomenwn();
			
				targetErgaz=sc.nextInt();
				findergazomeno(targetErgaz);
			
			printOxhmata();
			
				targetOxhma=sc.nextInt();
			    findOxhma(targetOxhma);
			    
			System.out.println("\n ����: ");
			da=sc.nextInt();
			System.out.println("\n ����: ");
			mon=sc.nextInt();
			System.out.println("\n ����: ");
			yea=sc.nextInt();	
			
			
			listaEpiskeuwn[numEpiskeuwn]=new episkeuh(listaErgazomenwn[targetErgaz],listaOxhmatwn[targetOxhma],ergasies,diark,da,mon,yea);
			numEpiskeuwn++;
			
			
		}
		else
			System.out.println("������!!!\n��� �������� ������������ ��������");
		
		
		
		
	}

	public void insertErgazomenwn(){
		if(numErgazomenwn>100)
		{
			System.out.println("��� ������� �����");
		}
		else{
		String epwn;
		int kosto;
		code++;
		System.out.println("������� �����������: ");

		epwn=sc.next();
		System.out.println("������ ��������: ");
		kosto=sc.nextInt();
		
		listaErgazomenwn[numErgazomenwn]=new ergazomenos(epwn,code,kosto);
		numErgazomenwn++;
		}
	}
	
	public void insertOxhmatwn(){
		if(numOxhmatwn>100){
			System.out.println("��� ������� �����");
		}
		else{
			
		
		int ari8Pin;
		String epwny;
		int thl;
		System.out.println("������� ��������� ");
		ari8Pin=sc.nextInt();
		System.out.println("������� ");
		epwny=sc.next();
		System.out.println("�������� ������������ ");
		thl=sc.nextInt();
		listaOxhmatwn[numOxhmatwn]=new oxhma(ari8Pin,epwny,thl);
		numOxhmatwn++;
		}
	}
	
	int code=0;

	public void insertergasia(){
		if(numergasia>100){
			System.out.println("��� ������� �����");
		}
		else{
			
		
		String erg;
		code++;
		System.out.println("ergasia atomou ");
		erg = sc.next();
		listaergasias[numergasia] = new ergasia(erg,code);
		numergasia++;
		}
	}
	
	public void printErgazomenwn(){//�������� ����������� ���� ������� �� print einai g ektypvsh
		if(numErgazomenwn==0){
			System.out.println("��� ����� �������� ����������� ");
		}
		for(int k2=0;k2<numErgazomenwn;k2++){
			System.out.println("�������: "+listaErgazomenwn[k2].getKwdikos());
			System.out.println("�������: "+listaErgazomenwn[k2].getLastname());
			System.out.println("������ ��������: "+listaErgazomenwn[k2].getKostos());
		}
	}
	
	public void printOxhmata()
	{
		if(numOxhmatwn==0){
			System.out.println("��� ����� �������� �������� ");
		}
		for(int k1=0;k1<numOxhmatwn;k1++){
			System.out.println("������� ���������: "+listaOxhmatwn[k1].getAriPin());
			System.out.println("�������: "+listaOxhmatwn[k1].getEpwnumo());
			System.out.println("��������: "+listaOxhmatwn[k1].getThlefwno());
		}
	}
	
	public void printErgasias(){
		
		if(numergasia==0)
			System.out.println("��� �������� ������������� ��������");
		for(int k=0;k<numergasia;k++)
		{
			System.out.println("�������: "+listaergasias[k].getOnomaerg()+" �������:  "+listaergasias[k].getCodework()+"  ");
		}
	}
	
	public void printEpiskeuwn(){
		if(numEpiskeuwn==0){
			System.out.println("��� ������ �������� ��������� ");
		}		
		for(int k1=0;k1<numEpiskeuwn;k1++){
			System.out.println(" "+listaEpiskeuwn[k1].getErgaz());
			System.out.println(" "+listaEpiskeuwn[k1].getCar());
			System.out.println(" "+listaEpiskeuwn[k1].getListErgas());
			System.out.println(" "+listaEpiskeuwn[k1].getDiarkeia());
			System.out.println(" "+listaEpiskeuwn[k1].getDay());
			System.out.println(" "+listaEpiskeuwn[k1].getMonth());
			System.out.println(" "+listaEpiskeuwn[k1].getYear());
		}
	
	}
	
	public void toMonadikoSynergeio(){
		System.out.println("onoma ");
		onoma=sc.nextLine();
		System.out.println("epwnumo ");
		epwnumo=sc.nextLine();
		System.out.println("odos ");
		odos=sc.nextLine();
		System.out.println("polh ");
		polh=sc.nextLine();
		System.out.println("ari8mos ");
		ari8mos=sc.nextInt();
		System.out.println("thlefwno ");
		thlefwno=sc.nextInt();
		System.out.println(" ");
		
		}
	
	
	
	public void printSynergeio(){
		System.out.println("onoma: "+onoma);
		System.out.println("epwnumo: "+epwnumo);
		System.out.println("odos: "+odos);
		System.out.println("polh: "+polh);
		System.out.println("ari8mos: "+ari8mos);
		System.out.println("thlefwno: "+thlefwno);
	}
	
	
	
	
	
		

	public String getOnoma() {
		return onoma;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public String getEpwnumo() {
		return epwnumo;
	}

	public void setEpwnumo(String epwnumo) {
		this.epwnumo = epwnumo;
	}

	public String getOdos() {
		return odos;
	}

	public void setOdos(String odos) {
		this.odos = odos;
	}

	public int getAri8mos() {
		return ari8mos;
	}

	public void setAri8mos(int ari8mos) {
		this.ari8mos = ari8mos;
	}

	public String getPolh() {
		return polh;
	}

	public void setPolh(String polh) {
		this.polh = polh;
	}

	public int getThlefwno() {
		return thlefwno;
	}

	public void setThlefwno(int thlefwno) {
		this.thlefwno = thlefwno;
	}

	public void deleteErgaz() {
		// TODO Auto-generated method stub
		int f1;
		printErgazomenwn();
		System.out.println("������������� �� ���� ��� ������ ����� ������ �� ����������");
		f1=sc.nextInt();
		if(numErgazomenwn!=0){
			
			findergazomeno(f1);
			
			listaErgazomenwn[f1]=null;
			for(int f2=f1;f2<numErgazomenwn-1;f2++){
				listaErgazomenwn[f2]=listaErgazomenwn[f2+1];
			}
			listaErgazomenwn[numErgazomenwn-1]=null;
			numErgazomenwn--;
		}
		
	}
		
	private int findergazomeno(int ergcode){
		for(int f1=0;f1<numErgazomenwn;f1++)
			if(listaErgazomenwn[f1].getKwdikos()==ergcode)	
				return f1;
	    System.out.println("��� ������� �����������");
	    return -1;
	}
	
	public void deleteErga(){
		int f1;
		printErgasias();
		System.out.println("������������� �� ���� ��� ������ ����� ������ �� ����������");
		f1=sc.nextInt();
		if(numergasia!=0){
			
			findErgasia(f1);
			
			listaergasias[f1]=null;
			for(int f2=f1;f2<numergasia-1;f2++){
				listaergasias[f2]=listaergasias[f2+1];
			}
			listaergasias[numergasia-1]=null;
			numergasia--;
		}
	}
	
	private int findErgasia(int ergcode){
		for(int f1=0;f1<numergasia;f1++)
			if(listaergasias[f1].getCodework()==ergcode)
				return f1;
			
	    System.out.println("��� ������� �������");
	    return -1;
	}
	
	public void deleteOxhma(){
		int f1;
		printOxhmata();
		System.out.println("������������� �� ���� ��� ������ ����� ������ �� ����������");
		f1=sc.nextInt();
		if(numOxhmatwn!=0){
			
			findOxhma(f1);
			
			listaOxhmatwn[f1]=null;
			for(int f2=f1;f2<numOxhmatwn-1;f2++){
				listaOxhmatwn[f2]=listaOxhmatwn[f2+1];
			}
			listaOxhmatwn[numOxhmatwn-1]=null;
			numOxhmatwn--;
		}
	}
	
	private int findOxhma(int pinakida){
		for(int f1=0;f1<numergasia;f1++)
			if(listaOxhmatwn[f1].getAriPin()==pinakida)
				return f1;
	    System.out.println("��� ������� �����");
	    return -1;
	}
	
	public void deleteEpiskeuh(){//diagrafh
		int f1,f2,f3;
		printEpiskeuwn();
		System.out.println("������������� �� ���� ��� ���������� ���� �������� ������ �� ����������");
		System.out.println("����: ");
		f1=sc.nextInt();
		System.out.println("����: ");
		f2=sc.nextInt();
		System.out.println("����: ");
		f3=sc.nextInt();
		if(numOxhmatwn!=0){
			
			findEpiskeuh(f1,f2,f3);
			
			listaEpiskeuwn[f1]=null;
			for(int f=f1;f<numOxhmatwn-1;f++){
				listaEpiskeuwn[f2]=listaEpiskeuwn[f+1];
			}
			listaEpiskeuwn[numEpiskeuwn-1]=null;
			numEpiskeuwn--;
		}
	}
	
	private int findEpiskeuh(int m,int d,int y){
		for(int fo1=0;fo1<numergasia;fo1++)
			if(listaEpiskeuwn[fo1].getDay()==d && listaEpiskeuwn[fo1].getMonth()==m && listaEpiskeuwn[fo1].getYear()==y )
				return fo1;
			
		System.out.println("��� ������� �������");
	    return -1;
	}
	
	
	

	public void findPin() {//gia eyresh
		// TODO Auto-generated method stub
		int pinakida;
		System.out.println("������������� ������ ���������: ");
		pinakida=sc.nextInt();
		for(int f1=0;f1<numergasia;f1++)
			if(listaOxhmatwn[f1].getAriPin()==pinakida){
				
				System.out.println("�������!! "+listaOxhmatwn[f1]);
				System.out.println("�������� "+listaOxhmatwn[f1].getAriPin());
				System.out.println("������� "+listaOxhmatwn[f1].getEpwnumo());
				System.out.println("�������� "+listaOxhmatwn[f1].getThlefwno());
				
			}
			else	
	            System.out.println("��� ������� �����");
		
	    
	}
	
	public void findHmer() {
		// TODO Auto-generated method stub
		int d,m,y;
		System.out.println("������������� ����: ");
		d=sc.nextInt();
		System.out.println("������������� ����: ");
		m=sc.nextInt();
		System.out.println("������������� ����: ");
		y=sc.nextInt();
		for(int f1=0;f1<numergasia;f1++)
			if(listaEpiskeuwn[f1].getDay()==d && listaEpiskeuwn[f1].getMonth()==m && listaEpiskeuwn[f1].getYear()==y)
			{
			System.out.println("������� "+listaEpiskeuwn[f1]);
			System.out.println("���� "+listaEpiskeuwn[f1].getDay());
			System.out.println("���� "+listaEpiskeuwn[f1].getMonth());
			System.out.println("���� "+listaEpiskeuwn[f1].getYear());
			System.out.println("���� "+listaEpiskeuwn[f1].getDiarkeia());
			}
			else	
	            System.out.println("��� ������� ��������");
	    
	}

}
