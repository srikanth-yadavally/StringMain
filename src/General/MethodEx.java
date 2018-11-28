package General;


public class MethodEx 
{
	public void avinash1()
	{
		System.out.println("hii");
	}
	
	
	public void avinash(float h)
	{
		System.out.println(h);
	}
	
	
	
	public static void avinash2(int age)
	{
		System.out.println(age);
	}
	
	public boolean c(int a,int b)
	{
		if(a<b)
		{
			System.out.println("a is bigger");
			return true;
		}
		else
		{
			System.out.println("b is bigger");
		}
		return false;
	}
	
	
	
	public static void avinash3()
	{
		System.out.println("empty");
	}

	public static void main(String[] args) 
	{
		MethodEx ref=new MethodEx();
		ref.avinash1();
		ref.avinash(5.9f);
		MethodEx.avinash2(24);
		MethodEx.avinash3();
		ref.c(20, 30);
		/*ref.avinash2(28);
		ref.avinash3();*/
		
	}

}
