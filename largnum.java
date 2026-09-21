import java.util.Scanner;
class largnum{
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the first Number");
	 	int num1=sc.nextInt();
	 	System.out.println("Enter the first Number");
	 	int num2=sc.nextInt();


	 	if(num1==num2){
	 		System.out.println("Both are same");
	 	}
	 	else if (num1>num2) {
	 		System.out.println("Largest num is :"+num1);
	 		
	 	}
	 	else{
	 		System.out.println("Largest num is :"+num2);
	 	}


		
	}
}