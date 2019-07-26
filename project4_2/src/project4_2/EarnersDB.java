package project4_2;

import java.util.ArrayList;

public class EarnersDB {
	
	private ArrayList<Earner> list;
	
	public EarnersDB(){
		list=new ArrayList<Earner>();
	}
	
	public void addEarner(Earner item){
		list.add(item);
	}
	
	float sum=0;
	
	public void printPayroll(){
		for(int i=0;i<list.size();i++){
			System.out.println();
			sum=list.get(i).monSalary+sum;
			list.get(i).getInfo();
			list.get(i).initialize1();
		}
		System.out.println();
		System.out.println("Συνολικο ποσο μισθοδοσίας "+sum+" Ευρώ");
	}

}
