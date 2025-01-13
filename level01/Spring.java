
 import java.util.*;
class Spring{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the day ");
int day = sc.nextInt();
System.out.println("Enter the month");
int month = sc.nextInt();
if(CheckSpring(day, month)==true){
System.out.println("It's a spring season");
}
else 
System.out.println("Not a spring season");

}
public static Boolean CheckSpring(int day , int month){
if ((month>=3 && day>=20 ) && (month<=6 && day <=20)){
return true ;}
else 
return false;

}
}