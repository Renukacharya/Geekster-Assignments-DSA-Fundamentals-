package dsaMarch2022;

public class ReverseArrayUsingRecursion {
	public static void reverseArray(int i, int n, int [] arr)
	{
	   if(i==n)
	   {
	     return ;
	   } 
	   else
	   {
	     reverseArray(i+1, n, arr);
	     System.out.print(arr[i]+" ");
	   }
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6};
		int n= arr.length;
		int i=0;
		reverseArray(i, n, arr);
	}

}
