
import java.util.*;
class Wind{
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.println("ENter the temperature in celcious");
double temp = sc.nextDouble();
System.out.println("Enter the Wind speed");
double wind = sc.nextDouble();
  
double windChill = windChill(temp , wind );
 System.out.println("The calculated wind Chill is "+ windChill);
}
public static double windChill(double temp , double wind ){

 double Windspeed = 37.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind , 0.16);
 
return Windspeed ; 
 
}

}