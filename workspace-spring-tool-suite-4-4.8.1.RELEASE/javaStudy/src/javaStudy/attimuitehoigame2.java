package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class attimuitehoigame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//					//����Ǝ����̎�
//					Random r=new Random();
//					Random r2=new Random();
//					Random r3=new Random();
//					Scanner s=new Scanner(System.in);
//					Scanner s2=new Scanner(System.in);
//					Scanner s3=new Scanner(System.in);
//					Scanner s4=new Scanner(System.in);
		
					//����񂯂�̎�
					String[] hand={"�O�[","�p�[","�`���L"};
					
					//�������ނ��ăz�C�̕���
					String[] direction= {"��","��","�E","��"};
					
					//����̃|�C���g
					int youPoint=0;
					
					//�����̃|�C���g
					int myPoint=0;


					//���[������
					rule();
					
					//����񂯂�J�n
					for(int vs=1;vs<=5;vs++) {
						hand();
					
						//����������񂯂�ɕ���
						myLose();


					}
	
					
					
					
		}
	
//					//����Ǝ����̎�
					static Random r=new Random();
//					Random r2=new Random();
//					Random r3=new Random();
					static Scanner s=new Scanner(System.in);
//					Scanner s2=new Scanner(System.in);
//					Scanner s3=new Scanner(System.in);
//					Scanner s4=new Scanner(System.in);
	
					//���[������
					static void rule() {
						System.out.println("���ꂩ�炠�����ނ��ăz�C�Q�[�����n�߂܂��B");
						System.out.println("����񂯂�Ƃ������ނ��ăz�C�̗����ɏ��ƁA�Q�|�C���g����܂��I");
						System.out.println("�Ō�ɃR���s���[�^�[���|�C���g��������΁A�|�C���g�A�b�v�`�����X�ɒ���ł��܂��I");
					}
					
					//����̂���񂯂�̎�
					static int youHand=r.nextInt(3);
					
					//�����̂���񂯂�̎�
					static int myHand=s.nextInt(3);
					
					//����񂯂�J�n
				 	static void hand() {
			 		    System.out.println("�O�[���O�C�p�[���P�A�`���L���Q");
			 		    
				 	}
				 	
					//����������񂯂�ɕ���
					static void myLose(){
						 if((myHand==2&&youHand==0)||(myHand==0&&youHand==1)||(myHand==1&&youHand==2)) {

						}
						
					}
					
					
					
					

				 	
}
