import java.util.*;

public class MoveZeroOpt {
    public static void moveZeroOpt(int n ,int[]nums){
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }

        }



        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }

    }
    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]nums=new int[n];
         for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroOpt(n, nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
