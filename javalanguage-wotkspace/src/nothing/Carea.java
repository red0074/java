package nothing;

import java.util.Scanner;

public class Carea {
    public static void main(String args[])
    {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r=sc.nextInt();
        double area=pi*r*r;
        System.out.println("area of the circle for the radius "+r+"is "+area);
    }
}
