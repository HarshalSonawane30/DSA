class posneg{
	public static void main(String[]args){
		int num = -10;

		String result = (num % 2 == 0)? (num > 0 ? "positive even" : "negative even"): "not an even number";

			System.out.println(result);
	}
 
}

