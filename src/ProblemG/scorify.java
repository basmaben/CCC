package ProblemG;
import java.util.*;
public class scorify {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0;i<T;i++)
        {
            int n,q;
            n = in.nextInt();
           // q= in.nextInt();
            int a[]=new int[n];

            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }

            int b,ind=-1;
            q=in.nextInt();
            for(int j=0;j<q;j++)
            { ind=-1;
                b=in.nextInt();
                for(int k=0;k<n;k++)
                {
                    if(a[k]>=b)
                        ind=k;


                }
                if(j==n-1)
                System.out.println(ind);
            else
                System.out.print(ind+",");
            }
        }




    }


}
