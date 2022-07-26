package arrey;

public class Revers_the_number 
{ 
	public static void main(String[] args) {
		int str01[]= {1,2,9,4,8,5,4,3};
		
		for(int i=0;i<str01.length;i++)
		{
			for(int j=i+1;j<str01.length;j++)
			{
				int a = 0;
			if(str01[i]>str01[j])
				{
				a=str01[i];
			    str01[i]=str01[j];
			    str01[j]=a;
				}
			    
			}
			System.out.print(str01[i]);
			//a=str01[i];
		//System.out.print(a);
		
	}
	}
}


