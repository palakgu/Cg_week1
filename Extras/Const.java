import java.util.*;
class Const{
public static void main(String[] argss){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the word ");
String str1 = sc.nextLine();
int vowels =0,constant =0;
for(int i=0;i<str1.length();i++){
if(str1.charAt(i)=='a' || str1.charAt(i)== 'e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u'){
vowels++;
}
else 
constant++;

}

System.out.println("No. of vowels "+ vowels);
System.out.println("Number of constanst "+ constant);

}


}