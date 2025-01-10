


 import java.util.*;
class Compare1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");

int number = sc.nextInt();
int sum1 =0;

for(int i = number;i>=0;i--){
sum1+= i;
}
System.out.println("Sum of the natural number "+ sum1);
}

}