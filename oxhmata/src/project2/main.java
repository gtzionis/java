package project2;
//Ευσταθια Πουλεα
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		synergeio syn = new synergeio();//αντικειμενο για το καλεσμα των μεθοδων μας
		
		int i = 0;
		int j=0;
		while(i!=9){//9 για εξοδο κ γενικο λοοπ για εμφανισει του μενου και την πραγματοποιηση λειτουργειων
			System.out.println("");//μενου
			System.out.println("παρακαλω πληκτρολογηστε μια απο τις επιλογες");
			System.out.println("1.Εισαγωγή στοιχείων συνεργείου");
			System.out.println("2.Εισαγωγή εργασίας");
			System.out.println("3.Εισαγωγή εργαζόμενου");
			System.out.println("4.Εισαγωγή οχήματος");
			System.out.println("5.Εισαγωγή επισκευής.");
			System.out.println("6.Διαγραφή εργασίας, εργαζόμενου, οχήματος, επισκευής");
			System.out.println("7.Εύρεση");
			System.out.println("8.Εκτύπωση");
			System.out.println("9.exodos");
			System.out.println("");
			i=sc.nextInt();
			if(i==1 & j==0){//1 μεχρι 5 οι εισαγωγες
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
			else if(i==6){//διαγραφες
				int epil1=0;
				while(epil1!=5){
					
				
				System.out.println("πληκτρολογησε απο ποια κατηγορια θελεις να διαγραψεις");
				System.out.println("1.διαγραφη εργασιας");
				System.out.println("2.διαγραφη εργαζομενου");
				System.out.println("3.διαγραφη οχηματος");
				System.out.println("4.επισκευης");
				System.out.println("5.εξοδος");
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
					System.out.println("λαθος νουμερο ξανα");
				
				}
			}
			else if(i==7){//αναζητηση ΥΣ δεν εχει γραφτει συναρτηση για την αναζητηση κοστους
				int epil2=0;
				
				while(epil2!=4)
				{	
					
				System.out.println("πληκτρολογησε τον τροπο αναζητησης");
				System.out.println("1.αριθμος πινακιδας");
				System.out.println("2.ημερομηνια");
				System.out.println("3.κοστος");
				System.out.println("4.εξοδος");
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
					System.out.println("λαθος επιλογη ξανα");
				}
                    					
				}
				
			}
			else if(i==8){
				//syn.printsyn();
				int epil=0;
				while(epil!=7){
					
				System.out.println("");	//μενου επιλογης εκτυπωσης
				System.out.println("πληκτρολογησε πια ομαδα θελεις να εκτυπωσεις ");
				System.out.println("1.εγασιας ");
				System.out.println("2.εργαζομενων");
				System.out.println("3.οχηματος ");
				System.out.println("4.επισκευη ");
				System.out.println("5.εκτυπωση ολων των ομαδων");
				System.out.println("6.εκτυπωση συνεργειου ");
				System.out.println("7.εξοδος");
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
					System.out.println("εκτυπωση συνεργειου");
					       syn.printSynergeio();
					System.out.println("εκτυπωση εργασιας");
					        syn.printErgasias();
					System.out.println("εκτυπωση εγαζομενων");
					        syn.printErgazomenwn();
					System.out.println("εκτυπωση οχηματοσ");
					        syn.printOxhmata();
					System.out.println("εκτυπωση επισκευασεων");
					
					
				}
				else if (epil==6){
					syn.printSynergeio();
				}
				else if(epil==7){
					break;
				}
				
				else{
					System.out.println("λαθος νουμερο ξανα");
				}
				}
			}
			else if(i==9){
				break;
			}
			else{
				System.out.println("");
			System.out.println("λαθος επιλογη δοκιμασε ξανα ");//μηνυμα γ λαθος εισαγωγη
			System.out.println("");
			}
			
		}
		

	}

}
