import java.util.*;
class Array2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int  num = sc.nextInt();
int count =0;

int[] arr = new int[10];
int[] arr2 = new int[10];
int temp = num;
while(temp>0){
temp = temp/10;
count++
}
for(int i=0;i<count;i++){
arr[i] = num%10;
num = num/10;
}
arr = arr2 ;
for (int i=0;i<count; i++){
int frequency =1;
for(int j=i; j<count; j++){
if(arr[i]==arr2[j]){
frequency++;
}
System.out.println("The frequency of digit"+arr[i]+" is "+ frequency );
}
}

}
}