class Divisible{
	public static void main(String[] args)
	{
		int a=15;

		String res=(a%3==0 && a%5==0)?"Divisible by both":(a%3==0)?"Divisible by 3":
		(a%5==0)?"Divisible by 5":"Not Divisible by Both";
		System.out.println(res);

		int b=10;
		String result=(b%3==0 && b%5==0)?"Divisible by Both":(b%3==0)?"Divisible by 3":
		(b%5==0)?"Divisible by 5":"Not Divisible by Both";
		System.out.println(result);
	}
}