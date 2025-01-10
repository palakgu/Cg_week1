import java.util.*;
class Digitcount{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
int count =0;
while(num>0){
count++;
num = num/10;
}
System.out.println("The count of the digits "+ count);

}

}