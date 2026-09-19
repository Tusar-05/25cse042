import java.util.Scanner;
class test3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int orignal = num;
        int reverse = 0;
        while(num!=10)
        {
            int digit = num% 10;
            reverse = reverse*10 + digit;
            num =num/10;
        }
        if(orignal== reverse){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}