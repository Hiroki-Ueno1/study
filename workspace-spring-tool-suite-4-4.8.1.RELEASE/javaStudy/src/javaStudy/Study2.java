package javaStudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=11,y=13;
		 if (x==2)
			 System.out.println("x��2�ł�");
		 else if(x==1)
			 System.out.println("���͂Q�ł͂Ȃ����P�ł�");
		 else if(x<3)
			 System.out.println("x�͂Q�ł͂Ȃ��P�ł��Ȃ����A3�����ł�");
		 else
			 System.out.println("���͂Q�ł͂Ȃ��P�ł��Ȃ����A�R�ȏ�ł�");
		 if (x>y)
			 System.out.println(x);
		 else if (x<y)
			 System.out.println(y);
		 
		 int age=30;
		  if (age>=20 && age<30)
			  System.out.println("20��ł�");
		  else 
			  System.out.println("20��ł͂Ȃ��ł�");
		  
		 int lan=100,mat=20;
		    if(lan<40 || mat<40) {
			 System.out.println("�ǎ�");
		  } else if(lan+mat>=160) {
		     System.out.println("�D");
	      } else if(lan+mat>=140) {
		     System.out.println("��");
          } else if(lan+mat>=100){
		     System.out.println("��"); 
          } else
			  System.out.println("�ǎ�");
		  
			 
		  int z=2;
		     if(z%2==0) {
		    	System.out.println("����");
		    }else
		    	System.out.println("�");

			 
		  int v=-6;
		     if(v%2==0 && v>=0){
		    	 System.out.println("���̋���");
		     }else if(v%2==1) {
		    	 System.out.println("���̊");
		     }else if(v%2==-1) {
		    	 System.out.println("���̊");
		     }else
		    	 System.out.println("���̋���");
		
		
		   double weight=40,hight=1.80;
		   int n=2;
		     if(weight/((int)Math.pow(hight, n))>25) {
		    	 System.out.println("�얞");
		     }else if(18.5<weight/((int)Math.pow(hight, n)) && weight/((int)Math.pow(hight, n))<25){
		    	 System.out.println("�W��");
		     }else
		    	 System.out.println("��̏d");
		
		

	}

}
