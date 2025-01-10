

import java.util.*;
class Vote{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age of the persom");
int Age = sc.nextInt();
if(Age>=18){
System.out.println("The person's age is "+Age+" and can vote");
} 
else 
System.out.println("The person's age is"+Age+ " and can not vote");

}
}