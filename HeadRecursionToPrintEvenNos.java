package dsaMarch2022;

public class HeadRecursionToPrintEvenNos {
	static void Even(int arr[], int i){
		if (i < 0)
		{
		return;
		}
		if ((arr[i]) % 2 == 0)
		{
		System.out.print(arr[i]+" ");
		}
		Even(arr, i - 1);
		}
		public static void main (String[] args){
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;
		
		Even(arr, n - 1);
		}
}