package nothing;

import java.util.Scanner;

public class Primeornot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0 && n!=i)
               c++;
        }
        if(c==0)
        System.out.println("prime");
        else
            System.out.println("not");
    }
}
