package strings;
import java.util.*;
public class StringReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        reverse(str);
    }
    static void reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
