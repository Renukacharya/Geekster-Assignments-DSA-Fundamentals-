package dsaMarch2022;

public class MergeSortAscendingOrder {
	public static void merge(int[] a, int si,int mid, int ei) {
		int merged[] = new int[ei-si+1];
		
		int i1=si, i2=mid+1, x=0;
		while(i1<=mid && i2<=ei) {
			if(a[i1] <= a[i2]) {
				merged[x++] = a[i1++];
			}
			else {
				merged[x++] = a[i2++];
			}
		}
		while(i1 <= mid) {
			merged[x++] = a[i1++];
		}
		while(i2 <= ei) {
			merged[x++] = a[i2++];
		}
		for(int i=0,j=si; i<merged.length; i++,j++) {
			a[j] = merged[i];
		}
	}
	public static void divide(int[] arr, int si, int ei) {
		if(si>=ei) { return; }
		int mid= si+ (ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		merge(arr, si,mid, ei);
	}
	public static void printA(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,31,2,12,3,1,2,4,435,34,5342,345,345,345,34,5,3,2,2};
		int si=0,ei=arr.length-1;
		divide(arr,si,ei);
		printA(arr);

	}

}
