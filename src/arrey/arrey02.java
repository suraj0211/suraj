package arrey;

public class arrey02 {
	public static void main(String[] args) {
	//declaration and initialization
	int []arrey= {10,20,30,40,50};
	
	int size=arrey.length;
	
	System.out.println(size);
	 
	int space=4;
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(+ (arrey[i]));
		}
		System.out.println();
		space--;
	}
	
	int spac=4;
	for(int i=4;i>0;i--)
	{
		
		for(int j=0;j<=i;j++)
		{
			System.out.print(+ (arrey[i]));
		}
		for(int k=1;k<=spac
				;k++)
		{
			
			System.out.print(" ");
		}
		System.out.println();
		spac++;
		
	}
	
	
	}
}
