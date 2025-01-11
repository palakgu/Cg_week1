import java.util.*;
class Reverse{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");

int number = sc.nextInt();
 int[] arr = new int[10];
  int count =0;
 while(number!= 0){
arr[count] = number%10;
number = number/10;
count++;
}

for(int i =0;i<count;i++){
System.out.print(arr[i]);
}

}
}