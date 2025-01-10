
 import java.util.*;
class Compare{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");

int number = sc.nextInt();
int sum1 =0;
int sum2 =0;
if (number>0){
 sum1 = number *(number+1)/2;
}
 while(number>0){
sum2+= number ;
number--;
}
if (sum1==sum2){
System.out.println("both the result are same" );
System.out.println("The result is " + sum1);
}

}

}