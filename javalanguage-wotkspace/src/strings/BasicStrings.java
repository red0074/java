package strings;
import java.util.*;
public class BasicStrings {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //declaring
        String testing="this is testing";
        //printing
        System.out.println(testing);
        //reading
        String name=sc.next();
        System.out.println(name);
        //taking the space as input
        String fullName=sc.nextLine();
        System.out.println(fullName);

        //methods in string
        //1.concatenation;
        String firstName="tony";
        String lastName="stark";
        String fullname=firstName+lastName;
        System.out.println(fullname);
        //2.length
        System.out.println(fullname.length());
        //3.charAt:
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        //4.compare
        String name1="Tony";
        String name2="tony";
        if((name1.compareTo(name2))==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //5.substring
        String sentence="this is a very useful way of using substrings";
        System.out.println(sentence.substring(9));
        //6.convert string to integer
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);
        //7.convert integer to string
        int num=123;
        String st=Integer.toString(num);
        System.out.println(st.length());
    }
}
