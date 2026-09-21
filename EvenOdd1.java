import java.util.Scanner;

 class EvenOdd1{

    public static void PosNeg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int a = sc.nextInt();

        String res = (a % 2 == 0 ? "even" : "odd");

        System.out.println("The Number is " + res);
    }

    public static void main(String[] args) {
        PosNeg();
    }
}