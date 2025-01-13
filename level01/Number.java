import java.util.*;
class Number{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
 Check(num);

}
public static void Check(int num){

if(num>0){

System.out.println("The Number is positive");
}
else 
if(num<0){System.out.println("The Number is Negative");
}
else 
System.out.println("The number is Zero");
}
}