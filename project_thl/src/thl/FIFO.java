package thl;

import java.util.*;

public class FIFO {
		private  int positions;
		private int tablePos[];
		private int elements;
		private int numbers[];
		private int falses;
		
		Scanner sc=new Scanner(System.in);
		
		public FIFO(int positions, int elements){
			this.positions=positions;
			this.elements=elements;
			this.tablePos=new int[positions];
			this.numbers=new int[elements];
			this.falses=0;
		}
		
		

		public void insertData(){
			int target1=positions;
			int target2=0;
			boolean target3=false;
			for(int i=0; i<positions; i++){
				tablePos[i]=numbers[i];
				falses=falses+1;
				System.out.print(tablePos[i]);
			}
			System.out.println();
		    for(int i=positions; i<elements;i++){
		        
		    	for(int j=0;j<positions;j++){
		    		if(numbers[i]==tablePos[j]){
		    			target3=true;
		    		}
		    	}
		    	if(target3==false){
		    		tablePos[target2]=numbers[i];
		    		target2=target2+1;
		    		falses=falses+1;
		    		if(target2==positions){
		    			target2=0;
		    		}
		    	}
		    	
		    	target3=false;
		    	for(int k=0;k<positions;k++){
			    	System.out.print(tablePos[k]);
			    }
		        System.out.println();
		    }
		    /*for(int i=0;i<positions;i++){
		    	System.out.println(tablePos[i]);
		    }*/
		}
		
		public void setN(){
			int num;
			for(int i=0;i<elements;i++){
				System.out.println("Πληκτρολόγησε τον αριθμό ");
				num=sc.nextInt();
				numbers[i]=num;
			}
		}
		
		Random rn=new Random();
		
		public void setNRandom(){
			int num;
			for(int i=0;i<elements;i++){
				num=rn.nextInt(10);
				numbers[i]=num;
			}
		/*	for(int r1=0;r1<elements;r1++){
				for(int r2=0;r2<elements-1;r2++){
					if(numbers[r1]==numbers[r2+1]){
						num=rn.nextInt(10);
						numbers[r2]=num;
					}
				}
			} 
		*/
			
		}
		
		public void print(){
			System.out.println("Falses "+falses);
		}
		
}
