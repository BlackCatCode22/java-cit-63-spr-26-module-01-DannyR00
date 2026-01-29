public class VarsAndMath {
    public static void main(String[] args) {
        // 1. Variable Declaration and Initialization
        String itemName = "Widget";
        int quantity = 5;
        double pricePerUnit = 19.99;
        double taxRate = 0.08; // 8% tax

        // 2. Arithmetic Operations
        double subtotal = quantity * pricePerUnit;
        double taxAmount = subtotal * taxRate;
        double finalTotal = subtotal + taxAmount;

        // 3. String Concatenation and Output
        System.out.println("Receipt for: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + pricePerUnit);
        System.out.println("---------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Total Cost: $" + finalTotal);
    }
}