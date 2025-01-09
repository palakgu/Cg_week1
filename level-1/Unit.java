import java.util.Scanner;
public class Unit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int student=sc.nextInt();
int handshake=(student*(student-1))/2;
System.out.println("The number of possible handshake is "+handshake);
}
}