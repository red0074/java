package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==1 || n==0)
            return 1;
        return n*fact(n-1);
    }
}
