package nothing;

import java.util.Scanner;

public class EvenorOdd_if_else {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}