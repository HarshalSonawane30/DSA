import java.util.Scanner;
class largnum{
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the first Number");
	 	int marks1=sc.nextInt();
	 	


	 	if(marks1>=80){
	 		System.out.println("grade A");
	 	}
	 	else if (marks1>=60) {
	 		System.out.println("grade b");
	 		
	 	}
	 	else if(marks1>=40){
	 		System.out.println("Grade C");
	 	}
	 	else {
	 		System.out.println("fail");
	 	}


		
	}
}