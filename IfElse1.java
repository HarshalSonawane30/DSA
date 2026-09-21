import java.util.Scanner;

class IfElse1{
		public static void voting(){
			Scanner sc = new Scanner(System.in);
		

			int age=sc.nextInt();
			
			if(age>=18){
				System.out.println("eligible for voting");

			}
			else{
				System.out.println("not eligible for voting");
			}
		}
		public static void main(String[]args){
			
			voting();
		}

}