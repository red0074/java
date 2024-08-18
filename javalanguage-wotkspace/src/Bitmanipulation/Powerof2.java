package Bitmanipulation;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0;i<32;i++){
            int bitmask=1<<i;
            if((bitmask & n)!=0)
                cnt++;
        }
//        System.out.println(cnt);
        if(cnt>1)
            System.out.println("not power of 2");
        else
            System.out.println("power of 2");
    }
}
