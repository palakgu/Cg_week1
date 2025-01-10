import java.util.*;
class Fact{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number = sc.nextInt();
 int fact =1;
while(number>=1){
fact*=number;
number--;
}
System.out.println("the factorial of the number is " + fact);
}
}