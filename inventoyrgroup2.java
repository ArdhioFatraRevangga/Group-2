import java.util.Scanner;
import java.util.Date;

public class inventoyrgroup2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Date date = new Date(); 
        String userName, pass, nameProduct;
        int incomingItems ;
        int totalStock = 0;

        // LOGIN
        System.out.println("=========LOGIN========");
        System.out.println("Enter your user name: ");
        userName = sc.nextLine();
        System.out.println("Enter your pass: ");
        pass = sc.nextLine();
        System.out.println("======================");
        System.out.println();
        System.out.println("============================================");
        System.out.println("        WELCOME TO INVENTORY MINIMARKET      ");
        System.out.println("                  MINIMARKET                ");
        System.out.println("============================================");
        System.out.println();

        // MANAJEMEN STOK
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("A. Stock Management System");
            System.out.println("B. Product Data Management");
            System.out.println("C. Order Management");
            System.out.print("Choose menu (A/B/C) : ");
            char chooseMenu = sc.next().charAt(0);

            switch (chooseMenu) {
                // MANAJEMENT SYSTEM
                case 'A':
                    System.out.println("=== Stock Management System ===");
                    System.out.println("Input Incoming Name Items: ");
                    sc.nextLine(); 
                    String items = sc.nextLine();
                    System.out.println("Input Total Items: ");
                    incomingItems = sc.nextInt();
                    System.out.println("Total Previous Items: ");
                    int totalItems = sc.nextInt();
                    totalStock = (incomingItems + totalItems); 
                    System.out.println("Total Stock: " + totalStock);
                    System.out.println();
                    // Tambahkan logika manajemen stok Anda di sini
                    break;

                // Add cases for other menu options (B, C) if needed
                //  Product Data Management
                case 'B': 
                    System.out.println("=== Product Data Managemen ===");
                    String [][] product = new String[4][2]; 
                    product [0][0] = "Milk";
                    product [0][1] = "Sugar"; 
                    product [1][0] = "Soap"; 
                    product [1][1] = "Tooth paste"; 
                    product [2][0] = "Snack";
                    product [2][1] = "Drink";
                    product [3][0] = "Bread"; 
                    product [3][1] = "Noodle"; 

                    for (int i = 0; i < product.length; i++) {
                        System.out.printf("%s \t %s\n", product[i][0], product[i][1]);
                    }
                            
                    System.out.println("Choose product name: ");
                    sc.nextLine();
                    String[][] expired = {
                        {"Milk", "10 October 2023", "10 December 2026"},
                        {"Soap", "13 October 2023", "13 December 2026"},
                        {"Snack", "29 November 2023", "29 November 2026"},
                        {"Bread", "12 November 2023", "20 November 2023"},
                        {"Sugar", "23 October 2023", "23 October 2026"},
                        {"Tooth paste", "21 May 2023", "21 May 2026"},
                        {"Drink", "15 July 2023", "15 July 2026"},
                        {"Noodle", "20 Juni 2023", "20 Juni 2024"},
                    };
                    nameProduct = sc.nextLine(); 

                    System.out.println("Milk, 10 October 2023, 10 December 2026");
                    System.out.println("Soap, 13 October 2023, 13 December 2026");
                    System.out.println("Snack, 29 November 2023, 29 November 2026");
                    System.out.println("Bread, 12 November 2023, 20 November 2023");
                    System.out.println("Sugar, 23 October 2023, 23 October 2026");
                    System.out.println("Tooth paste, 21 May 2023, 21 May 2026");
                    System.out.println("Drink, 15 July 2023, 15 July 2026");
                    System.out.println("Noodle, 20 Juni 2023, 20 Juni 2024");

                    break;
                
                default:
                    System.out.println("Invalid choice. Please choose A, B, or C.");
            }
        }
    }
}