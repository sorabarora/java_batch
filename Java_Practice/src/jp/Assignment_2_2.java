/* (((((10*2)-2)+2)-2)/2) */

package jp;

public class Assignment_2_2 {
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("The result is "+c);
	}
	
	public static void main(String[] args) {
		
		Assignment_2_2 a2=new Assignment_2_2();
		int mul_result=a2.mul(10, 2);
		int sub_result=a2.sub(mul_result, 2);
		int sum_reult=a2.sum(sub_result, 2);
		int sub_result1=a2.sub(sum_reult, 2);
		a2.div(sub_result1, 2);
		
		
		
	}

}
