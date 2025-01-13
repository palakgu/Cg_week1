 

import java.util.*;
class Divisor{
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
  int[] result =  RemQuo(num1,num2);
System.out.println("The reminder of the numbers is "+ result[0]);
System.out.println("The quotient of the numbers is "+ result[1]);

}
public static int[] RemQuo(int num1 , int num2){
 int reminder = num1%num2;
int  quotient = num1/num2;
int a[]  = {reminder , quotient};
return a;
}
}