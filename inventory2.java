import java.util.Scanner;
import java.util.Date;

public class inventory2 {

    static Scanner sc = new Scanner(System.in);
 
    static String[] Log = {"Karina", "Fatra", "Dinova"};   
    static String[] pass = {"Staff1", "Staff2", "Staff3"};
    static String nameLog = "", passLog = "";
    static int userName = -1;
    static int totalStock = 0;

    static void Login() {
        System.out.println("=========LOGIN========");
        System.out.printf("Enter your user name: ");
        nameLog = sc.nextLine();
        for (int i = 0; i < Log.length; i++) {
            if (nameLog.equals(Log[i])) {
                userName = i;
                break;
            }
        }
        System.out.print("Input Password : ");
        passLog = sc.next();
        if (userName == -1) {
         
            System.out.println("wrong userName or password ");
            Login();
        }
        if (passLog.equals(pass[userName])) {
            
        } else {
            System.out.print("\033[H\033[2J");
            System.out.println("wrong username or password");
    }
    }
    static void Input(){
        System.out.println("Enter your pass: ");
        passLog = sc.next();
        System.out.println("======================");
        System.out.println();
        System.out.println("============================================");
        System.out.println("        WELCOME TO INVENTORY MINIMARKET      ");
        System.out.println("                  MINIMARKET                ");
        System.out.println("============================================");
        System.out.println();
    }

    public static void main(String[] args) {
        Login();
    }
    
}