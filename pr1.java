import java.util.*;
class pr1{
    public static  int  largnum(int []nums){
        int max=nums[0];
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];

            }

        }
        return  max;


    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i =0 ; i<n;i++){
            nums[i]=sc.nextInt();

        }
        int result=largnum(nums);
        System.out.println(result);   
        
        
    }
}