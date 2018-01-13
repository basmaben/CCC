package ProblemA;

import java.util.*;

public class scorify {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String s1,s2 ,t[]=new String[2] ;
            s1=in.next();
            s2=in.next();
           // System.out.println(t.toString());
            t=s1.split(" ");

            System.out.println("Bienvenue "+s1+" "+s2+" au CCC.");
        }

    }

}
