package javaStudy;

import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n=new Scanner(System.in);
		
		//���͂�������
		int number=n.nextInt();
		
		//�f�������肷��v���O�����ł�
		for(int n1=2;n1<number;n1++) {
			if(number%n1==0 || number==1) {
				System.out.println("�f���ł͂���܂���");
				return;
			}
		}
			System.out.println("�f���ł�");
		
		
			
		
		
		
		
		
		
		
		

	}

}
