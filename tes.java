public class tes{
	public static void main(String args[]){
		String x= new String("abc");
		String y= new String("abc");
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}
}
// How many memory willl be utilized 
// How many objects are generated
// Which Strig is more in life 
// what can be the result while == 
// what can be the result equals 
/*
while string is generated using a string class the == operator return false because the == operator is not ment for conntent operation 
rather it is for object comparison 

-2 . Even in string buffer the == operator is meant for address comparison only 
-3 . when we compare two objects with equals method for string class it returns true
-4 . Whern you compare two objects using equals method of using string buffer class
*/