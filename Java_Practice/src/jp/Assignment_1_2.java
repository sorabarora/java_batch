/* (((((10+2)+2)-2)*2)/2)  */

package jp;

public class Assignment_1_2 {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("The result is "+c);
		
	}
	
	
	public static void main(String[] args) {
		
		Assignment_1_2 a1=new Assignment_1_2();
		int sum_result=a1.sum(10, 2);
		int sum_result1=a1.sum(sum_result, 2);
		int sub_result=a1.sub(sum_result1, 2);
		int mul_result=a1.mul(sub_result, 2);
		a1.div(mul_result, 2);		
		
	}

}
