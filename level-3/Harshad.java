import java.util.*;
class Harshad {
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
int sum =0;
int n ;
while(num>0){
n = num%10;
sum+=n;
num = num/10;
}
if(num%sum==0){
System.out.println("the number is harshad number");
}
else 
System.out.println("The number is not harshad number");

}
}