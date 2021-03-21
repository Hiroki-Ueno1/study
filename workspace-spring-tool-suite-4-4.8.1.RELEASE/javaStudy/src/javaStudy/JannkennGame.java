package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class JannkennGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ルール説明
		System.out.println("０＝グー、１＝チョキ、２＝パー");
		
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
			String[] names= {"グー","チョキ","パー"};
			
			
//			while(true) {   
//				int youHand=r.nextInt(3);   //相手の手
//				int myHand=s.nextInt();    //自分の手
//				
//				
//				//負けの処理
//				if((myHand==0&&youHand==2)||(myHand==1&&youHand==0)||(myHand==2&&youHand==1)) {
//					System.out.println("負け");
//					System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
//					break;
//				}
//				
//				//あいこの処理
//				else if(myHand==youHand) {
//					System.out.println("あいこ");
//					System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
//				}
//				
//				//勝ちの処理
//				else {
//					System.out.println("勝ち");
//					System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
//					break;
//				}
//				
//			}
			  
			
			  int youWin=0;   //相手の勝ち回数
			  int myWin=0;    //自分の勝ち回数
			  
			  //どちらか3勝したら終了
			  while(myWin<3  && youWin<3) {
				  
				  int youHand=r.nextInt(3);   //相手の手
                  int myHand=s.nextInt();    //自分の手
                  
                  
                  
                  
				    //自分が負けの処理
					if((myHand==0&&youHand==2)||(myHand==1&&youHand==0)||(myHand==2&&youHand==1)) {
						System.out.println("負け");
						System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
						youWin++;
//						System.out.println("自分"+myWin+"勝"+"相手"+youWin+"勝");
					} 
					
					//あいこの処理
				    else if(myHand==youHand) {
					    System.out.println("あいこ");
						System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
//						System.out.println("自分"+myWin+"勝"+"相手"+youWin+"勝");	
					}
					
					//勝ちの処理
					else {
						System.out.println("勝ち");
						System.out.println("自分の手"+names[myHand]+"vs"+"相手の手"+names[youHand]);
						myWin++;
					}
					
					System.out.println("自分"+myWin+"勝"+"相手"+youWin+"勝");
			  }
			
			  
				  Random n =new Random();
					
					int lot=n.nextInt(4);
					
					if(myWin==3) {
						if(lot==0) {
							System.out.println("大吉");
						}
						else if(lot==1) {
							System.out.println("吉");
						}
						else if(lot==2) {
							System.out.println("中吉");
						}
						else {
							System.out.println("小吉");
						}
					}
					   
					
					
			
			
			
			
			
			
			
			
			
		
	}

}
