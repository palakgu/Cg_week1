 
 import java.util.*;
class Age{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many students");
int num = sc.nextInt();
int[] arr = new int[num];
System.out.println("Enetr the age of the student ");
for(int i=0;i<num;i++){
 arr[i]= sc.nextInt();
}
for (int i=0;i<num;i++){
if(arr[i]>=18){

System.out.println("The student with the age"+arr[i]+" can vote");
}
else 
if(arr[i]<=0){
System.out.println("Invalid age");
}
else if(arr[i]<18){
System.out.println(" The student with the age "+arr[i]+" cannot vote");
}
}

}
}