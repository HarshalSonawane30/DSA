// Conditions:If income is $10,000 or less, tax is 0%.
// Else if income is $30,000 or less, tax is 10%.
// Else if income is $60,000 or less, tax is 20%.
// Else, tax is 30%.


import java.util.Scanner;

class IncomeTax{

    public static void IncomeTax(int income) {

        if (income<=10000) {
            System.out.println("tax is 0%");
        }
        else if (income <= 30000) {
            System.out.println("tax is 10%");
        }
        else if (income <= 60000) {
            System.out.println("tax is 20%");
        }
        else {
            System.out.println("tax is 30%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the tax:");
        int income = sc.nextInt();

        IncomeTax(income);

     
    }
}