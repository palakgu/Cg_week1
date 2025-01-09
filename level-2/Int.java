import java.util.*;
class Int{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int result1, result2 , result3, result4;
result1 = a + b *c;
result2 = a * b + c;
result3 =  c + a / b;
result4 =  a % b + c;
 System.out.println("The results of Int Operations are "+result1+" , "+result2 +" , " + result3+" and "+ result4);
}


}