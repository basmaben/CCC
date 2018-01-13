package ProblemE;

import java.util.*;

public class scorify {

    static final int M = (int) 50;
    static long modularExponentiation(long x,long n)
    {
        if(n==0)
            return 1;
        else if(n%2 == 0)
            return modularExponentiation((x*x)%M,n/2);
        else
            return (x*modularExponentiation((x*x)%M,(n-1)/2))%M;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long d = in.nextInt();
            int[] a = new int[5];
            int[] b = new int[5];

            for (int j = 0; j < 5; j++)
                a[j] = in.nextInt();

            for (int j = 0; j < 5; j++)
                b[j] = in.nextInt();

            long Sum = 0;
            for (int j = 0; j < 5; j++)
                Sum += (a[j] * modularExponentiation(d, b[j]) % M);

            Sum = Sum%M;
            System.out.println(Sum);
        }
    }
}
