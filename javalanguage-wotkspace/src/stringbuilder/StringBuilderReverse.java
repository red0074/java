package stringbuilder;
import java.util.*;
public class StringBuilderReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<sb.length()/2;i++){
            int fro=i;
            int back=sb.length()-i-1;
            char frontchar=sb.charAt(fro);
            char backchar=sb.charAt(back);
            sb.setCharAt(fro,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);
    }
}
