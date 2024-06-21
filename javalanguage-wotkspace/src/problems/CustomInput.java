package problems;
import java.util.*;
public class CustomInput {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int po=0,ne=0,ze=0;
        do{
            System.out.println("enter 1111 to exit the loop");
            int n=sc.nextInt();
            if(n==1111){
                break;
            }
            else if(n>0){
                po++;
            } else if (n<0) {
                ne++;
            } else if (n ==0) {
                ze++;
            }
        }while(true);
        System.out.println("positive = "+po);
        System.out.println("negative = "+ne);
        System.out.println("zero = "+ze);

    }
}
