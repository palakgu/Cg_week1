

import java.util.*;
class Oddeven{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number = sc.nextInt();
int size = number/2+1;
int[] odd = new int[size];
int[] even = new int[size];
int oddindex=0,evenindex=0;  
for(int i=0;i<number;i++){
if(i%2==0){
 even[evenindex++]= i;
}
else 
odd[oddindex++]= i;
}

System.out.println("Even Array");
for(int i=0;i<evenindex;i++){

System.out.println(even[i]);
   }

System.out.println("Odd Array");
for(int i=0;i<oddindex;i++){

System.out.println(odd[i]);
    }
  }
}