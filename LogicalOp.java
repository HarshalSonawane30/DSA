/*check the given number id divisible by 3 and 5 then
print divisible by both or not  Divisible by both*/
class LogicalOp{
	public static void main(String[] args)
	{
	  int a=15;
      int b=31;
      int c=56;
      int d=90;
      int e=78;

      System.out.println("15 is Input:");
	  String r = (a%3==0  &&  a%5==0)?"Divisible by 3 And 5":"Not Divisible by both";
	  System.out.println(r);
     
      System.out.println("31 is Input:");
	  String re = (b%3==0  &&  b%5==0)?"Divisible by 3":"Divisible by 5";
	  System.out.println(re);
      
      System.out.println("56 is Input:");
	  String res = (c%3==0  &&  c%5==0)?"Divisible by 3":"Divisible by 5";
	  System.out.println(res);
      
      System.out.println("90 is Input:");
	  String resu = (d%3==0  &&  d%5==0)?"Divisible by 3":"Divisible by 5";
	  System.out.println(resu);
       
      System.out.println("78 is Input:");
	  String resul = (e%3==0  &&  e%5==0)?"Divisible by 3":"Divisible by 5";
	  System.out.println(resul);
	}
}