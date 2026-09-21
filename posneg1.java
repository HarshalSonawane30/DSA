import java.util.Scanner;

 class posneg {

    public static void PosNeg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int a = sc.nextInt();

        String res = (a > 0 ? "positive" : a < 0 ? "negative" : "zero");

        System.out.println("The Number is " + res);
    }

    public static void main(String[] args) {
        PosNeg();
    }
}