package javaStudy;

import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n=new Scanner(System.in);
		
		//入力した数字
		int number=n.nextInt();
		
		//素数か判定するプログラムです
		for(int n1=2;n1<number;n1++) {
			if(number%n1==0 || number==1) {
				System.out.println("素数ではありません");
				return;
			}
		}
			System.out.println("素数です");
		
		
			
		
		
		
		
		
		
		
		

	}

}
