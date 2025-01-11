import java.util.*;
class Array{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the row and column of the array");
int rows = sc.nextInt();
int column = sc.nextInt();
int [][] arr = new int[rows+1][column+1];

System.out.println("Enter the values of the array");
for(int i=0;i<rows;i++){
for(int j=0; j<column; j++){
 arr[i][j] = sc.nextInt();

   }
  }

int[] arr1 = new int[rows*column];
int index=0;
for(int i=0;i<rows;i++){
for(int j=0 ; j<column;j++){
arr1[index++] = arr[i][j];
    }
  }
System.out.println("the single dimentional array");
 for(int i=0;i<index;i++){
System.out.println(arr1[i]);
}

}
}