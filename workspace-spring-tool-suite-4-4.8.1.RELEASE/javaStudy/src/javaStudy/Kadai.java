package javaStudy;

import java.util.Scanner;

public class Kadai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		
		//入力した数値
		int n=s1.nextInt();

		//加算した回数
		int additionNumber=0;
		
		//合計値
		int total=0;
		
		//加算した回数が入力した数値と同じになったら終了
//		for(int addition=0;addition!=n;addition++) {
//			additionNumber++;
//			total+=additionNumber;
//		}
		
		int addition=0;
		
		while(addition!=n) {
			additionNumber++;
			total+=additionNumber;
			addition++;
		}
		
		System.out.println("合計値："+total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
