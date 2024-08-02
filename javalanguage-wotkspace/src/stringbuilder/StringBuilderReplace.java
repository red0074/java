package stringbuilder;
import java.util.*;
public class StringBuilderReplace {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='e')
            {
                sb.setCharAt(i,'i');
            }
        }
        System.out.println(sb);
    }
}
