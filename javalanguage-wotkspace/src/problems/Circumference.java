package problems;
import java.util.*;
public class Circumference {
    static double pi=3.14;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double circum=2*pi*r;
        System.out.println(circum);
    }
}
