package thl;

import java.util.*;

public class LRU {

	private  int positions;
	private int tablePos[];
	private int elements;
	private int numbers[];
	private int uses[];
	private int falses;
	
	Scanner sc=new Scanner(System.in);
	
	public LRU(int positions, int elements){
		this.positions=positions;
		this.elements=elements;
		this.tablePos=new int[positions];
		this.numbers=new int[elements];
		this.uses=new int[positions];
		this.falses=0;
	}
	
	public void insertData(){
		int target1=positions;
		int target2=0;
		boolean target3=false;
		
		int plus=0;
		int pinakas[]=new int[positions];
		int place=0;
		
		for(int i=0;i<positions;i++){
			plus=plus+1;
			pinakas[i]=plus;
			uses[i]=plus;
		}
		
		for(int i=0; i<positions; i++){
			tablePos[i]=numbers[i];
			falses=falses+1;
			System.out.print(tablePos[i]);
		}
		System.out.println();
		for(int i=positions;i<elements;i++ ){
			
			for(int j=0;j<positions;j++){
				if(numbers[i]==tablePos[j]){
					for(int k=0;k<positions;k++){
					  if(uses[j]!=positions){
						if(uses[k]==1){
							
						}
						else{
							uses[k]=uses[k]-1;
						}
					}
				}
					uses[j]=positions;
					for(int a=0;a<positions;a++){
						if(a==positions-1){
							break;
						}
						if(uses[a]==uses[a+1]){
							uses[a+1]=uses[a+1]+1;
						}
						
					} 
					place=j;
					target3=true;
					break;
	    		}
			}
			
			int place2=0;
			
			if(target3==false){
				for(int j=0;j<positions;j++){
					if(uses[j]==1){
						place2=j;
						tablePos[j]=numbers[i];
						falses=falses+1;
						break;
					}
				}
				
				for(int j=0;j<positions;j++){
					uses[j]=uses[j]-1;
				}
				uses[place2]=positions;
			}
			for(int k4=0;k4<positions;k4++){
		    	System.out.print(tablePos[k4]);
		    }
	        System.out.println();
			target3=false;
		}
		
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
		
	}
	
	public void print(){
		for(int j=0;j<positions;j++){
			//System.out.println(uses[j]);
		}
		System.out.println("Falses "+falses);
	}
	
}
