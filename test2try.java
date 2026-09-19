import java.util.*;
public class test2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("enter a number");
	num = sc.nextInt();//a method that allows to input a number
	int n=num;
	int sum=0,r;
	while(n>0){
		r=n%10;
		sum=sum+n;
		
	}
	System.out.println("sum is :"+sum);
	
	
	
	}
}