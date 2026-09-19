//Q3 Write a program to create an interface Greeting whith: One abstracvt method sayHello(), One default method sayBye().
// Implement and demonstrate both methods.



interface greeting{
	public void sayHello();
	default public void sayBye(){
		System.out.println("Bye Bye");
	}
}
class mygreeting implements greeting{
	public void sayHello(){
		System.out.println("Hello");
	}
}
class testy {
	public static void main(String args[]){
		mygreeting ob= new mygreeting();
		ob.sayHello();
		ob.sayBye();
		
	}
}