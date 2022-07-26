package arrey;

public class String_arrey 
{
	public static void main(String[] args)
	{
		int ar[]=new int[5];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		System.out.println(ar[0]);
		System.out.println(ar.length);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("i"+ ar[i]);
			System.out.println(ar.length);

		}
		
		for(int i=4;i>=0;i--)
		{
			System.out.println("i"+ ar[i]);
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
		
		{
			String ar1[]=new String[5];
		
		ar1[0]="suraj";
		ar1[1]="pravin";
		ar1[2]="sujoy";
		ar1[3]="mahesh";
		ar1[4]="sushant";
		System.out.println(ar1[0]);
		System.out.println(ar1.length);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("i"+ ar1[i]);
		}
		
		for(int i=4;i>=0;i--)
		{
			System.out.println("i"+ ar1[i]);
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(ar1[i]);
		}
		
	}

}
}
