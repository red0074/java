package arrays;
import java.util.*;
public class Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int numbers[]=new int [n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
