import java.util.Scanner;

public class Inventory { 
    //inisialisasi disini bisa digunakan pada semua function
    static Scanner sc = new Scanner(System.in);
    static int totalStock = 0;
    static String nameProduct;
    static String newProduct;
    static int incomingItems = 0;
    static String[] products = {"Milk", "Sugar", "Soap", "Snack", "Bread", "Shampo", "Drink", "Noodle"};
    static int[] totalStocks = {20, 30, 10, 12, 29, 15, 26, 13};

    public static void main(String[] args) { 
        boolean loggedIn = login(); //digunakan untuk true false dari fungsi login

        if (loggedIn) {
            displayWelcomeMessage(); //memanggil function 

            boolean continueMenu = true; 

            while (continueMenu) {
                displayMenu(); //memanggil function
                char chooseMenu = sc.next().charAt(0);
                continueMenu = handleMenuChoice(chooseMenu); //untuk memanggil handlemenu
            }
        }
    }

    //LOGIN
    static boolean login() {
        String[] usernames = { "Karina", "Fatra" };
        String[] passwords = { "Staff1", "Staff2" };
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("================= LOGIN =================");
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            System.out.println("=========================================");

            for (int i = 0; i < usernames.length; i++) { //memanggil array
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    loggedIn = true;
                    System.out.println("        Login successful!      ");
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Incorrect username or password. Please try again!");
            }

            System.out.println("");
        }

