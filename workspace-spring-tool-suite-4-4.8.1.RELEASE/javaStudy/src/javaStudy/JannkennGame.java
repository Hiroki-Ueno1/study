package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class JannkennGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���[������
		System.out.println("�O���O�[�A�P���`���L�A�Q���p�[");
		
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
			String[] names= {"�O�[","�`���L","�p�["};
			
			
//			while(true) {   
//				int youHand=r.nextInt(3);   //����̎�
//				int myHand=s.nextInt();    //�����̎�
//				
//				
//				//�����̏���
//				if((myHand==0&&youHand==2)||(myHand==1&&youHand==0)||(myHand==2&&youHand==1)) {
//					System.out.println("����");
//					System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
//					break;
//				}
//				
//				//�������̏���
//				else if(myHand==youHand) {
//					System.out.println("������");
//					System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
//				}
//				
//				//�����̏���
//				else {
//					System.out.println("����");
//					System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
//					break;
//				}
//				
//			}
			  
			
			  int youWin=0;   //����̏�����
			  int myWin=0;    //�����̏�����
			  
			  //�ǂ��炩3��������I��
			  while(myWin<3  && youWin<3) {
				  
				  int youHand=r.nextInt(3);   //����̎�
                  int myHand=s.nextInt();    //�����̎�
                  
                  
                  
                  
				    //�����������̏���
					if((myHand==0&&youHand==2)||(myHand==1&&youHand==0)||(myHand==2&&youHand==1)) {
						System.out.println("����");
						System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
						youWin++;
//						System.out.println("����"+myWin+"��"+"����"+youWin+"��");
					} 
					
					//�������̏���
				    else if(myHand==youHand) {
					    System.out.println("������");
						System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
//						System.out.println("����"+myWin+"��"+"����"+youWin+"��");	
					}
					
					//�����̏���
					else {
						System.out.println("����");
						System.out.println("�����̎�"+names[myHand]+"vs"+"����̎�"+names[youHand]);
						myWin++;
					}
					
					System.out.println("����"+myWin+"��"+"����"+youWin+"��");
			  }
			
			  
				  Random n =new Random();
					
					int lot=n.nextInt(4);
					
					if(myWin==3) {
						if(lot==0) {
							System.out.println("��g");
						}
						else if(lot==1) {
							System.out.println("�g");
						}
						else if(lot==2) {
							System.out.println("���g");
						}
						else {
							System.out.println("���g");
						}
					}
					   
					
					
			
			
			
			
			
			
			
			
			
		
	}

}
