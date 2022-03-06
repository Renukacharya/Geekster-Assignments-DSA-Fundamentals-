package dsaFeb2022;

public class Feb23SmallestMissingElementInArr {
	public static int smallest(int[] a,int size) {
		int flag;
		for(int i=1;i<size+1;i++) {
			flag=0;
			for(int j=0;j<size;j++) {
				if(a[j]==i) {
					flag=1;
					break;
				}
			}
			if(flag==0) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,5,4,3,2,2,5,3,5,7,6};
		int size=a.length;
		int result=smallest(a, size);
		System.out.println(result);

	}

}
