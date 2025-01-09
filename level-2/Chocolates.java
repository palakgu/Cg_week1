 import java.util.*;
class Chocolate{
public Static void main(string[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of chocolates");
int numberofChocolates = sc.nextInt(); 
System.out.println("Enter the number of children");
int numberofChildren = sc.nextInt(); 
 int get = numberofChocolates/numberofChildren;
int remaining = nnumberofChocolates%numberofChildren;
System.out.println("The number of chocolates each child gets is "+ get+" and the number of remaining chocolates are "+ remaining);

}
}