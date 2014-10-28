 public class MixMatch{
  public static void main(String args[]){
   int ary1[]={1,2,3,4,5,6};
   int ary2[]={7,15,9,10,11};
   System.out.println("First Array is:");
   for(int i=0;i<ary1.length;i++)
   {
		System.out.print(ary1[i]+" ");
   
   }
   System.out.println("\nSecond Array is:");
   for(int i=0;i<ary2.length;i++)
   {
		System.out.print(ary2[i]+" ");
   
   }
   System.out.println("\nMix Match Array is:");
   
   for(int i=0;i<ary2.length;i++)
   {
		if((i+1)%2!=0)
			System.out.print(ary1[i]+" ");
		else
			System.out.print(ary2[i]+" ");
   }
  }
}