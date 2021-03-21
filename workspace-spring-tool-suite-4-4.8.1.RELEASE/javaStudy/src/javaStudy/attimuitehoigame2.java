package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class attimuitehoigame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//					//相手と自分の手
//					Random r=new Random();
//					Random r2=new Random();
//					Random r3=new Random();
//					Scanner s=new Scanner(System.in);
//					Scanner s2=new Scanner(System.in);
//					Scanner s3=new Scanner(System.in);
//					Scanner s4=new Scanner(System.in);
		
					//じゃんけんの手
					String[] hand={"グー","パー","チョキ"};
					
					//あっちむいてホイの方向
					String[] direction= {"上","下","右","左"};
					
					//相手のポイント
					int youPoint=0;
					
					//自分のポイント
					int myPoint=0;


					//ルール説明
					rule();
					
					//じゃんけん開始
					for(int vs=1;vs<=5;vs++) {
						hand();
					
						//自分がじゃんけんに負け
						myLose();


					}
	
					
					
					
		}
	
//					//相手と自分の手
					static Random r=new Random();
//					Random r2=new Random();
//					Random r3=new Random();
					static Scanner s=new Scanner(System.in);
//					Scanner s2=new Scanner(System.in);
//					Scanner s3=new Scanner(System.in);
//					Scanner s4=new Scanner(System.in);
	
					//ルール説明
					static void rule() {
						System.out.println("これからあっちむいてホイゲームを始めます。");
						System.out.println("じゃんけんとあっちむいてホイの両方に勝つと、２ポイント入ります！");
						System.out.println("最後にコンピューターよりポイントが高ければ、ポイントアップチャンスに挑戦できます！");
					}
					
					//相手のじゃんけんの手
					static int youHand=r.nextInt(3);
					
					//自分のじゃんけんの手
					static int myHand=s.nextInt(3);
					
					//じゃんけん開始
				 	static void hand() {
			 		    System.out.println("グー＝０，パー＝１、チョキ＝２");
			 		    
				 	}
				 	
					//自分がじゃんけんに負け
					static void myLose(){
						 if((myHand==2&&youHand==0)||(myHand==0&&youHand==1)||(myHand==1&&youHand==2)) {

						}
						
					}
					
					
					
					

				 	
}
