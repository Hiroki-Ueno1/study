package javaStudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=11,y=13;
		 if (x==2)
			 System.out.println("x‚Í2‚Å‚·");
		 else if(x==1)
			 System.out.println("‚˜‚Í‚Q‚Å‚Í‚È‚¢‚ª‚P‚Å‚·");
		 else if(x<3)
			 System.out.println("x‚Í‚Q‚Å‚Í‚È‚­‚P‚Å‚à‚È‚¢‚ªA3–¢–ž‚Å‚·");
		 else
			 System.out.println("‚˜‚Í‚Q‚Å‚Í‚È‚­‚P‚Å‚à‚È‚¢‚µA‚RˆÈã‚Å‚·");
		 if (x>y)
			 System.out.println(x);
		 else if (x<y)
			 System.out.println(y);
		 
		 int age=30;
		  if (age>=20 && age<30)
			  System.out.println("20‘ã‚Å‚·");
		  else 
			  System.out.println("20‘ã‚Å‚Í‚È‚¢‚Å‚·");
		  
		 int lan=100,mat=20;
		    if(lan<40 || mat<40) {
			 System.out.println("’ÇŽŽ");
		  } else if(lan+mat>=160) {
		     System.out.println("—D");
	      } else if(lan+mat>=140) {
		     System.out.println("—Ç");
          } else if(lan+mat>=100){
		     System.out.println("‰Â"); 
          } else
			  System.out.println("’ÇŽŽ");
		  
			 
		  int z=2;
		     if(z%2==0) {
		    	System.out.println("‹ô”");
		    }else
		    	System.out.println("Šï”");

			 
		  int v=-6;
		     if(v%2==0 && v>=0){
		    	 System.out.println("³‚Ì‹ô”");
		     }else if(v%2==1) {
		    	 System.out.println("³‚ÌŠï”");
		     }else if(v%2==-1) {
		    	 System.out.println("•‰‚ÌŠï”");
		     }else
		    	 System.out.println("•‰‚Ì‹ô”");
		
		
		   double weight=40,hight=1.80;
		   int n=2;
		     if(weight/((int)Math.pow(hight, n))>25) {
		    	 System.out.println("”ì–ž");
		     }else if(18.5<weight/((int)Math.pow(hight, n)) && weight/((int)Math.pow(hight, n))<25){
		    	 System.out.println("•W€");
		     }else
		    	 System.out.println("’á‘Ìd");
		
		

	}

}
