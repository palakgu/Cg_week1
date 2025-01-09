
  
import java.util.*;
class Print{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the two numbers");
int num1 = sc.nextInt();
int num2= sc.nextInt();
 int reminder , quotient ;
reminder = num1%num2;
quotient = num1/num2;
System.out.println("The Quotient is "+ quotient +" and Reminder is "+ reminder +" of two number " + num1 + " and "+ num2);


}

}