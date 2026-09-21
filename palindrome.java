import java.util.Scanner;

class palindrome{
		public static void palindromeNum(int n){
			int dup =n;
            int revNum=0;
            while (n>0) {
                int lastdigit=n%10;
                n=n/10;
                revNum=revNum*10+lastdigit;
                
            }
            if (revNum==dup){
                System.out.println("The given Number is the palindrome number");

            }
            else {
                System.out.println("the num is not palindrome");
            }
            

		}
		public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
                          int n=sc.nextInt();
			
			palindromeNum(n);
		}

}