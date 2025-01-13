import java.util.*;
class Hand{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
int n = sc.nextInt();
HandShakes(n);
}
public static void HandShakes(int n){
int total =  (n * (n - 1)) / 2;
System.out.println("Total no. of Hand shakes are "+total);
}
}