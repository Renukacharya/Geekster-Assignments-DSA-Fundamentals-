package dsaFeb2022;

public class Feb28SortArray {
	public static void sort(int[] a, int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {1,3,2,4,5,2,7,2,8};
		int size=a.length;
		sort(a,size);
		for(int i=0;i<size-1;i++) {
			System.out.print(a[i]+" ");
		}
	
}
}
	
