import java.util.*;

class MoveZero {

    public static void moveZero(int n, int[] nums) {

        int[] temp = new int[n];

        int nz = 0;

        // Store non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[nz] = nums[i];
                nz++;
            }
        }

        // Copy non-zero elements back
        for (int i = 0; i < nz; i++) {
            nums[i] = temp[i];
        }

        // Fill remaining positions with zero
        for (int i = nz; i < n; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZero(n, nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}