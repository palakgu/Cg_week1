import java.util.Scanner;
class Multiplication{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter your number");
int num=sc.nextInt();
int arr[]=new int[10];
for(int i=0; i<arr.length; i++){
arr[i]=num*(i+1);
}
for(int i=0; i<arr.length; i++){
System.out.println(num+" X "+(i+1)+" "+arr[i]);
}


}

}