import java.util.*;
class Double{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
double a = sc.nextInt();
double b = sc.nextInt();
double c = sc.nextInt();

double result1, result2 , result3, result4;
result1 = a + b *c;
result2 = a * b + c;
result3 =  c + a / b;
result4 =  a % b + c;
 System.out.println("The results of Int Operations are "+result1+" , "+result2 +" , " + result3+" and "+ result4);
}


}