 import java.util.*;
class Chocolate{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of chocolates");
int numberofChocolates = sc.nextInt(); 
System.out.println("Enter the number of children");
int numberofChildren = sc.nextInt(); 
 int get = numberofChocolates/numberofChildren;
int remaining = numberofChocolates%numberofChildren;
System.out.println("The number of chocolates each child gets is "+ get+" and the number of remaining chocolates are "+ remaining);

}
}