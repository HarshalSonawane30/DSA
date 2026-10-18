import java.util.*;
public class RotateArraynbruite {
    public static  void rotate(int[]nums,int k){
        int n=nums.length;
        k=k%n;
       int[] temp = new int[k]; 
        for(int i=0;i<k;i++){
            temp[i]=nums[i];//temporary stored the elements
        }

        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];//shifted
        }

        for(int i=n-k;i<n;i++){
            nums[i]=temp[i-(n-k)];
        }






    }
    
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        

        int d=sc.nextInt();
        rotate(nums, d);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
