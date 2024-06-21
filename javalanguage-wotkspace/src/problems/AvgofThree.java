package problems;
import java.util.*;
public class AvgofThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(avg(a,b,c));
    }
    public static int avg(int a,int b,int c){
        int ans=(a+b+c)/3;
        return ans;
    }
}
