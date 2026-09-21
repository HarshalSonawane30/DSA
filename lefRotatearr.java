import java.util.*;

public class lefRotatearr {

    public static int[] lefRotatearr(int[] arr, int n) {

        int temp = arr[0];

        
        for (int i = 0; i < n - 1; i++) {
            arr[i]=  arr[i + 1];
        }

      
        arr[n - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = lefRotatearr(nums, n);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}