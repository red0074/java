package operatorsandbinarynumbersystem;
import java.util.*;
public class Operators {
    public static void main(String[] args){
        int a=10;
        int b=0;
//        ==>arithematic operators
        //1)increment
        //pre increment
        b=++a;
        System.out.println(a);//11
        System.out.println(b);//11
//        post increment
       b=a++;
        System.out.println(a);//12
        System.out.println(b);//11
        //2)decrement
        //pre decrement
        b=--a;
        System.out.println(a);//11
        System.out.println(b);//11
        //post decrement
        b=a--;
        System.out.println(a);//10
        System.out.println(b);//11
//        ==>relational operators
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a>=b);//true
        System.out.println(a<=b);//false
//        ==>logical operator
        System.out.println(a>b && b<a);//true
        System.out.println(a>=b && b==a);//false
        System.out.println(a>=b || b==a);//true
        System.out.println(!(b==a));//true
    }
}
