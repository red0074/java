package functinosandmethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
    public static  void printFactorial(int n){
        if(n<0){
            System.out.println("invalid");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
