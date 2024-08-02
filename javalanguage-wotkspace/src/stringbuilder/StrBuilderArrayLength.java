package stringbuilder;
import java.util.*;
public class StrBuilderArrayLength {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings : ");
        int n=sc.nextInt();
        System.out.println("Enter the names: ");
        StringBuilder sba[]=new StringBuilder[n];
        for(int i=0;i<n;i++){
            sba[i]= new StringBuilder(sc.next());
        }
        length(sba,n);
    }
    static void length(StringBuilder sba[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sba[i].length();
        }
        System.out.println(sum);
    }
}
