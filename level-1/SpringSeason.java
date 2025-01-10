

import java.util.*;
class SpringSeason{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of the month");
int month = sc.nextInt();
System.out.println("Enter the date");
int day = sc.nextInt();
if((month>=3 && day>=20) && (month<=6 && day<=20)){
System.out.println("Its a Spring Season ");
}
else 
System.out.println("Not a Spring Season");


}
}