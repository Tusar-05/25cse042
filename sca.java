import java.util.Scanner;
public class sca{
	public static void main(String args[]){
	int s1,s2,s3;
	float avg;
	String name,rno,dob;
	System.out.println("Enter your name");
	Scanner sc= new Scanner(System.in);
	name=sc.nextLine();
	System.out.println("Enter the rollno:");
	rno=sc.nextLine();
	System.out.println("Enter the date of birth:");
	dob=sc.nextLine();
	System.out.println("Enter the narks of the three subjects:");
	s1=sc.nextInt();s2=sc.nextInt();s3=sc.nextInt();
	avg=(float)(s1+s2+s3)/3;
	System.out.println(name+" "+dob+ " " +avg);
	
	}
}