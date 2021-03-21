package javaStudy;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		System.out.println(heikin(4,8));
		
		//2
		System.out.println(nijou(6));
		
		//3
		System.out.println(max(22,10,8));
	
		
	}
	
	//1
	static int heikin(int x,int z) {
		int number=(x+z)/2;
		return number;
	}
	
	//2
	static int nijou(int y) {
		int number2=y*y;
		return number2;
	}
	
	//3
	static int max(int a,int b,int c) {
		int number3;
		if(a>b && a>c) {
			number3=a;
		}
		
		else if(b>a && b>c) {
			number3=b;
		}
		
		else {
			number3=c;
		}
			
		return number3;
	}
	
	
	

}
