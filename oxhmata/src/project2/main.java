package project2;
//�������� ������
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		synergeio syn = new synergeio();//����������� ��� �� ������� ��� ������� ���
		
		int i = 0;
		int j=0;
		while(i!=9){//9 ��� ����� � ������ ���� ��� ��������� ��� ����� ��� ��� �������������� ������������
			System.out.println("");//�����
			System.out.println("�������� �������������� ��� ��� ��� ��������");
			System.out.println("1.�������� ��������� ����������");
			System.out.println("2.�������� ��������");
			System.out.println("3.�������� �����������");
			System.out.println("4.�������� ��������");
			System.out.println("5.�������� ���������.");
			System.out.println("6.�������� ��������, �����������, ��������, ���������");
			System.out.println("7.������");
			System.out.println("8.��������");
			System.out.println("9.exodos");
			System.out.println("");
			i=sc.nextInt();
			if(i==1 & j==0){//1 ����� 5 �� ���������
				syn.toMonadikoSynergeio();
				j=1;
			}else if(i==2){
				syn.insertergasia();
			}
			else if(i==3){
				syn.insertErgazomenwn();
			}
			else if(i==4){
				syn.insertOxhmatwn();
			}
			else if(i==5){
				syn.insertEpiskeuh();
			}
			else if(i==6){//���������
				int epil1=0;
				while(epil1!=5){
					
				
				System.out.println("������������� ��� ���� ��������� ������ �� ����������");
				System.out.println("1.�������� ��������");
				System.out.println("2.�������� �����������");
				System.out.println("3.�������� ��������");
				System.out.println("4.���������");
				System.out.println("5.������");
				epil1=sc.nextInt();
				if(epil1==1){
					syn.deleteErga();
				}
				else if(epil1==2){
					syn.deleteErgaz();
				}
				else if(epil1==3){
					syn.deleteOxhma();
				}
				else if (epil1==4){
					syn.deleteEpiskeuh();
				}
				else if(epil1==5){
					break;
				}
				else
					System.out.println("����� ������� ����");
				
				}
			}
			else if(i==7){//��������� �� ��� ���� ������� ��������� ��� ��� ��������� �������
				int epil2=0;
				
				while(epil2!=4)
				{	
					
				System.out.println("������������� ��� ����� ����������");
				System.out.println("1.������� ���������");
				System.out.println("2.����������");
				System.out.println("3.������");
				System.out.println("4.������");
				epil2=sc.nextInt();
				if(epil2==1){
					syn.findPin();
				}
				else if(epil2==2){
				    syn.findPin();	
				}
				else if(epil2==3){
					
				}
				else if(epil2==4){
					break;
				}
				else{
					System.out.println("����� ������� ����");
				}
                    					
				}
				
			}
			else if(i==8){
				//syn.printsyn();
				int epil=0;
				while(epil!=7){
					
				System.out.println("");	//����� �������� ���������
				System.out.println("������������� ��� ����� ������ �� ���������� ");
				System.out.println("1.������� ");
				System.out.println("2.�����������");
				System.out.println("3.�������� ");
				System.out.println("4.�������� ");
				System.out.println("5.�������� ���� ��� ������");
				System.out.println("6.�������� ���������� ");
				System.out.println("7.������");
				epil=sc.nextInt();
				if(epil==1){
					syn.printErgasias();
				}
				else if(epil==2){
					syn.printErgazomenwn();
				}
				else if(epil==3){
					syn.printOxhmata();
				}
				else if(epil==4){
					syn.printEpiskeuwn();
				}
				else if(epil==5){
					System.out.println("�������� ����������");
					       syn.printSynergeio();
					System.out.println("�������� ��������");
					        syn.printErgasias();
					System.out.println("�������� ����������");
					        syn.printErgazomenwn();
					System.out.println("�������� ��������");
					        syn.printOxhmata();
					System.out.println("�������� ������������");
					
					
				}
				else if (epil==6){
					syn.printSynergeio();
				}
				else if(epil==7){
					break;
				}
				
				else{
					System.out.println("����� ������� ����");
				}
				}
			}
			else if(i==9){
				break;
			}
			else{
				System.out.println("");
			System.out.println("����� ������� �������� ���� ");//������ � ����� ��������
			System.out.println("");
			}
			
		}
		

	}

}
