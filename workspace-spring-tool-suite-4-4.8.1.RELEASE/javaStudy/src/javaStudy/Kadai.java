package javaStudy;

import java.util.Scanner;

public class Kadai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		
		//���͂������l
		int n=s1.nextInt();

		//���Z������
		int additionNumber=0;
		
		//���v�l
		int total=0;
		
		//���Z�����񐔂����͂������l�Ɠ����ɂȂ�����I��
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
		
		System.out.println("���v�l�F"+total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
