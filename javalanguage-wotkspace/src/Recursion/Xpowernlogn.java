package Recursion;

import java.util.Scanner;

public class Xpowernlogn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number X: ");
        int x=sc.nextInt();
        System.out.println("Enter the number N: ");
        int n=sc.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }
    static int power(int x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2 ==0)
            return power(x,n/2)*power(x,n/2);
        else
            return power(x,n/2)*power(x,n/2)*x;
    }
}
