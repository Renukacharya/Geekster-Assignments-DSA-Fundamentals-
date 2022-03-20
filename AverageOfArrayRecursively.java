package dsaMarch2022;

public class AverageOfArrayRecursively {
		static double avgRec(int a[], int i, int n)
	    {
	        if (i == n-1)
	            return a[i];
	        if (i == 0)
	            return ((a[i] + avgRec(a, i+1, n))/n);
	      
	        return (a[i] + avgRec(a, i+1, n));
	    }
	    static double average(int a[], int n)
	    {
	         return avgRec(a, 0, n);
	    }
	    public static void main (String[] args)
	    {
	        int arr[] = {1,2};
	        int n = arr.length;
	      
	        System.out.println(average(arr, n));

	}

}
