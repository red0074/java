package strings;
import java.util.*;
public class StringReplace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the String: ");
        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='e')
            {
                result+=str.charAt(i);
            }else{
                result+='i';
            }
        }
        System.out.println(result);
    }
}
