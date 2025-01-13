import java.util.*;
class Smallest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int n1 = sc.nextInt();
System.out.println("Enter the Second number");
int n2 = sc.nextInt();

System.out.println("Enter the Third number");
int n3 = sc.nextInt();

int[] result = findSmallestAndLargest(n1,n2,n3);
System.out.println("The smallest number is "+ result[0]);
System.out.println("The Largest number is "+ result[1]);

}
public static int[] findSmallestAndLargest(int n1 , int n2 , int n3){
int smallest = Math.min(n1,Math.min(n2,n3));
int largest = Math.max(n1,Math.max(n2,n3));
int[] a = {smallest , largest};
return a;

}
}