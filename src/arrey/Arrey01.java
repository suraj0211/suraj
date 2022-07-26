package arrey;

public class Arrey01
{
   public static void main(String[] args)
   {     //declaration
	   int []arrey =new int[5];   //size of arrey is 5
	   //star index=0
	   //end index=size-1
	   System.out.println(arrey.length);
	   //initialization
	   arrey[0]=10;
	   arrey[1]=20;
	   arrey[2]=30;
	   arrey[3]=40;
	   arrey[4]=50;
	   
	   System.out.println(arrey[0]);
	   System.out.println(arrey[1]);
	   System.out.println(arrey[2]);
	   System.out.println(arrey[3]);
	   System.out.println(arrey[4]);
	   int space=1;
	   int count=1;
	   for(int i=4;i>0;i--)
	   {
		    for(int k=0;k<=space;k++)
		   {
			   System.out.print(" ");
		   }
		    for(int j=1;j<i;j++)
			   {
				    System.out.print(arrey[j]+count);
			   }
		   System.out.println(" ");
		   space++;
	   }
	   
   }
}
