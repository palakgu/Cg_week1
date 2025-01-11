


import java.util.*;
class Mean{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double[] height = new double[12];
double sum = 0.0;
double mean =0.0;
System.out.println("Enter the values of the array");
for(int i =0;i<11;i++){
height[i]  = sc.nextDouble();
sum+=height[i];
}

 mean = sum/11;
System.out.println("the mean height of the football team is "+ mean);
}
}