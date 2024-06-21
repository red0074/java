package functinosandmethods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n)){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
    public static boolean check(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}
