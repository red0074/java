package functinosandmethods;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n)){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }
    public static boolean check(int n){

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}
