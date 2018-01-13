package ProblemB;

import java.util.Scanner;

public class scorify {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            int a,b,c;
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();

            if(a+b>c && b+c>a && a+c>b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}
