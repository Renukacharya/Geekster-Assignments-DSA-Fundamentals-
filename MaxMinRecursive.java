package dsaMarch2022;

public class MaxMinRecursive {
	public static int findMinRec(int A[], int n)
    {
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinRec(A, n-1));
    }
	public static int findMaxRec(int A[], int n)
    {
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMaxRec(A, n-1));
    }
     
    // Driver code
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        System.out.println(findMinRec(A, n));
        System.out.println(findMaxRec(A, n));
    }
}
