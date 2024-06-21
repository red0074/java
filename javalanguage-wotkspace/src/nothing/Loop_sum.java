package nothing;

import java.util.Scanner;

public class Loop_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum by for loop= " + sum);
        int j=0;
        int sumwh=0;
        while(j<=n){
            sumwh=sumwh+j;
            j++;
        }
        System.out.println("sum by while loop="+sumwh);
        int k=0;
        int sumdo=0;
        do{
            sumdo=sumdo+k;
            k++;
        }while (k<=n);
        System.out.println("sum by do-while loop ="+sumdo);
    }
}
