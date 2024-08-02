package stringbuilder;
import java.util.*;

public class BasicStringBuilder {
   public static void main(String args[]){
       //declaring stringbuilder
       StringBuilder sb=new StringBuilder("Tony");
       //printing the stringbuilder
       System.out.println(sb);
       //methods in string builder:
       //1.->to get character
       System.out.println(sb.charAt(0));
       //2.->to set character
       sb.setCharAt(0,'s');//->replaces the character at index '0'
       System.out.println(sb);
       //3.->to insert a character
       sb.insert(0,'s');//->add the character at index '0'
       System.out.println(sb);
       //4.->todelete a character
       sb.delete(0,2);
       System.out.println(sb);
       //5.->to add character/string at end of the string
       sb.append("stark");
       System.out.println(sb);
       //6.to get the length of the string Builder
       System.out.println(sb.length());
   }

}
