import java.util.Scanner;

class SpeedLimit {

    public static void speedLimit(int speed) {

        if (speed <= 60) {
            System.out.println("Safe Speed");
        }
        else if (speed <= 80) {
            System.out.println("Warning: OverSpeed");
        }
        else if (speed <= 100) {
            System.out.println("Fine: 100");
        }
        else {
            System.out.println("Fine: 1000 And License Suspended");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Speed:");
        int speed = sc.nextInt();

        speedLimit(speed);

     
    }
}