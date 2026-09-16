import java.util.*;

public class SecLargnum {

    public static int secLargest(int[] a, int n) {

        int Largest = a[0];
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            if (a[i] > Largest) {
                SecondLargest = Largest;
                Largest = a[i];
            }
            else if (a[i] < Largest && a[i] > SecondLargest) {
                SecondLargest = a[i];
            }
        }

        return SecondLargest;
    }

    public static int secSmallest(int[] a, int n) {

        int Smallest = a[0];
        int SecondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {

            if (a[i] < Smallest) {
                SecondSmallest = Smallest;
                Smallest = a[i];
            }
            else if (a[i] != Smallest && a[i] < SecondSmallest) {
                SecondSmallest = a[i];
            }
        }

        return SecondSmallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = secLargest(a, n);
        int result1 = secSmallest(a, n);

        System.out.println("Second Largest: " + result);
        System.out.println("Second Smallest: " + result1);
    }
}