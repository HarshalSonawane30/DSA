import java.util.*;
class merge2Arr{
  static int[] merge2Arr(int[]nums1,int[]nums2){
    int m=nums1.length;
    int n=nums2.length;
    int[] result=new int[m+n];
    
        for(int i=0;i<m;i++  ){
            result[i]=nums1[i];

        }
        for (int i=0;i<n;i++){
            result[m+i]=nums2[i];
        }
        
        
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        
        int []nums1=new int[m];
       for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
         int []nums2=new int[n];
           for(int i=0;i<n;i++){
            
            nums2[i]=sc.nextInt();
        }
        int []result= merge2Arr(nums1,nums2);
        System.out.println(Arrays.toString(result));
        
      }

        



        
    }
