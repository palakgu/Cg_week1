 import java.util.*;
 class Divisible{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number = sc.nextInt();
if(number%5==0){
System.out.println("Is the number "+number+"divisible by 5 ?"+ " yes ");
}
else 
System.out.println("Is the number "+number+"divisible by 5 ?"+ " No ");
}
}