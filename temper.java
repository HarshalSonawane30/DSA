
import java.util.Scanner;

class temper {

    public static void Temperc(int temp) {

        if (temp > 30) {
            System.out.println("Hot");
        }
         else if (temp > 15) {
            System.out.println("Warm");
        }       
        else {
            System.out.println("Cold");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temp:");
        int temp = sc.nextInt();

        Temperc(temp);

     
    }
}