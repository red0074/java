package functinosandmethods;

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calculateProduct(a,b));
    }
    public static int calculateProduct(int a,int b){
        return a*b;
    }
}
