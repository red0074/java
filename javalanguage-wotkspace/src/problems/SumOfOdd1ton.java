package problems;
import java.util.*;
public class SumOfOdd1ton {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        helper(n);
    }
    public static void helper(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
