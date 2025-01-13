
 
 import java.util.*;
class Chocolates{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of Chocolates");
int choco = sc.nextInt();
System.out.println("Enter the number of Students" );
int stu = sc.nextInt();
 int[] result = chocolateStudent(choco , stu);
System.out.println("No of Chocolate each student get is "+ result[0]);
System.out.println("No of remaining chocolates "+ result[1]);

}

public static int[] chocolateStudent(int choco , int stu){
 
int distributed = choco/stu;
int remaining = choco%stu;
int[] a = {distributed , remaining};

return a ; 

}
}