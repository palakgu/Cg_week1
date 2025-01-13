import java.util.*;
class Sum {
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
Sum(num);

}
public static void Sum(int num){
int sum=0;
while(num>0){
sum+=num;
num--;
}
System.out.println("The Sum of the natural number is " + sum);
}
}