/* Using Constructor Call */

package jp;

public class Practice_4_3 {
	
	int a,b,c,d,e;
	
	public Practice_4_3(int x,int y,int z,int v,int h)
	{
		a=x;
		b=y;
		c=z;
		d=v;
		e=h;
		
	}
	
	public static void main(String[] args) {
		
		Practice_4_3 p4=new Practice_4_3(10, 20, 30, 40, 50);
		System.out.println(p4.a);
		System.out.println(p4.b);
		System.out.println(p4.c);
		System.out.println(p4.d);
		System.out.println(p4.e);
		
		/* For one object there are 5 calls. */
		/* For 10 objects there are 50 calls. */
		/* So with the use of constructor we reduces the lines of code */
		
	}

}
