package Recursion;

import java.util.Scanner;

public class Towerofhanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n=sc.nextInt();
        solve(n,"S","H","D");
    }
    static void solve(int n,String src,String hel,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        solve(n-1,src,dest,hel);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        solve(n-1,hel,src,dest);
    }
}
