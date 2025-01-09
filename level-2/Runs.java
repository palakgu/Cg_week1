
import java.util.*;
class Runs{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the sides of the triangular parks");
int side1 = sc.nextInt();
int side2 = sc.nextInt();
int side3 = sc.nextInt();
int perimeter = side1+side2+side3;
float round = perimeter/5; 
System.out.println("The total number of rounds the athlete will run is "+ round + " to complete 5 km");
}
}
