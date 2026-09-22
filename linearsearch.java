import java.util.*;
public class linearsearch {
    public static int linearSearch(int n, int num,int []arr){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
           
        }
         return -1;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int num=sc.nextInt();

        int []arr=new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=linearSearch(n,num,arr);
        System.out.println(result);
    }
    

}
