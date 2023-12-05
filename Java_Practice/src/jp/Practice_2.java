/* Normal Call */

package jp;

public class Practice_2 {
	
	int a,b,c,d,e;
	
	public static void main(String[] args) {
		
		Practice_2 p2=new Practice_2();
		p2.a=10;
		p2.b=20;
		p2.c=30;
		p2.d=40;
		p2.e=50;
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		System.out.println(p2.c);
		System.out.println(p2.d);
		System.out.println(p2.e);
		
		/* For one object there are 10 calls */
		/* For 10 objects there are 100 calls */
		
	}

}
