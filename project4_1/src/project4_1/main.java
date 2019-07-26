package project4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> list=new ArrayList<Item>();
		Scanner sc=new Scanner(System.in);
		
		boolean more=true;
		
		while(more){
			
			String na=null;
			String de=null;
			double pr=0;
			int ag=0;
			boolean im=false;
			String au=null;
			double dis=0;
			
			System.out.println("1.Entry of a new toy");
			System.out.println("2.Entry of a new book");
			System.out.println("Give your choice [1,2]:");
			
			int choise=sc.nextInt();
			sc.nextLine();
			if(choise==1){
				System.out.println("Give the name:");
				na=sc.nextLine();
				
				System.out.println("Give the description:");
				de=sc.nextLine();
				
				System.out.println("Give the price:");
				pr=sc.nextDouble();
				
				System.out.println("Give the age:");
				ag=sc.nextInt();
				
				System.out.println("Is it imported (Y/N)");
				String yn=sc.nextLine();
				if(yn.equals("Y")){
					im=true;
				}
				else{
					im=false;
				}
				
			Item t1=new Toy(na,de,pr,ag,im);
			list.add(t1);
			}else if(choise==2){
				System.out.println("Give the name:");
				na=sc.nextLine();
				
				System.out.println("Give the description:");
				de=sc.nextLine();
				
				System.out.println("Give the price:");
				pr=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Give the author:");
				au=sc.nextLine();
				
				System.out.println("Give the discount");
				dis=sc.nextDouble();
				
				Book b1=new Book(na,de,pr,au,dis);
				list.add(b1);
			}else{
				System.out.println("wrong choise try again!");
			}
			sc.nextLine();
			System.out.println("Continue? (Y/N)");
			String moreData = sc.nextLine();
			if(moreData.equals("N")){
				more = false;
			}
		}
		
		for(int i=0;i<list.size();i++){
			list.get(i).printLabel();
		}
		
		System.out.println("Total number of toys & books:"+list.size());
	}

}
