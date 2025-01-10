

 import java.util.*;
class Salary{
public static void main(String[] args){
System.out.println("Enter the salary and year of the service");
Scanner sc = new Scanner(System.in);
double bonus = 0.0 ;
double salary = sc.nextDouble();
int year = sc.nextInt();
 if (year>=5){
bonus = (salary *5)/100;
}

System.out.println("The bonus amount will be "+ bonus );

}
}