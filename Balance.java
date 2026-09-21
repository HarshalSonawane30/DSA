class Balance{
	 public static void main(String[] args) {
		int balance = 2500;
		System.out.println("Current balance:- "+balance);
		balance= balance+200;
		System.out.println(" After Deposite 200:- "+balance);
		balance=balance-300;
		System.out.println("After Withdraw 300:- "+balance);
		balance=balance-180;
		System.out.println("After Transfer 180:- "+balance);
		balance=balance-70;
		System.out.println(" After Maintainance Charge 70:- "+balance);
		balance=balance+300;
		System.out.println(" After ReDeposite 300:- "+balance);
		System.out.println("Current balance:-  "+balance);
	}
}