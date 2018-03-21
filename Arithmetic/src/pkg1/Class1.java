package pkg1;

public class Class1 
{
	
public int sum(int a,int b) // int a and b local
{
	int c;
	c=a+b;
	return c;
}

public int sub(int a,int b) // parameterized
{
 int c;
 c=a-b;
 return c;
}

public void multi(int a,int b)
{
	int c;
	c=a*b;
	System.out.println(c);
}
	public static void main(String[] args) 
	{
	Class1 ref=new Class1();
	int sum_result=ref.sum(10, 2);
	int sub_result=ref.sub(10, 2);
	ref.multi(sum_result, sub_result);
	}
}
