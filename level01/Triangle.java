import java.util.*;
class Triangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  side of the triangle");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
 
Run(n1,n2,n3);
}
public static void Run(int n1 , int n2, int n3){
int perimeter = n1+n2+n3;
int rounds = perimeter/5;
System.out.println("the total rounds are "+ rounds);
}
}