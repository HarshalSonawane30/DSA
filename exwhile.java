import java.util.*;

class exwhile{
	public static void main(String[]args)
	{
		int a=123;
		int count=0;
		while(a>0){
			int lastdigit=a%10;
			a=a/10;
			count++;
		}
		System.out.println(count);


  }