package nothing;

import java.util.Scanner;

public class Switchex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        //using if else
//        if(button == 1){
//            System.out.println("Hello");
//        }else if (button ==2){
//            System.out.println("Namaste");
//        }else if(button ==3){
//            System.out.println("BOnjour");
//        }else{
//            System.out.println("invalid");
//          }
        //using switch
        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
