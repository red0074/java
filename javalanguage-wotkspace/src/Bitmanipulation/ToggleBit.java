package Bitmanipulation;

import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the postion:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int number=bitmask ^ n;
        System.out.println(number);
    }
}
