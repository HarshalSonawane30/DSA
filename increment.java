class increment{
	public static void main(String[]args){
		int a=3;
		int b=a+ a++;
		int c=a++ + b++ + ++b + ++a;
		int d= c+ a + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}