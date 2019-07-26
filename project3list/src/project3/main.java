package project3;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);                            
		int epilogh=0;
		int one=0;
        etairia et=new etairia();
        ergazomenos er=new ergazomenos();
        akinhta ak=new akinhta();
		while(epilogh!=7){
        System.out.println("1.εισαγωγη εταιριας");
        System.out.println("2.εισαγωγη εργαζομενου");
        System.out.println("3.εισαγωγη ακινητου");
        System.out.println("4.αναζητηση");
        System.out.println("5.διαγραφη");
        System.out.println("6.εκτυπωση");
        System.out.println("7.εξοδος");
        epilogh=sc.nextInt();
        if(epilogh==1 && one==0 ){
        	et.insertEtairias();
        	one=1;
        }
        else if(epilogh==2){
        	et.insertErgaz();
        }
        else if(epilogh==3){
        	et.insertAkinhto();
        }
        else if(epilogh==4){
	         et.search();
        }
        else if(epilogh==5){
	        et.delete();
        }
        else if(epilogh==6){
        	int epil=0;
        	while(epil!=5){
        	System.out.println("επιλογη εκτυπωσης");
        	System.out.println("1.εταιριας");
        	System.out.println("2.εργαζομενων");
        	System.out.println("3.ακινητων");
        	System.out.println("4.ολων");
        	System.out.println("5.εξοδος");
        	epil=sc.nextInt();
        	if(epil==1){
        	   et.printEtairia();	
        	}
        	else if(epil==2){
        		et.printErgaz();
        		
        	}
        	else if(epil==3){
        		et.printAkinhto();
        	}
        	else if (epil==4){
        	et.printEtairia();
        	et.printErgaz();
        	et.printAkinhto();
        	}
        	else if(epil==5){
        	     break;	
        	}
        	}
        }
        else if(epilogh==7){
	        break;
        }
        else{
        	System.out.println("λαθος επιλογη ξανα");
        }
        
        
		}
	}

}
