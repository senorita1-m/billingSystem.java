import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------- BILLING SYSTEM ---------");

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter price of one item: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;        // Total without GST
        double gst = total * 0.05;         // 5% GST
        double finalAmount = total + gst;  // Final bill with GST

        System.out.println("\n----------- BILL DETAILS -----------");
        System.out.println("Item: " + item);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total (without GST): ₹" + total);
        System.out.println("GST (5%): ₹" + gst);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
        System.out.println("------------------------------------");
    }
}
