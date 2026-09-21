import java.util.Scanner;

class DynamicReadTask{
	public static void main(String [] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR FULL NAME:- ");
        String name=sc.nextLine();        
        System.out.println("ENTER YOUR AGE:- ");
        int age=sc.nextInt();
        System.out.println("ENTER YOUR EMAIL:- ");
        String email= sc.nextLine();
        System.out.println("ENTER PHONE NUMBER:- ");
        long number=sc.nextLong();
        System.out.println("ENTER YOUR GRADE:- ");
        String grade=sc.next();
        System.out.println("ARE YOU MARRIED:- ");
        Boolean status= sc.nextBoolean();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("****** ALL DEATILS ******");
        System.out.println("Full Name Of Student "  + name);
        System.out.println("Age Of Student "  + age);
        System.out.println("Email Of Student "  + email);
        System.out.println("Phone Number Of Student "  + number);
        System.out.println("Grade Of Student "  + grade);
        System.out.println("MArried Status Of Student "  + status);
	}
}