        return loggedIn;
    }

    //WELCOME
    static void displayWelcomeMessage() {
        System.out.println("============================================");
        System.out.println("                 WELCOME TO                 ");
        System.out.println("            INVENTORY MINIMARKET            ");
        System.out.println("============================================\n");
    }

    //DISPLAY MENU
    static void displayMenu() {
        System.out.println("=================== MENU =====================");
        System.out.println("| A. Add New Product                         |");
        System.out.println("| B. Product Data Management                 |");
        System.out.println("| C. Stock Management System                 |");
        System.out.println("| D. Total Outgoing item                     |");
        System.out.println("| E. Exit                                    |");
        System.out.println("==============================================");
        System.out.print("Choose menu (A/B/C/D/E) : ");
        
    }
   
    //ITEM LIST
    static void displayItemList(Scanner input) {

        System.out.println("----------------------------------------------");
        System.out.println("||            List of Products:             ||");
        System.out.println("----------------------------------------------");
        System.out.println("|| [1.] Milk                                ||");
        System.out.println("|| [2.] Sugar                               ||");
        System.out.println("|| [3.] Soap                                ||");
        System.out.println("|| [4.] Snack                               ||");
        System.out.println("|| [5.] Bread                               ||");
        System.out.println("|| [6.] Tooth paste                         ||");
        System.out.println("|| [7.] Drink                               ||");
        System.out.println("|| [8.] Noodle                              ||");
        System.out.println("----------------------------------------------");

        System.out.print("Enter a new product: ");
        newProduct = sc.next();
        System.out.println("Item has been successfully added!");
    }

    //ADD NEW PRODUCT
    static void addNewProduct() {

        System.out.println("----------------------------------------------");
        System.out.println("||            List of Products:             ||");
        System.out.println("----------------------------------------------");
        System.out.println("|| [1.] Milk                                ||");
        System.out.println("|| [2.] Sugar                               ||");
        System.out.println("|| [3.] Soap                                ||");
        System.out.println("|| [4.] Snack                               ||");
        System.out.println("|| [5.] Bread                               ||");
        System.out.println("|| [6.] Shampo                              ||");
        System.out.println("|| [7.] Drink                               ||");
        System.out.println("|| [8.] Noodle                              ||");
        System.out.println("|| [9.] " + newProduct + "                              ||");
        System.out.println("----------------------------------------------");
        return;
    }

    //PRODUCT DATA
    static void productDataManagement() {

    System.out.println("Choose product name: ");
    String nameProduct = sc.next();
    boolean found = false;

        if (nameProduct.equals(nameProduct)) {
            found = true;
            displayProductDetails(nameProduct);
        }

    if (!found) {
        System.out.println("Invalid!");
    }
}

    //DISPLAY PRODUCT DATA
    static void displayProductDetails(String productName) {
        switch (productName) {
            case "Milk":
                System.out.println("Receipt date : 10 October 2023");
                System.out.println("Expired date : 20 January 2024");
                break;
            case "Sugar":
                System.out.println("Receipt date : 15 December 2023");
                System.out.println("Expired date : 14 January 2024");
                break;
            case "Soap":
                System.out.println("Receipt date : 15 February 2023");
                System.out.println("Expired date : 12 Mei 2025");
                break;
            case "Shampo":
                System.out.println("Receipt date : 12 Maret 2023");
                System.out.println("Expired date : 25 December 2025");
                break;
            case "Snack":
                System.out.println("Receipt date : 25 October 2023");
                System.out.println("Expired date : 16 Mei 2024");
                break;
            case "Drink":
                System.out.println("Receipt date : 25 January 2023");
                System.out.println("Expired date : 24 Juni 2024");
                break;
            case "Bread": 
                System.out.println("Receipt date : 12 Juli 2023");
                System.out.println("Expired date : 13 November 2023");
                break; 
            case "Noodle": 
                System.out.println("Receipt date : 23 September 2023");
                System.out.println("Expired date : 24 Juni 2024");
                break;
            default:
                System.out.println("Product details not available.");
        }
    }

    //INCOMING
    static void stockManagement(String []products,int []totalStocks) {
        System.out.println("========= Stock Management System =========");
    
        // Display current stock
        System.out.println("Current Stock:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + totalStocks[i]);
        }
    
        // Input incoming items
        System.out.println("Input Incoming Name Items: ");
        sc.nextLine();
        String incomingProduct = sc.nextLine();
    
        // Check if the incoming product is in the list
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(incomingProduct)) {
                index = i;
                break;
            }
        }
    
        if (index != -1) {
            // Input total items
            System.out.println("Input Total Items: ");
            int incomingItems = sc.nextInt();
    
            // Update total stock
            totalStocks[index] += incomingItems;
    
            // Display updated stock
            System.out.println("Updated Stock:");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " " + totalStocks[i]);
            }
        } else {
            System.out.println("Invalid product!");
        }
    
        System.out.println();
        return;
    }

    //OUTGOING
    static void totalOutgoingItem(String product[], int []totalStocks) {
    
        System.out.println("Enter name outgoing item: ");
        String itemName = sc.next();  
    
        System.out.println("Enter total outgoing item: ");
        int outgoing = sc.nextInt();
    
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(itemName)) {
                index = i;
                break;
            }
        }

        System.out.println("Updated Stock:"); //menampilkan stock awal product
            for (int i = 0; i < products.length; i++) {
                if (products[i].equalsIgnoreCase(itemName)) {
                    
                
                System.out.println(products[i] + " " + totalStocks[i]);
                }
            }
    
        if (index != -1) { //update stock terbaru
            totalStocks[index] -= outgoing;
            System.out.println("Updated Total Stock for " + products[index] + ": " + totalStocks[index] + "\n");
        } else {
            System.out.println("Invalid product!");
        }
    }

    //HANDLE MENU
     static boolean handleMenuChoice(char chooseMenu) { //digunakan untuk memanggil semua function
        switch (chooseMenu) {
            case 'A':
               displayItemList(sc);
               addNewProduct();
                break;
            case 'B':
                addNewProduct();
                productDataManagement();
                break;
            case 'C':
                stockManagement(products,totalStocks);
                break;
            case 'D':
                totalOutgoingItem(products,totalStocks);
                break;
            case 'E':
                System.out.println("================================");
                System.out.println("      Exiting the program!      ");
                System.out.println("           THANK YOU!           ");
                System.out.println("================================");
                return false;  
            default:
                System.out.println("Invalid choice. Please choose A, B, C, D, or E.\n");
                break;
        }
        return true;
    }

    }

//boolean digunakan untuk true false
