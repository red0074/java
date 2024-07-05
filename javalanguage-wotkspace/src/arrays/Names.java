package arrays;
import java.util.*;
public class Names {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names you are going to enter:");
        int n=sc.nextInt();
        String names[]=new String [n];
        System.out.println("Enter the names :");
        for(int i=0;i<names.length;i++){
            names[i]=sc.next();
        }
        for(int j=0;j<names.length;j++){
            System.out.println(names[j]);
        }
    }
}
