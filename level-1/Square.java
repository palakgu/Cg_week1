import java.util.*;
class Square{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the perimeter of the Square");
// Taking input of the perimeter 
int perimeter = sc.nextInt();
// Finding the length of the Square
int length = perimeter/4;
System.out.println("The length of the side is "+ length +" whose perimeter is "+ perimeter);

}

}