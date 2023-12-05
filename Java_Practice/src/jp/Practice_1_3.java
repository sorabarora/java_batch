package jp;

public class Practice_1_3 {
	
	public Practice_1_3()
	{
		System.out.println("Default Constructor");
	}
	
	public Practice_1_3(int a)
	{
		System.out.println("One Parameterized Constructor");
	}
	
	public Practice_1_3(int a,int b)
	{
		System.out.println("Two Parameterized Constructor");
	}
	
	public Practice_1_3(int a,int b,int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		Practice_1_3 p1=new Practice_1_3(10,20,30);
				
	}

}
