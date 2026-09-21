class LocalVariable {
	public static void main(String[]args){
		int b=10;
		System.out.println(b);
			{
				int b=90;
				System.out.println(b);


			}

		{
			int c=30;
			System.out.println(c);

		}
	}
}