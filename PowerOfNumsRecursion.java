package dsaMarch2022;

public class PowerOfNumsRecursion {
	static long power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
  
    public static void main(String[] args)
    {
        int N = 2;
        int P = 33;
  
        System.out.println(power(N, P));
    }
}
