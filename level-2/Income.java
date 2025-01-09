 import java.util.*;
class Income {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary of the person");
double  Salary = sc.nextDouble();
System.out.println("Enter the bonus of the person");
double Bonus = sc.nextDouble();
double income = Salary + Bonus ;
System.out.println("The salary is INR "+ Salary +" and bonus is INR "+ Bonus+" Hence Total Income is INR "+ income);

}
}