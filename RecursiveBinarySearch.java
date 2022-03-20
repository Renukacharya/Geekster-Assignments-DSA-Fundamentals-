package dsaMarch2022;

public class RecursiveBinarySearch {
	static int bin(int[] arr, int s,int e) {
		int target=5;
		int mid=(s+e)/2;		
		if(arr[mid]==target) return mid;
		else if(target>arr[mid]) return bin(arr, mid+1, e);
		else bin(arr,s,mid);
	return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,6,7,8};
		int s=0, e=arr.length-1;
		int result= bin(arr,s,e);
		System.out.println(result);

	}

}
