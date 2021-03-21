package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class attimuitehoiGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("これからあっちむいてホイゲームを始めます。");
		System.out.println("じゃんけんとあっちむいてホイの両方に勝つと、２ポイント入ります！");
		System.out.println("最後にコンピューターよりポイントが高ければ、ポイントアップチャンスに挑戦できます！");
		
		Random r=new Random();
		Random r2=new Random();
		Random r3=new Random();
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		Scanner s4=new Scanner(System.in);
		
		//じゃんけんの手
		String[] hand={"グー","パー","チョキ"};
		//あっちむいてホイの方向
		String[] direction= {"上","下","右","左"};
		//相手のポイント
		int youPoint=0;
		//自分のポイント
		int myPoint=0;
		
		for(int vs=1;vs<=5;vs++) {
			System.out.println("グー＝０，パー＝１、チョキ＝２");
			
			//相手のじゃんけんの手
			int youHand=r.nextInt(3);
			//自分のじゃんけんの手
			int myHand=s.nextInt(3);
			
			//自分がじゃんけんに負け
			if((myHand==2&&youHand==0)||(myHand==0&&youHand==1)||(myHand==1&&youHand==2)) {
				System.out.println("自分の手："+hand[myHand]+"vs"+"相手の手:"+hand[youHand]+"=負け");
				youPoint++;
				System.out.println("自分のポイント："+myPoint+"点&"+"相手のポイント："+youPoint+"点");
				
				//あっちむいてホイ
				System.out.println("あっちむいて...");
				System.out.println("上＝０，下＝１，右＝２，左＝３");
				
					//相手のあっちむいてほいの方向
					int youDirection=r2.nextInt(4);
					//自分のあっちむいてほいの手
					int myDirection=s2.nextInt(4);
					System.out.println("自分の方向："+direction[myDirection]+"vs"+"相手の手："+direction[youDirection]);
						if(myDirection==youDirection){
							System.out.println("はずれ！！相手の獲得ポイント２倍です！！");
						    youPoint++;  
						    System.out.println("相手のポイント："+youPoint+"点");
						   }
						else {
							System.out.println("セーフ！！");
						}
			}
			
			//あいこのとき
			else if(myHand==youHand){
				System.out.println("自分の手："+hand[myHand]+"vs"+"相手の手:"+hand[youHand]+"=あいこ");
				vs--;
			}
			
			//自分がじゃんけんに勝ち
			else {
				System.out.println("自分の手："+hand[myHand]+"vs"+"相手の手:"+hand[youHand]+"=勝ち");
				myPoint++;
				System.out.println("自分のポイント："+myPoint+"点&"+"相手のポイント："+youPoint+"点");
				
				//あっちむいてホイ
				System.out.println("あっちむいて...");
				System.out.println("上＝０，下＝１，右＝２，左＝３");
				
					//相手のあっちむいてほいの手
					int youDirection=r2.nextInt(4);
					//自分のあっちむいてほいの方向
					int myDirection=s2.nextInt(4);
					
					System.out.println("自分の手："+direction[myDirection]+"vs"+"相手の方向："+direction[youDirection]);
					
						if(myDirection==youDirection){
							System.out.println("当たり！！自分の獲得ポイント２倍です！！");
						    myPoint++;  
						    System.out.println("自分のポイント："+myPoint+"点");
						   }
						else {
							System.out.println("はずれ！！");
						   }
						
						
			 }
		}
					
						//結果発表
						System.out.println("総合結果");
						System.out.println("自分のポイント："+myPoint+"点");
						System.out.println("相手のポイント："+youPoint+"点");
					
					int roulette1=r3.nextInt(7);
					int roulette2=r3.nextInt(7);
					
					//ポイントアップチャンスに参加できる場合
					if(myPoint>youPoint) {
						System.out.println("ポイントアップチャンスにちょうせんしますか？");
						System.out.println("数字が２つ揃えばポイント２倍!!");
					    System.out.println("Yes=0,No=1");
					    int challenge=s3.nextInt(2);
					    
					    //Yesの場合
					    if(challenge==0) {
					    	System.out.println("ルーレットスタート！！！");
					    	if(roulette1==roulette2) {
					    		myPoint*=2;
					    		System.out.println("成功！！");
					    	}
					    	else {
					    		System.out.println("失敗...。");
					    	}
					    	System.out.println(roulette1+"と"+roulette2);
					        }
					    	
					  else if(challenge==1) {
					    		System.out.println("また挑戦してください！！");
					    	}
					  }
					
					  //ポイントアップチャンスに参加できない場合
					  else {
						  System.out.println("残念...。ポイントアップチャンスに挑戦できません。");
				      }
					
					System.out.println("総合ポイントは...");	
					System.out.println(myPoint+"点です！！");
		
		    
		
		
		
		
		
		
		
		
		
		
		

	}

}
