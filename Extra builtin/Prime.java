

import java.util.*;
public class Prime{
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the number ");
int n = sc.nextInt();
if(n==2){
System.out.println(" The number is prime number");
} else {
CheckPrime(n);
}
}
public static void CheckPrime(int num ){
boolean flag = true;
for(int i=2;i<num;i++){
if(num%i==0){
 flag = false ;
}
}
if( flag == true ){
System.out.println(" The number is prime number ");
}
else 
System.out.println("The number is not a prime number ");
}
}