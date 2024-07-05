package arrays;
import java.util.*;
public class Search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to search:");
        int x=sc.nextInt();
        for(int j=0;j<n;j++){
            if(arr[j]==x){
                System.out.println("The "+x+" is found at the index "+j);
            }
        }
    }
}
