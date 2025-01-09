import java.util.*;
class Weight{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the weight in pounds");
float weight = sc.nextFloat();
double kilograms ;
kilograms = weight/2.2;
System.out.println("he weight of the person in pound is "+ weight +" and in kg is " + kilograms);
}
}