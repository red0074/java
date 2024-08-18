package Bitmanipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        int operation=sc.nextInt();
        //1 for set,0 for clear
        int bitmask=1<<pos;
        if(operation==1) {
            int num = bitmask | n;
            System.out.println(num);
        }else{
            int num=(~bitmask)&n;
            System.out.println(num);
        }
    }
}
