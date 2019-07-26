package project4_2;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		EarnersDB list=new EarnersDB();
		WageEarner em1=new WageEarner("Νικολάου Γιώργος",0,0,1000,0,0);
		RateEarner em2=new RateEarner("Δημητρίου Δημήτρης",0,0,0,0);
		
		em2.setPososto((float) 0.05);
		
		em1.sal(false, 1, 0, 0);
		em1.sal(false, 0, 3000, 0);
		em1.sal(false, 2, 0, 0);
		em1.sal(false, 0, 0, 1);
		em1.sal(false, 0, 4000, 0);
		em1.sal(true,0,0,0);
		
		em2.sal(false, 0, 2000);
		em2.sal(false, 2, 0);
		em2.sal(false, 0, 1000);
		em2.sal(false, 0, 4000);
		em2.sal(false, 2, 0);
		em2.sal(false, 0, 4000);
		em2.sal(true, 0, 0);
		
		list.addEarner(em1);
		list.addEarner(em2);
		
		list.printPayroll();
		
		
		
	}

}
