package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class attimuitehoiGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���ꂩ�炠�����ނ��ăz�C�Q�[�����n�߂܂��B");
		System.out.println("����񂯂�Ƃ������ނ��ăz�C�̗����ɏ��ƁA�Q�|�C���g����܂��I");
		System.out.println("�Ō�ɃR���s���[�^�[���|�C���g��������΁A�|�C���g�A�b�v�`�����X�ɒ���ł��܂��I");
		
		Random r=new Random();
		Random r2=new Random();
		Random r3=new Random();
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		Scanner s4=new Scanner(System.in);
		
		//����񂯂�̎�
		String[] hand={"�O�[","�p�[","�`���L"};
		//�������ނ��ăz�C�̕���
		String[] direction= {"��","��","�E","��"};
		//����̃|�C���g
		int youPoint=0;
		//�����̃|�C���g
		int myPoint=0;
		
		for(int vs=1;vs<=5;vs++) {
			System.out.println("�O�[���O�C�p�[���P�A�`���L���Q");
			
			//����̂���񂯂�̎�
			int youHand=r.nextInt(3);
			//�����̂���񂯂�̎�
			int myHand=s.nextInt(3);
			
			//����������񂯂�ɕ���
			if((myHand==2&&youHand==0)||(myHand==0&&youHand==1)||(myHand==1&&youHand==2)) {
				System.out.println("�����̎�F"+hand[myHand]+"vs"+"����̎�:"+hand[youHand]+"=����");
				youPoint++;
				System.out.println("�����̃|�C���g�F"+myPoint+"�_&"+"����̃|�C���g�F"+youPoint+"�_");
				
				//�������ނ��ăz�C
				System.out.println("�������ނ���...");
				System.out.println("�ぁ�O�C�����P�C�E���Q�C�����R");
				
					//����̂������ނ��Ăق��̕���
					int youDirection=r2.nextInt(4);
					//�����̂������ނ��Ăق��̎�
					int myDirection=s2.nextInt(4);
					System.out.println("�����̕����F"+direction[myDirection]+"vs"+"����̎�F"+direction[youDirection]);
						if(myDirection==youDirection){
							System.out.println("�͂���I�I����̊l���|�C���g�Q�{�ł��I�I");
						    youPoint++;  
						    System.out.println("����̃|�C���g�F"+youPoint+"�_");
						   }
						else {
							System.out.println("�Z�[�t�I�I");
						}
			}
			
			//�������̂Ƃ�
			else if(myHand==youHand){
				System.out.println("�����̎�F"+hand[myHand]+"vs"+"����̎�:"+hand[youHand]+"=������");
				vs--;
			}
			
			//����������񂯂�ɏ���
			else {
				System.out.println("�����̎�F"+hand[myHand]+"vs"+"����̎�:"+hand[youHand]+"=����");
				myPoint++;
				System.out.println("�����̃|�C���g�F"+myPoint+"�_&"+"����̃|�C���g�F"+youPoint+"�_");
				
				//�������ނ��ăz�C
				System.out.println("�������ނ���...");
				System.out.println("�ぁ�O�C�����P�C�E���Q�C�����R");
				
					//����̂������ނ��Ăق��̎�
					int youDirection=r2.nextInt(4);
					//�����̂������ނ��Ăق��̕���
					int myDirection=s2.nextInt(4);
					
					System.out.println("�����̎�F"+direction[myDirection]+"vs"+"����̕����F"+direction[youDirection]);
					
						if(myDirection==youDirection){
							System.out.println("������I�I�����̊l���|�C���g�Q�{�ł��I�I");
						    myPoint++;  
						    System.out.println("�����̃|�C���g�F"+myPoint+"�_");
						   }
						else {
							System.out.println("�͂���I�I");
						   }
						
						
			 }
		}
					
						//���ʔ��\
						System.out.println("��������");
						System.out.println("�����̃|�C���g�F"+myPoint+"�_");
						System.out.println("����̃|�C���g�F"+youPoint+"�_");
					
					int roulette1=r3.nextInt(7);
					int roulette2=r3.nextInt(7);
					
					//�|�C���g�A�b�v�`�����X�ɎQ���ł���ꍇ
					if(myPoint>youPoint) {
						System.out.println("�|�C���g�A�b�v�`�����X�ɂ��傤���񂵂܂����H");
						System.out.println("�������Q�����΃|�C���g�Q�{!!");
					    System.out.println("Yes=0,No=1");
					    int challenge=s3.nextInt(2);
					    
					    //Yes�̏ꍇ
					    if(challenge==0) {
					    	System.out.println("���[���b�g�X�^�[�g�I�I�I");
					    	if(roulette1==roulette2) {
					    		myPoint*=2;
					    		System.out.println("�����I�I");
					    	}
					    	else {
					    		System.out.println("���s...�B");
					    	}
					    	System.out.println(roulette1+"��"+roulette2);
					        }
					    	
					  else if(challenge==1) {
					    		System.out.println("�܂����킵�Ă��������I�I");
					    	}
					  }
					
					  //�|�C���g�A�b�v�`�����X�ɎQ���ł��Ȃ��ꍇ
					  else {
						  System.out.println("�c�O...�B�|�C���g�A�b�v�`�����X�ɒ���ł��܂���B");
				      }
					
					System.out.println("�����|�C���g��...");	
					System.out.println(myPoint+"�_�ł��I�I");
		
		    
		
		
		
		
		
		
		
		
		
		
		

	}

}
