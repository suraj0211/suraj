package arrey;

public class test_reverse_01 
{
	public static void main(String[] args)
	{
		
		int []a={10,20,30,40,50};
		
		System.out.println("size  "+a.length);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		int c;
		for(int j=0;j<=a.length;j++)
		{
			c=a[0]+a[1];
			System.out.println(c);
			a[0]=a[1];
			a[1]=c;
		}
	}

}
