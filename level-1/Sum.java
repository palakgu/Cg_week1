

import java.util.*;
class Sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double total = 0.0 ;
 System.out.println("Enter the value");
 
double value = sc.nextDouble();

while(value>0){
total+= value;
System.out.println("Enter the value again");
value = sc.nextDouble();

}
System.out.println("total value"+ total); 

}

}