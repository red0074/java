package problems;
import java.util.*;
public class Xpowern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        solve(x,n);
    }
    public static void solve(int x,int n){
        long ans=1;
        for (int i=1;i<=n;i++){
            ans*=x;
        }
        System.out.println(ans);
    }
}
