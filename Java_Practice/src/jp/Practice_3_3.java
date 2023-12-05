/* Using Method Call */

package jp;

public class Practice_3_3 {
	
	int a,b,c,d,e;
	
	public void assign_values(int x,int y,int z,int v,int h)
	{
		a=x;
		b=y;
		c=z;
		d=v;
		e=h;
	}
	
	public static void main(String[] args) {
		
		Practice_3_3 p3=new Practice_3_3();
		p3.assign_values(10, 20, 30, 40, 50);
		System.out.println(p3.a);
		System.out.println(p3.b);
		System.out.println(p3.c);
		System.out.println(p3.d);
		System.out.println(p3.e);
		
		/* For one object there are 6 calls. */
		/* For 10 objects there are 60 calls. */
		
	}
	
	

}
