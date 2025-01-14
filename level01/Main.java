import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String s1");
        String s1=sc.nextLine();
        System.out.println("Enter String s1");
        String s2=sc.nextLine();
        
       boolean check=s1.equals(s2);
       boolean check1=chk(s1,s2);

       if(check1==check){
           System.out.println("Both string are same");
       }
    }
    public static boolean chk(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }

        return true;
    }
}