package thl;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int ele=0;
		int num=0;
		int sel=0;
		boolean more=false;
		while(sel!=4){
		System.out.println("Πληκτρολόγησε");
		System.out.println("1.FIFO");
		System.out.println("2.LRU");
		System.out.println("3.MFU");
		System.out.println("4.Έξοδος");
		sel=sc.nextInt();
		if(sel==1){
			System.out.println("Πληκτροόγησε τις θέσεις μνήμης που θέλετε");
			pos=sc.nextInt();
			System.out.println("Πληκτρολόγησε πόσους αριθμούς θέλεις να υπάρχουν");
			ele=sc.nextInt();
			System.out.println("1.Για εισαγωγεί αριθμόν απο το πληκτρλόγιο");
			System.out.println("2.Για εισαγωγεί τυχαίον αριθμόν");
			int ch1=sc.nextInt();
			if(ch1==1){
			FIFO memory1=new FIFO(pos,ele);
			memory1.setN();
			memory1.insertData();
			memory1.print();}
			else{
				FIFO memory1=new FIFO(pos,ele);
				memory1.setNRandom();
				memory1.insertData();
				memory1.print();
			}
			}
		if(sel==2){
			System.out.println("Πληκτροόγησε τις θέσεις μνήμης που θέλετε");
			pos=sc.nextInt();
			System.out.println("Πληκτρολόγησε πόσους αριθμούς θέλεις να υπάρχουν");
			ele=sc.nextInt();
			System.out.println("1.Για εισαγωγεί αριθμόν απο το πληκτρλόγιο");
			System.out.println("2.Για εισαγωγεί τυχαίον αριθμόν");
			int ch1=sc.nextInt();
			if(ch1==1){
			LRU memory2=new LRU(pos,ele);
			memory2.setN();
			memory2.insertData();
			memory2.print();}
			else{
				LRU memory2=new LRU(pos,ele);
				memory2.setNRandom();
				memory2.insertData();
				memory2.print();
			}
			}
		if(sel==3){
			System.out.println("Πληκτροόγησε τις θέσεις μνήμης που θέλετε");
			pos=sc.nextInt();
			System.out.println("Πληκτρολόγησε πόσους αριθμούς θέλεις να υπάρχουν");
			ele=sc.nextInt();
			System.out.println("1.Για εισαγωγεί αριθμόν απο το πληκτρλόγιο");
			System.out.println("2.Για εισαγωγεί τυχαίον αριθμόν");
			int ch1=sc.nextInt();
			if(ch1==1){
			MFU memory3=new MFU(pos,ele);
			memory3.setN();
			memory3.insertData();
			memory3.print();}
			else{
				MFU memory3=new MFU(pos,ele);
				memory3.setNRandom();
				memory3.insertData();
				memory3.print();
			}
			}
		if(sel==4){
			break;
		}
	
		}
	}

}
