 import java.util.Scanner;
public class Dist1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter value in feet");
double feet=sc.nextDouble();
double yard=feet/3;
double mile=yard/1760;
System.out.println("The distance in mile is "+mile+" and yard is "+yard);
}
}