

 import java.util.*;
 class Sum1{
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
double number , sum=0.0;

while(true){
System.out.println("Enter the number");
number = sc.nextDouble();
if(number>0){
sum+= number;
}
else 
break;
}
System.out.println("The sum of the numbers is " + sum);
}
}