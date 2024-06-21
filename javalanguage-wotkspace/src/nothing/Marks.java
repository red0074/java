package nothing;

import java.util.Scanner;

public class Marks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            int marks=sc.nextInt();
            if(marks>=90)
                System.out.println("this is good");
            else if(marks<=89 && marks>=60){
                System.out.println("This is also good");
            }
            else if(marks >0 && marks<=59){
                System.out.println("This is good as well");
            }
            else{
                break;
            }
        }
    }
}
