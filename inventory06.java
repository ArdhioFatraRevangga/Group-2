import java.util.Scanner;
public class inventory06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String NameIncomingItems, NameOutcomingItems;
            int totalIncomingItems, totalOutcomingItems, totalInItems, totalOutItems, totalItems=0;
            

            System.out.println("Name Of In Items: ");
            NameIncomingItems=input.nextLine();

            System.out.println("Total Incoming Items to Inventory: ");
            totalIncomingItems=input.nextInt();
            
            input.nextLine();

            System.out.println("Total outcoming item: ");
            totalOutcomingItems=input.nextInt();

            totalItems=totalIncomingItems-totalOutcomingItems;
            System.out.println(" Total pengeluaran barang dari inventory:"+totalItems);

        }

 }
}