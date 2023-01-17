import java.util.Scanner;

public class PizzaCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the group: ");
        int numPeople = scanner.nextInt();

        System.out.println("\nPizza sizes and costs per piece:");
        System.out.println("5 inch: $3 per piece");
        System.out.println("7 inch: $4 per piece");
        System.out.println("10 inch: $5 per piece");
        System.out.println("15 inch: $8 per piece");
        System.out.println("24 inch: $12 per piece");

        System.out.print("\nEnter the size of the pizza (in inches): ");
        int size = scanner.nextInt();

        double costPerPiece;
        if (size == 5) {
            costPerPiece = 3;
        } else if (size == 7) {
            costPerPiece = 4;
        } else if (size == 10) {
            costPerPiece = 5;
        } else if (size == 15) {
            costPerPiece = 8;
        } else if (size == 24) {
            costPerPiece = 12;
        } else {
            System.out.println("Invalid size. Please enter a valid size.");
            return;
        }

        System.out.print("Enter the number of pieces per person: ");
        int piecesPerPerson = scanner.nextInt();

        double totalCost = numPeople * piecesPerPerson * costPerPiece;
        System.out.println("\nTotal cost for the group: $" + totalCost);

        // Compare costs for all sizes and determine the lowest cost
        double cost5inch = 3 * piecesPerPerson;
        double cost7inch = 4 * piecesPerPerson;
        double cost10inch = 5 * piecesPerPerson;
        double cost15inch = 8 * piecesPerPerson;
        double cost24inch = 12 * piecesPerPerson;

        String lowestCostSize = "";
        double lowestCost = Double.MAX_VALUE;

        if (cost5inch < lowestCost) {
            lowestCost = cost5inch;
            lowestCostSize = "5 inch";
        }
        if (cost7inch < lowestCost) {
            lowestCost = cost7inch;
            lowestCostSize = "7 inch";
        }
        if (cost10inch < lowestCost) {
            lowestCost = cost10inch;
            lowestCostSize = "10 inch";
        }
        if (cost15inch < lowestCost) {
            lowestCost = cost15inch;
            lowestCostSize = "15 inch";
        }
        if (cost24inch < lowestCost) {
            lowestCost = cost24inch;
            lowestCostSize = "24 inch";
        }

        System.out.println("\nThe lowest cost for the group is the " + lowestCostSize + " pizza at $" + lowestCost + " per person.");
    }
}
