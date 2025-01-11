import java.util.Scanner;
public class Negative {
    public static void main(String[] args) {
        // Read user input
        Scanner scanner = new Scanner(System.in);
        double arr[]=new double[10];
	double sum=0.0;
	int i=0;
	System.out.println("Enter the numbers:");
    	while (true) {
		if (i==10) break;
		arr[i]=scanner.nextDouble();
		if (arr[i]<=0) break;
		sum+=arr[i];
		i+=1;
        }
     	System.out.println("The total is:"+sum);
    }
}