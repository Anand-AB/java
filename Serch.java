import java.util.*;
class  Serch
{
	public static void main(String args[])
	{
		int flag=-1;
		int ar[]={1,5,3,9,7};
		System.out.println("enter te no.for check and sort");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int b[]=new int[ar.length];
		//int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
			  {
			   flag=i;
			   //continue;
			   }
			   /*if(flag!=-1)
			   {
				b[k]=ar[i];
			    k++;
			   }*/
		}
		if(flag>=0)
		{
				System.out.println(" Number  in array");
				System.out.println(" Sorted array is");
				
				for(int i=0;i<b.length;i++)
				{
					for(int j=i+1;j<b.length;j++)
					{
						if(b[i]>b[j])
						{
							int tmp=b[i];
							b[i]=b[j];
							b[j]=tmp;
						}
					}
				}
			for(int i=0;i<b.length;i++)
            {
				System.out.print(b[i]+" ");
				
			}			
		}
		else
		 {
			System.out.println("Number not in Array");
			
		 }
	}
}