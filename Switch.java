import java.util.Scanner;

class Switch {

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st num ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd num");
        int b=sc.nextInt();

        System.out.println("Selct option");
        System.out.println("1:Add");
        System.out.println("2:Sub");
        System.out.println("3:Mul");
        System.out.println("4:Div");

        System.out.println("Enter your choice");
        int choice=sc.nextInt();

        switch(choice){
        case 1:{
            int sum=a+b;
            System.out.println(sum);
        }
        break;
        case 2:{
            int sub=a-b;
            System.out.println(sub);
        }
        break;
        case 3:{
            int mul=a*b;
            System.out.println(mul);
        }
        break;
        case 4:{
            int div=a/b;
            System.out.println(div);
        }
        break;
        default:{System.out.println("Invalid Input");} 
        }
     
    }
}