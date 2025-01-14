import java.util.*;
class Tochar{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String str = sc.next();  
char[] arr = toChararray(str);
System.out.println("The string converted into array");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
public static char[] toChararray(String str){
char[] arr = new char[str.length()];

for(int i=0;i<str.length(); i++){
arr[i] = str.charAt(i);
}
 return arr ;
}
}