/*
Q5 .Write a java progarm to create two interfaces:
	Printer -> print()
	Scanner -> scan()
Implements both in a single class and demonstrate functionality.
*/

interface Printer{
	void print();}
interface Scanner{
	void scan();
}	

class Machine implements Printer,Scanner{
	public void print(){
		System.out.println("Printing doc");
	}
	public void scan(){
		System.out.println("Scanning doc");
	}
}




public class testk{
	public static void main(String args[]){
		Machine m = new Machine();
		m.print();
		m.scan();
	}
}