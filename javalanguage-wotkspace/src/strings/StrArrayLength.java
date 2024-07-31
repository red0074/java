package strings;
import java.util.*;
public class StrArrayLength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        String[] names=new String [n];
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=names[i].length();
        }
        System.out.println(sum);
    }
}
