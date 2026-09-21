import java.util.Scanner;

public class TimeTable {

    static void showTimeTable(int choice) {

        switch (choice) {

            case 1:{
                System.out.println("===== MONDAY =====");
                System.out.println("9:00 - 10:00  Java");
                System.out.println("10:00 - 11:00 DBMS");
                System.out.println("11:00 - 12:00 OS");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   CN");
                System.out.println("2:00 - 3:00   DSA");
            }
                break;

            case 2:{
                System.out.println("===== TUESDAY =====");
                System.out.println("9:00 - 10:00  Python");
                System.out.println("10:00 - 11:00 Java");
                System.out.println("11:00 - 12:00 DBMS");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   CN");
                System.out.println("2:00 - 3:00   DSA");
                }
                break;

            case 3:{
                System.out.println("===== WEDNESDAY =====");
                System.out.println("9:00 - 10:00  DSA");
                System.out.println("10:00 - 11:00 OS");
                System.out.println("11:00 - 12:00 Java");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   DBMS");
                System.out.println("2:00 - 3:00   CN");
                }
                break;

            case 4:{
                System.out.println("===== THURSDAY =====");
                System.out.println("9:00 - 10:00  JAVA");
                System.out.println("10:00 - 11:00 OS");
                System.out.println("11:00 - 12:00 CN");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   DSA");
                System.out.println("2:00 - 3:00   DBMS");
                }
                break;
            case 5:{
                System.out.println("===== FRIDAY =====");
                System.out.println("9:00 - 10:00  DBMS");
                System.out.println("10:00 - 11:00 OS");
                System.out.println("11:00 - 12:00 Java");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   JAVA");
                System.out.println("2:00 - 3:00   CN");}
                break;
            case 6:{
                System.out.println("===== SATURDAY =====");
                System.out.println("9:00 - 10:00  DSA");
                System.out.println("10:00 - 11:00 OS");
                System.out.println("11:00 - 12:00 Java");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   DBMS");
                System.out.println("2:00 - 3:00   CN");
                }
                break;

            case 7:{


                System.out.println("===== SUNDAY =====");
                System.out.println("9:00 - 10:00  DSA");
                System.out.println("10:00 - 11:00 DBMS");
                System.out.println("11:00 - 12:00 CN");
                System.out.println("12:00 - 1:00  Lunch");
                System.out.println("1:00 - 2:00   OS");
                System.out.println("2:00 - 3:00   Java");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");


        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        showTimeTable(choice);

        
    }
}