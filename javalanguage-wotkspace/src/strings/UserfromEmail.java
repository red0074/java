package strings;
import java.util.*;
public class UserfromEmail {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email : ");
        String mail=sc.next();
        String user="";
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@')
                break;
            else
                user+=mail.charAt(i);
        }
        System.out.println(user);
    }
}
