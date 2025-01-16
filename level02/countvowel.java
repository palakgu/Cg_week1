 
 import java.util.Scanner;

public class countvowel{
	public static String converToUpperCase(String s){
		String str = "";
		for(int i =0; i<s.length(); i++){
			int n = s.charAt(i);
			if(n>=65 && n<=90){

				str += (char)(s.charAt(i) + 32);
			}
			else{
				str+= s.charAt(i);
			}
			System.out.print(str.charAt(i)+" ");
		}
			System.out.println();
		return str;
	}

public static int[] vowelConst( String s1){
int vowel =0;
int consts = 0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)== 'a' ||s1.charAt(i)== 'e' ||s1.charAt(i)== 'i' ||s1.charAt(i)== 'o' ||s1.charAt(i)== 'u'){
vowel++;
}
else 
consts++;
}
int[] result = {vowel , consts};
return result;
}	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String s1 = converToUpperCase(s);
		
          int[] result = vowelConst(s1);   

System.out.println("The  number of vowel present in the text are "+ result[0]);
System.out.println("The  number of consonants present in the text are "+ result[1]);
              

	}
}