package nothing;

import java.util.Scanner;

public class Basictable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+" * 1 = "+(n*1));
        System.out.println(n+" * 2 = "+(n*2));
        System.out.println(n+" * 3 = "+(n*3));
        System.out.println(n+" * 4 = "+(n*4));
        System.out.println(n+" * 5 = "+(n*5));
        System.out.println(n+" * 6 = "+(n*6));
        System.out.println(n+" * 7 = "+(n*7));
        System.out.println(n+" * 8 = "+(n*8));
        System.out.println(n+" * 9 = "+(n*9));
        System.out.println(n+" * 10 = "+(n*10));
        //using loops
        for (int i=1;i<11;i++){
            System.out.println(n+"* "+i+"="+(n*i));
        }

    }
}
