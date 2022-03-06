package dsaFeb2022;

public class Feb23BinarySearchToFindTarget {
	public static int binarySearch(char[] a, char c, int start, int end) {

		  int mid = (start + end) / 2;
		  if(a[mid] == c) {
		      //now search for the 'last' character of that value
		      while (mid+1<a.length && a[mid+1]==c) {
		          mid++;
		      }
		      return mid;
		  }
		  else if (start==end) {
		      //if no character of that value found
		      return -1;
		  }
		  else if (a[mid] < c) {
		      return binarySearch(a, c, mid+1, end);
		  }
		  else {
		      return binarySearch(a, c, start, mid);
		  }
		 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char a[] = {'a','b','c','d','p'};
	int size=a.length; int sart=0; char c='c';
	int result=binarySearch(a,c,sart,size);
	System.out.println(result);
	}
	

}
