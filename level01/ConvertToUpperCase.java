import java.util.Scanner;

public class ConvertToUpperCase{
	public static String converToUpperCase(String s){
		String str = "";
		for(int i =0; i<s.length(); i++){
			int n = s.charAt(i);
			if(n>=97 && n<=122){

				str += (char)(s.charAt(i) - 32);
			}
			else{
				str+= s.charAt(i);
			}
			System.out.print(str.charAt(i)+" ");
		}
			System.out.println();
		return str;
	}

	public static boolean compare(String s1, String s2){
		if(s1.equals(s2)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String s1 = converToUpperCase(s);
		String s2  = s.toUpperCase();
		boolean ans = compare(s1,s2);
		if(ans){System.out.println("Both methods gives same result");}
		else{System.out.println("Both methods gives different result");}
	}
}