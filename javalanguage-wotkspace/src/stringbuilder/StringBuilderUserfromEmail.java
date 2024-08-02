package stringbuilder;
import java.util.*;
public class StringBuilderUserfromEmail {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the email: ");
        StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='@')
            {
                sb.delete(i,sb.length());
            }
        }
        System.out.println(sb);
    }
}
