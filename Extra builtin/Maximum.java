

import java.util.*;
public class Maximum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number ");
int n1 = sc.nextInt();
System.out.println("Enter the second number ");
int n2 = sc.nextInt();
System.out.println("Enter the third number ");
int n3 = sc.nextInt();
find(n1,n2,n3);

}
public static void find(int n1 , int n2 , int n3){
int result = Math.max(n1 , Math.max(n2 , n3));
System.out.println(" the maximum number among these three number is " + result);

}
}