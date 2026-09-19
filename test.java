interface animal{
	public method makesound();

}
class dog implement animal{
	public makesound(){
		System.out.println("dog barks");
	}
}
class test{
	public static void main(String args()){
		dog ob= new dog();
		ob.makesound();
		
	}	
}