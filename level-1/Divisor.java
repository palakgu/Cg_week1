import java.util.*;
class Abundant{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number ");
int num = sc.nextInt();
int sum=0;
for(int i = 1; i<num;i++){
if(num%i==0){
sum+=i;
}
}
if(sum>num){
System.out.println("The number is abundannt");
} 
else 
System.out.println("The number is not abundant");
}
}