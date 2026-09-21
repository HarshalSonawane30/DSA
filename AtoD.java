import java.util.Scanner;

class AtoD{
	public static  void atoD(char ch){
		switch(ch){
			case 'A':{
				System.out.println("A : Apple");

			}
			break;
			case 'B':{
				System.out.println("B :Bat");

			}
			break;
			case 'C':{
				System.out.println("C : Cat");

			}
			break;
			case 'D':{
				System.out.println("D: Dog");

			}
			break;
		default :{
			
				System.out.println("Invalid Input");
		}
		}

	}
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		atoD(ch);


	}
}