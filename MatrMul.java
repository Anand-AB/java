import java.util.*;
 public class MatrMul{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);   
  System.out.println("no.of First Array rows and coloumn is:");
   int m=s.nextInt();
   int n=s.nextInt();
   int ary1[][]=new int[n][m];
   for(int i=0;i<n;i++)
   {
  
     for(int j=0;j<m;j++)
    {
			System.out.print("Enter the "+i+" "+j+" Element");
			ary1[i][j]=s.nextInt();
		}
  }
  System.out.println("no.of Second  coloumn is:");
   int k=s.nextInt();
   int ary2[][]=new int[m][k];
   for(int i=0;i<m;i++)
   {
  
     for(int j=0;j<k;j++)
    {
			System.out.print("Enter the "+i+" "+j+" Element");
			ary2[i][j]=s.nextInt();
		}
  }
}
}