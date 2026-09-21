class MethodOverloading2{

	public static int getCube(int a ){
		return a*a*a;

	}
	public static double getCube(double a ){
		return a*a*a;
	}

	public static void main (String []args){
		System.out.println( " Cube of a Number"+getCube(5));
		System.out.println(getCube(5.1));
		

		

	}     
}