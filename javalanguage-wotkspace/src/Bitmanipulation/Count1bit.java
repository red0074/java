package Bitmanipulation;

import java.util.Scanner;

public class Count1bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0;i<32;i++){
            if(((1<<i)& n)!=0 )
                cnt++;
        }
        System.out.println(cnt);
    }
}
