package javaStudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=11,y=13;
		 if (x==2)
			 System.out.println("xは2です");
		 else if(x==1)
			 System.out.println("ｘは２ではないが１です");
		 else if(x<3)
			 System.out.println("xは２ではなく１でもないが、3未満です");
		 else
			 System.out.println("ｘは２ではなく１でもないし、３以上です");
		 if (x>y)
			 System.out.println(x);
		 else if (x<y)
			 System.out.println(y);
		 
		 int age=30;
		  if (age>=20 && age<30)
			  System.out.println("20代です");
		  else 
			  System.out.println("20代ではないです");
		  
		 int lan=100,mat=20;
		    if(lan<40 || mat<40) {
			 System.out.println("追試");
		  } else if(lan+mat>=160) {
		     System.out.println("優");
	      } else if(lan+mat>=140) {
		     System.out.println("良");
          } else if(lan+mat>=100){
		     System.out.println("可"); 
          } else
			  System.out.println("追試");
		  
			 
		  int z=2;
		     if(z%2==0) {
		    	System.out.println("偶数");
		    }else
		    	System.out.println("奇数");

			 
		  int v=-6;
		     if(v%2==0 && v>=0){
		    	 System.out.println("正の偶数");
		     }else if(v%2==1) {
		    	 System.out.println("正の奇数");
		     }else if(v%2==-1) {
		    	 System.out.println("負の奇数");
		     }else
		    	 System.out.println("負の偶数");
		
		
		   double weight=40,hight=1.80;
		   int n=2;
		     if(weight/((int)Math.pow(hight, n))>25) {
		    	 System.out.println("肥満");
		     }else if(18.5<weight/((int)Math.pow(hight, n)) && weight/((int)Math.pow(hight, n))<25){
		    	 System.out.println("標準");
		     }else
		    	 System.out.println("低体重");
		
		

	}

}
