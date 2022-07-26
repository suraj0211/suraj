package arrey;

public class decremental_array {
	public static void main(String[] args)
	{
		int a[]= {10,20,5,4,60,8,1,45,425,200,102};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
			int temp = 0;
			
				if( a[i]<a[j])
			{
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				
			}
			}
			System.out.println(a[i]);
			
		}
	}

}
