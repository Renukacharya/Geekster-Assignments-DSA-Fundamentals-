package dsaFeb2022;

public class Feb23FrequencyOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,1,2,12,1,2,1,1,1,11};
		int count=0;
		int target=1;
		for(int x:a) {
			if(x==target)
				count++;
		}
		System.out.println(count);
		}

}
