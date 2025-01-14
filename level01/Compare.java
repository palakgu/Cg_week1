import java.util.*;
class Compare{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println ("Enter the string ");
String  str = sc.nextLine();
System.out.println("Enter the starting and the end Index");
int start = sc.nextInt();
int end = sc.nextInt();
String  substringout = subStri( str , start , end );
System.out.println("The substring without using method is "+ substringout);
String subStr = str.substring(start , end);
System.out.println("the Substring using in built function is "+subStr);
boolean flag = false ;

for (int i=0;i<substringout.length(); i++){
if(substringout.charAt(i)== subStr.charAt(i)){
flag = true;
}

}
if(flag== true){
System.out.println("The Substring are equal");
}
else 
System.out.println("The substring are not equal");
}



public static String subStri(String str , int start ,int end){
String str1 = "";
for(int i= start; i<=end-1;i++){
str1 = str1+str.charAt(i);
}
return str1;
}

}