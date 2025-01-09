import java.util.Scanner;
class  Temp{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter  Celsius value you want to change in fahereneit scale");
float Celsius=sc.nextFloat();
float farenheitResult;
farenheitResult  = (Celsius * 9/5) + 32;
System.out.println("Fahrenheit value:"+farenheitResult );
}
}