package javaStudy;

import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n=new Scanner(System.in);
		
		//“ü—Í‚µ‚½”š
		int number=n.nextInt();
		
		//‘f”‚©”»’è‚·‚éƒvƒƒOƒ‰ƒ€‚Å‚·
		for(int n1=2;n1<number;n1++) {
			if(number%n1==0 || number==1) {
				System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
				return;
			}
		}
			System.out.println("‘f”‚Å‚·");
		
		
			
		
		
		
		
		
		
		
		

	}

}
