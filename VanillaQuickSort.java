package dsaMarch2022;

public class VanillaQuickSort {
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	static void Vanilla1QuickSort(int[] arr,
	                               int low, int high)
	{
	    if (low < high)
	    {
	        int[] piv;
	        piv = partition(arr, low, high);
	         
	        Vanilla1QuickSort(arr, low, piv[0] - 1);
	        Vanilla1QuickSort(arr, piv[0] + 1, piv[1] - 1);
	        Vanilla1QuickSort(arr, piv[1] + 1, high);
	    }
	}
	 
	static int[] partition(int[] arr, int low, int high)
	{
	    if (arr[low] > arr[high])
	        swap(arr, low, high);
	         
	    int j = low + 1;
	    int g = high - 1, k = low + 1,
	        p = arr[low], q = arr[high];
	         
	    while (k <= g)
	    {
	        if (arr[k] < p)
	        {
	            swap(arr, k, j);
	            j++;
	        }
	         
	        else if (arr[k] >= q)
	        {
	            while (arr[g] > q && k < g)
	                g--;
	                 
	            swap(arr, k, g);
	            g--;
	             
	            if (arr[k] < p)
	            {
	                swap(arr, k, j);
	                j++;
	            }
	        }
	        k++;
	    }
	    j--;
	    g++;
	    swap(arr, low, j);
	    swap(arr, high, g);
	    return new int[] { j, g };
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int[] arr = { 24, 8, 42, 75, 29, 77, 38, 57 };
	     
	    Vanilla1QuickSort(arr, 0, 7);
	     
	    System.out.print("Sorted array: ");
	    for (int i = 0; i < 8; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}
	}
	

