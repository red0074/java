package arrays;
import java.util.*;
public class AscOrDsc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAscending=false;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                isAscending=true;
            }
        }
        if(isAscending){
            System.out.println("given array is in ascending");
        }else{
            System.out.println("given array is not in ascending");
        }
    }
}
