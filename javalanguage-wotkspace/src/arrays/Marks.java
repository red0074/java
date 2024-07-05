package arrays;
import java.util.*;
public class Marks {
    public static void main(String args[]){
//        int[] marks=new int [3];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;
//        the above method is one way of defining the arrays
        int marks[]={97,98,95};
//        System.out.println(marks);->returns a garbage value,actually it returns the address where it stored the marks
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        the above three lines can be written using loops
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
