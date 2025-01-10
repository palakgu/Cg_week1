
import java.util.*;
class Largest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the numbers");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
if(num1>num2 && num1>num3){
System.out.println("Is the first number the largest? "+ "yes");
  } 
else
if(num2>num1 && num2>num3){
System.out.println("Is the third number the largest? "+ "yes");
  }
else 
if(num3>num2 && num3>num1){
System.out.println("Is the third number the largest? "+ "yes");
  }
 }
}