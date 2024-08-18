package Bitmanipulation;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        dectobin(n);

    }
    static void dectobin(int n){
        int temp=n;
        int ans=0;
        int place=1;
        while(temp>0)
        {
            int remainder=temp%2;
            ans+=place*remainder;
            place*=10;
            temp=temp/2;
        }
        System.out.println(ans);
        bintodec(ans);
    }
    static void bintodec(int bin){
        int temp=bin;
        int number=0;

        int i=0;
        while(temp>0){
            int tem=temp%10;
            int place=(int)Math.pow(2,i);
            number+=(tem*place);
            temp=temp/10;
            i++;
        }
        System.out.println(number);
    }
}
