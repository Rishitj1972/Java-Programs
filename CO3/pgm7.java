// Bill Program

import java.util.*;

interface BillCalculator {
    double calculate();
}

class Product implements BillCalculator {
    int p_id, qnty, price;
    String name;

    Product(int p_id, String name, int qnty, int price) {
        this.p_id = p_id;
        this.qnty = qnty;
        this.price = price;
        this.name = name;
    }

    public double calculate() {
        return qnty * price;
    }

    void display() {
        System.out.printf("%-12d%-8s%-12d%-15d%-10.2f\n", p_id, name, qnty, price, calculate());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = ob.nextInt();
        Product[] p = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            System.out.print("Enter the Product ID: ");
            int p_id = ob.nextInt();
            ob.nextLine();  
            System.out.print("Enter the Product Name: ");
            String name = ob.nextLine();
            System.out.print("Enter the Quantity: ");
            int qnty = ob.nextInt();
            System.out.print("Enter the Unit Price: ");
            int price = ob.nextInt();

            p[i] = new Product(p_id, name, qnty, price);
        }

        System.out.printf("%-12s%-8s%-12s%-15s%-10s\n", "Product Id", "Name", "Quantity", "Unit Price", "Total");
        System.out.println("---------------------------------------------------------------");

        double netAmount = 0;
        for (int i = 0; i < n; i++) {
            p[i].display();
            netAmount += p[i].calculate();
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-47s%-10.2f\n", "Net Amount:", netAmount);
    }
}
