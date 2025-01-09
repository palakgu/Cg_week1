import java.util.*;
class Swap{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int number1 = sc.nextInt();
System.out.println("Enter the Second number");
int number2 = sc.nextInt();
number1 = number1^number2;
number2 = number1^number2; 
number1 = number1^number2;
System.out.println("The swapped numbers are "+ number1+" and " +number2);


}
}