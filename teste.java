//Q4 Write a java preogram to create an interface NumberPrinter with method printNumber(Integer num).
//Implement and display the number.

import java.util.Scanner;


interface np{
	public void show();
}
class npv implements np{
	public void show( int x){
		System.out.println("Value of x is"+ x);
	}
}

class teste{
	public static void main ( String args[]){
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		npv ob = new npv();
	
	}
}