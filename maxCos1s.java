import java.util.*;
class maxCos1s{
	public static int maxCos1s(int[]nums ,int n){
		int maxi=0;
		int count=0;
		for (int i=0;i<n;i++){
			if(nums[i]==2){
				count++;
				maxi=Math.max(maxi,count);
			}
			else{
				count=0;
			}
		}
		return maxi;

	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new  int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int result=maxCos1s(nums,n);
		System.out.println(result);
	}
}