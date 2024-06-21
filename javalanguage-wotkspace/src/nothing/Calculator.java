package nothing;

import java.util.Scanner;

public class Calculator {
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("operations u can perform is :\n1.+ Addition\n2.- Substraction\n3.* Multiplication\n4./ Division\n5.% Modulo\nEnter the operation:");
        int op= sc.nextInt();
        switch (op)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(a>b){
                    System.out.println(a/b);
                    break;
                }
                else{
                    System.out.println("invalid");
                    break;
                }
            case 5:
                    System.out.println(a%b);
                    break;
            default:
                System.out.println("exiting .................................");
        }
    }
}
